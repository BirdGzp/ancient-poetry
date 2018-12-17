package com.moon.ancientpoetry.user.web.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.moon.ancientpoetry.user.web.cache.CaffeineCacheUtils;
import com.moon.ancientpoetry.user.web.cache.RedisCacheUtil;
import com.moon.ancientpoetry.user.web.dto.User;
import com.moon.ancientpoetry.user.web.service.UserService;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/14 19:56
 * @Description:
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private CaffeineCacheUtils caffeineCacheUtils;
    @Autowired
    private RedisCacheUtil redisService;

    private String cachename ="userCache";

    public User getUser(Long id){
        //先查询一级缓存  key以当前的类名+方法名+id+参数值
        String key = this.getClass().getName() + "-" + Thread.currentThread().getStackTrace()[1].getMethodName()
                + "-id:" + id;
        //查询一级缓存数据有对应值的存在 如果有 返回
        String result = caffeineCacheUtils.get(cachename, key);
        System.out.println(key + ": " + result);
        JSONObject jsonObject = new JSONObject();//用的fastjson
        User user = jsonObject.parseObject(result, User.class);
        User resultUser = null;
        if(user != null) {
            System.out.println(user.getUserId());
           // resultUser = jsonObject.parseObject(user.toString(), User.class);
        }
        if (user != null) {
            System.out.println("key"+key+",直接从一级缓存获取数据"+user.toString());
            return resultUser;
        }
        //一级缓存没有对应的值存在,接着查询二级缓存
        // redis存对象的方式  json格式 然后反序列号
        String userJson = redisService.getString(key);
        //如果rdis缓存中有这个对应的值，修改一级缓存    最下面的会有的 相同会覆盖的
        if (!StringUtil.isNullOrEmpty(userJson)) {  //有 转成json
            resultUser = jsonObject.parseObject(userJson,User.class);
            caffeineCacheUtils.set(cachename, key, resultUser);
            return resultUser;
        }
        //都没有 查询DB
        User user1 = new User();
        user1.setUserId(1);
        if (user1 == null) {
            return null;
        }
        //存放到二级缓存 redis中
        redisService.setString(key, new JSONObject().toJSONString(user1));
        //存放到一级缓存 Ehchache
        caffeineCacheUtils.set(cachename, key, user1);
        return user1;
    }



}
