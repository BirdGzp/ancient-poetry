package com.moon.ancientpoetry.user.core.controller;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.user.core.service.UserSeriveImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserSeriveImpl userSerive;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public UserBasic insertUser(){
        return userSerive.insertUser();
    }
}
