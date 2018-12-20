package com.moon.ancientpoetry.user.web.feign.service;

import com.moon.ancientpoetry.user.web.feign.fallback.UserBasicFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:44
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-USER-CORE", fallback = UserBasicFeignServiceFallback.class)
public interface UserBasicFeignService {
    @RequestMapping(value = "/user/basic/get/full/{id}", method = RequestMethod.GET)
    String getUserBasic(@PathVariable(value = "id") Integer name);
}
