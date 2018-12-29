package com.moon.ancientpoetry.web.feign.service;

import com.moon.ancientpoetry.web.dto.UserDto;
import com.moon.ancientpoetry.web.feign.fallback.UserFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 18:02
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-USER-WEB", fallback = UserFeignServiceFallback.class)
public interface UserFeignService {
    @RequestMapping("/user/id/{id}")
    String getUserId(@PathVariable(name = "id")Integer id);

    @PostMapping("/user/get/check-result/{accountId}/{password}")
    String getPasswordCheckResult(@PathVariable(name = "accountId")String accountId, @PathVariable(name = "password")String password, String ip);

    @PostMapping("/user/get/check-info/email/{email}")
    String getCheckInfoByEmail(@PathVariable(name = "email")String email);

    @PostMapping(value = "/user/insert")
    Integer insertUser(@RequestBody UserDto userDto);

}
