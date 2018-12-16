package com.moon.ancientpoetry.user.web.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/14 19:11
 * @Description:
 */
@Component
public class RedisCacheUtil {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 默认过期时长，单位：秒
     */
    public static final long DEFAULT_EXPIRE = 60 * 60 * 24;

    /**
     * 不设置过期时长
     */
    public static final long NOT_EXPIRE = -1;


    //这样该方法支持多种数据类型
    public void set(String key , Object object, Long time){
        //开启事务权限
        stringRedisTemplate.setEnableTransactionSupport(true);
        try {
            //开启事务
            stringRedisTemplate.multi();

            String argString =(String)object;  //强转下
            stringRedisTemplate.opsForValue().set(key, argString);

            //成功就提交
            stringRedisTemplate.exec();
        } catch (Exception e) {
            //失败了就回滚
            stringRedisTemplate.discard();

        }
        if (object instanceof String ) {  //判断下是String类型不
            String argString =(String)object;  //强转下
            //存放String类型的
            stringRedisTemplate.opsForValue().set(key, argString);
        }
        //如果存放Set类型
        if (object instanceof Set) {
            Set<String> valueSet =(Set<String>)object;
            for(String string:valueSet){
                stringRedisTemplate.opsForSet().add(key, string);  //此处点击下源码看下 第二个参数可以放好多
            }
        }
        //设置有效期
        if (time != null) {
            stringRedisTemplate.expire(key, time, TimeUnit.SECONDS);
        }

    }

    //做个封装
    public void setString(String key, Object object){
        String argString =(String)object;  //强转下
        //存放String类型的
        stringRedisTemplate.opsForValue().set(key, argString);
    }
    public void setSet(String key, Object object){
        Set<String> valueSet =(Set<String>)object;
        for(String string:valueSet){
            stringRedisTemplate.opsForSet().add(key, string);  //此处点击下源码看下 第二个参数可以放好多
        }
    }

    public String getString(String key){
        return    stringRedisTemplate.opsForValue().get(key);
    }


    public boolean existsKey(String key) {
        return stringRedisTemplate.hasKey(key);
    }

    /**
     * 删除key
     *
     * @param key
     */
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }


    /**
     * 删除多个key
     *
     * @param keys
     */
    public void remove(String... keys) {
        Set<String> kSet = Stream.of(keys).map(k -> k).collect(Collectors.toSet());
        stringRedisTemplate.delete(kSet);
    }


    /**
     * 将key设置为永久有效
     *
     * @param key
     */
    public void persistKey(String key) {
        stringRedisTemplate.persist(key);
    }

    /**
     * 指定key在指定的日期过期
     *
     * @param key
     * @param date
     */
    public void expireKeyAt(String key, Date date) {
        stringRedisTemplate.expireAt(key, date);
    }

}