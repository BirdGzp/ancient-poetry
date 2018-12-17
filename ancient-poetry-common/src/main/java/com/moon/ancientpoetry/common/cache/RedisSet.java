package com.moon.ancientpoetry.common.cache;

import java.lang.annotation.*;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/17 19:18
 * @Description:
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RedisSet {
}
