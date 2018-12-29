package com.moon.ancientpoetry.user.web.controller;

import com.alibaba.fastjson.JSON;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.user.web.dto.UserDto;
import com.moon.ancientpoetry.user.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/id/{id}")
    public String getUserId(@PathVariable(name = "id")Integer id){
        return JSON.toJSONString(userService.getFullUserByUserId(id));

    }

    @PostMapping("/get/check-result/{accountId}/{password}")
    public String getPasswordCheckResult(@PathVariable(name = "accountId")String accountId, @PathVariable(name = "password")String password, String ip){
        UserBasic userBasic = userService.getPasswordCheckResult(accountId, password);
        if(userBasic != null){
            return JSON.toJSONString(new BaseDto(ObjectType.OBJECT, userBasic));
        }else {
            return JSON.toJSONString(new BaseDto(ObjectType.NULL));
        }
    }

    @RequestMapping("/get/check-info/email/{email}")
    public String getCheckInfoByEmail(@PathVariable(name = "email")String email){
        return JSON.toJSONString(userService.getUserCheckInfoByEmail(email));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Integer insertUser(@RequestBody UserDto userDto){
        return userService.insertUser(userDto);
    }

}