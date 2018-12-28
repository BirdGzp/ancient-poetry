package com.moon.ancientpoetry.user.web.controller;

import com.alibaba.fastjson.JSON;
import com.moon.ancientpoetry.user.web.service.UserService;
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
    UserService userService;

    @RequestMapping("/id/{id}")
    public String getUserId(@PathVariable(name = "id")Integer id){
        return JSON.toJSONString(userService.getFullUserByUserId(id));

    }

    @RequestMapping("/get/check-info/telephone/{telephone}")
    public String getCheckInfoByTelephone(@PathVariable(name = "telephone")String telephone){
        return JSON.toJSONString(userService.getUserCheckInfoByTelephone(telephone));
    }

    @RequestMapping("/get/check-info/email/{email}")
    public String getCheckInfoByEmail(@PathVariable(name = "email")String email){
        return JSON.toJSONString(userService.getUserCheckInfoByEmail(email));
    }

}