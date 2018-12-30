package com.moon.ancientpoetry.web.feign.user.service;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.web.feign.user.fallback.UserBasicFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:44
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-USER-CORE", fallback = UserBasicFeignServiceFallback.class)
public interface UserBasicFeignService {
    @RequestMapping(value = "/user/basic/get/full/{id}", method = RequestMethod.POST)
    String getUserBasicByUserId(@PathVariable(value = "id") Integer id);

    @RequestMapping(value = "/user/basic/list/full/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listFullUserBasic(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/user/basic/get/full/{userId}", method = RequestMethod.POST)
    String getUserFullBasicByUserId(@PathVariable(name = "userId", required = false) Integer userId);

    
    @RequestMapping(value = "/user/basic/get/brief/id/{userId}", method = RequestMethod.POST)
    String getUserBriefBasicByUserId(
            @PathVariable(name = "userId", required = false) Integer userId);

    
    @RequestMapping(value = "/user/basic/get/brief/telephone/{telephone}", method = RequestMethod.POST)
    String getUserBriefBasicByTelephone(
            @PathVariable(name = "telephone", required = false) String telephone);

    
    @RequestMapping(value = "/user/basic/get/check-info/telephone/{telephone}", method = RequestMethod.POST)
    String getCheckInfoByTelephone(
            @PathVariable(name = "telephone", required = false) String telephone);
    
    @RequestMapping(value = "/user/basic/get/check-info/email/{email}", method = RequestMethod.POST)
    String getCheckInfoByEmail(@PathVariable(name = "email", required = false) String email);


    @RequestMapping(value = "/user/basic/update", method = RequestMethod.POST)
    String updateUserBasic(@RequestBody UserBasic userBasic);


    @RequestMapping(value = "/user/basic/insert/", method = RequestMethod.POST)
    String insertUserBasic(@RequestBody UserBasic userBasic);

    @PostMapping("/user/basic/get/check-result/{accountId}/{ip}")
    String getPasswordCheckResult(@PathVariable(name = "accountId")String accountId, @RequestBody String password, @PathVariable(name = "ip") String ip);
}
