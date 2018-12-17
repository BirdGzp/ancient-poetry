package com.moon.ancientpoetry.user.core.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.user.core.service.UserBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/basic")
public class UserBasicController {
    @Autowired
    UserBasicService userBasicService;

    @ResponseBody
    @GetMapping("/list/full/{pageNum}/{pageSize}")
    public PageInfo listFullUserBasic(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return userBasicService.listFullUserBasic(pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/get/full/{userId}")
    public UserBasic getUserFullBasicByUserId(
            @PathVariable(name = "userId", required = false) Integer userId){
        long time  = System.currentTimeMillis();
        UserBasic ub = userBasicService.getUserFullBasicByUserId(userId);
        System.out.println(System.currentTimeMillis() - time);
        return ub;
    }

    @ResponseBody
    @GetMapping("/get/brief/id/{userId}")
    public UserBasic getUserBriefBasicByUserId(
            @PathVariable(name = "userId", required = false) Integer userId){
        return userBasicService.getUserBriefBasicByUserId(userId);
    }

    @ResponseBody
    @GetMapping("/get/brief/telephone/{telephone}")
    public UserBasic getUserBriefBasicByTelephone(
            @PathVariable(name = "telephone", required = false) String telephone){
        return userBasicService.getUserBriefBasicByTelephone(telephone);
    }

    @ResponseBody
    @GetMapping("/get/checkInfo/telephone/{telephone}")
    public UserBasic getCheckInfoByTelephone(
            @PathVariable(name = "telephone", required = false) String telephone){
        return userBasicService.getCheckInfoByTelephone(telephone);
    }

    @ResponseBody
    @GetMapping("/get/checkInfo/email/{email}")
    public UserBasic getCheckInfoByEmail(
            @PathVariable(name = "email", required = false) String email){
        return userBasicService.getCheckInfoByEmail(email);
    }

    @ResponseBody
    @GetMapping("/update/batch/{listUserBasic}")
    public int updateBatchUserBasic(
            @PathVariable(name = "listUserBasic", required = false) String listUserBasic){
        return userBasicService.updateBatchUserBasic(JSON.parseObject(listUserBasic, new TypeReference<List<UserBasic>>(){}));
    }

    @ResponseBody
    @GetMapping("/update/{userBasic}")
    public int updateUserBasic(
            @PathVariable(name = "userBasic", required = false) String userBasic){
        return userBasicService.updateUserBasic(JSON.parseObject(userBasic, UserBasic.class));
    }


    @ResponseBody
    @GetMapping("/insert/{userBasic}")
    public int insertUserBasic(
            @PathVariable(name = "userBasic", required = false) String userBasic){
        return userBasicService.insertUserBasic(JSON.parseObject(userBasic, UserBasic.class));
    }
}