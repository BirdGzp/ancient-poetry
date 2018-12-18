package com.moon.ancientpoetry.common.cache;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/18 15:57
 * @Description:
 */
@Aspect
@Component
public class RedisEvitAop {
    Logger log = LoggerFactory.getLogger(RedisEvitAop.class);

    @Autowired
    RedisService redisService;

    @Around(value = "execution(public * com..service.impl..*.update*(..)) && @annotation(RedisSet)")
    public Object rediseEvit(ProceedingJoinPoint proceedingJoinPoint){

        return null;
    }
}
