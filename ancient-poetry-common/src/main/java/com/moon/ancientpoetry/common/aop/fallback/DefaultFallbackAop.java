package com.moon.ancientpoetry.common.aop.fallback;

import com.alibaba.fastjson.JSON;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 13:59
 * @Description:   默认的降级处理 切面类
 */
@Aspect
@Component
public class DefaultFallbackAop {
    Logger log = LoggerFactory.getLogger(DefaultFallbackAop.class);

    @Around(value = "execution(public * com..feign.fallback..*.*(..))")
    public Object defaultFallback(ProceedingJoinPoint proceedingJoinPoint){
        Signature signature = proceedingJoinPoint.getSignature();
        signature.getDeclaringType().isAnnotationPresent(DefaultFallback.class);
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        if(result != null){
            return result;
        }
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(args.length);
        StringBuilder stringBuilder = null;
        if (args != null && args.length > 0 ) {
            //拿到service 名字的前缀——POJO对象名
            stringBuilder = new StringBuilder(signature.getDeclaringTypeName() + "#" + signature.getName() + " : ");
            for(Object object:args) {
                System.out.println(object);
                stringBuilder.append(" ").append(object);
            }
        }
        return  JSON.toJSONString(new BaseDto(ObjectType.ERROR, stringBuilder.toString()));
    }
}
