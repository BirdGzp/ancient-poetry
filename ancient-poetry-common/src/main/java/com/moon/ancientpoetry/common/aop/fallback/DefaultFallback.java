package com.moon.ancientpoetry.common.aop.fallback;

import java.lang.annotation.*;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 13:57
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DefaultFallback {
}
