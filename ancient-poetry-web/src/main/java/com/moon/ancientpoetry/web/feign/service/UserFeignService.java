package com.moon.ancientpoetry.web.feign.service;

import com.moon.ancientpoetry.web.feign.fallback.UserFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 18:02
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-USER-WEB", fallback = UserFeignServiceFallback.class)
public interface UserFeignService {

}
