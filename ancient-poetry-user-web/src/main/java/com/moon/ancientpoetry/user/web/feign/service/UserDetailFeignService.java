package com.moon.ancientpoetry.user.web.feign.service;

import com.moon.ancientpoetry.common.po.UserDetail;
import com.moon.ancientpoetry.user.web.feign.fallback.UserDetailFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:44
 * @Description:
 */
@FeignClient(value = "ALL-IN-CORE", fallback = UserDetailFeignServiceFallback.class)
public interface UserDetailFeignService {
    
    @RequestMapping(value = "/user/detail/get/full/{userId}", method = RequestMethod.POST)
    String getUserFullDetailByUserId(
            @PathVariable(name = "userId", required = false) Integer userId);

    
    @RequestMapping(value = "/user/detail/get/{userId}", method = RequestMethod.POST)
    String getUserDetailByUserId(
            @PathVariable(name = "userId", required = false) Integer userId);

    
    @RequestMapping(value = "/user/detail/update/batch/{listUserDetail}", method = RequestMethod.POST)
    String updateBatchUserDetail(
            @PathVariable(name = "listUserDetail", required = false) String listUserDetail);
    
    @RequestMapping(value = "/user/detail/update", method = RequestMethod.POST)
    String updateUserDetail(@RequestBody UserDetail userDetail);


    @RequestMapping(value = "/user/detail/insert", method = RequestMethod.POST)
    String insertUserDetail(@RequestBody UserDetail userDetail);
}
