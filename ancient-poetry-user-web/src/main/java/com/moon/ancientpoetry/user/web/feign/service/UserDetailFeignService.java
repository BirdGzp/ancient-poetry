package com.moon.ancientpoetry.user.web.feign.service;

import com.moon.ancientpoetry.user.web.feign.fallback.UserDetailFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:44
 * @Description:
 */
@FeignClient(value = "ALL-IN-CORE", fallback = UserDetailFeignServiceFallback.class)
public interface UserDetailFeignService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
