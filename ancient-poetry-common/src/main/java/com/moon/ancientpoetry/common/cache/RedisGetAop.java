package com.moon.ancientpoetry.common.cache;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Author: zhipeng gong
 * @Date: 2018/12/17 19:21
 * @Description: Redis查询缓存切面
 */
@Aspect
@Component
public class RedisGetAop {
    Logger log = LoggerFactory.getLogger(RedisGetAop.class);

    /** redis中保存的时间 */
    public static final long EXPIRE = 1000 * 60;

    @Autowired
    RedisService redisService;

    @Around(value = "execution(public * com..service.impl..*.get*(..)) && @annotation(RedisSet)")
    public Object redisSet(ProceedingJoinPoint proceedingJoinPoint){
        Signature signature = proceedingJoinPoint.getSignature();
        Object[] args = proceedingJoinPoint.getArgs();
        //redis 键
        String key = null;
        //表名
        String POJOName = null;
        //拼接参数
        if (args != null && args.length > 0 ) {
            //拿到service 名字的前缀——POJO对象名
            StringBuilder stringBuilder = new StringBuilder(signature.getDeclaringTypeName().substring(signature.getDeclaringTypeName().
                    lastIndexOf('.') + 1, signature.getDeclaringTypeName().indexOf("ServiceI")));
            POJOName = stringBuilder.toString();
            stringBuilder.append("_").append(signature.getName());
            for(Object object:args) {
                stringBuilder.append("_").append(object);
            }
            key = stringBuilder.toString();

        }

        Object cacheResult = redisService.getValue(key);
        //redis 不存在值,执行方法，拿到值，并缓存起来
        if(cacheResult == null){
            String methodResult  = null;
            try {
                //执行方法
                methodResult = JSONObject.toJSONString(proceedingJoinPoint.proceed());
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }

            //数据库不存在
            if(methodResult == null){
                log.info("redis 中不存在， 查询数据库返回结果，且查询结果为 null");
                redisService.setValue(key, "", EXPIRE);
                try {
                    return JSON.parseObject(methodResult, Class.forName("com.moon.ancientpoetry.common.po." + POJOName));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

            log.info("redis 中不存在，数据库存在查询结果");
            redisService.setValue(key, methodResult, EXPIRE);

            try {
                return JSON.parseObject(methodResult, Class.forName("com.moon.ancientpoetry.common.po." + POJOName));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        log.info("redis 中命中结果");
        try {
            return JSON.parseObject(cacheResult.toString(), Class.forName("com.moon.ancientpoetry.common.po." + POJOName));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }

}
