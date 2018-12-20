package com.moon.ancientpoetry.user.web.controller;

import com.moon.ancientpoetry.user.web.dto.User;
import com.moon.ancientpoetry.user.web.feign.service.UserBasicFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/14 20:02
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserBasicFeignService userBasicFeignService;

    @RequestMapping("/id/{id}")
    public String getUserId(@PathVariable(name = "id")Integer id){
        return userBasicFeignService.getUserBasic(id);
    }


}