package com.moon.ancientpoetry.user.core.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.user.core.service.UserBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/basic")
public class UserBasicController {

    @Value("${server.port}")
    private int port;

    @Autowired
    UserBasicService userBasicService;

    @ResponseBody
    @PostMapping("/list/full/{pageNum}/{pageSize}")
    public BaseDto listFullUserBasic(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, userBasicService.listFullUserBasic(pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/get/full/{userId}")
    public BaseDto getUserFullBasicByUserId(
            @PathVariable(name = "userId", required = false) Integer userId){
        long time  = System.currentTimeMillis();
        UserBasic ub = userBasicService.getUserFullBasicByUserId(userId);
        ub.setPenName("浪子");
        System.out.println("port: " + port +" --->" + (System.currentTimeMillis() - time));
        return new BaseDto(ObjectType.OBJECT, ub);
    }


    @ResponseBody
    @PostMapping("/get/brief/id/{userId}")
    public BaseDto getUserBriefBasicByUserId(
            @PathVariable(name = "userId", required = false) Integer userId){
        return new BaseDto(ObjectType.OBJECT, userBasicService.getUserBriefBasicByUserId(userId));
    }

    @ResponseBody
    @PostMapping("/get/brief/telephone/{telephone}")
    public BaseDto getUserBriefBasicByTelephone(
            @PathVariable(name = "telephone", required = false) String telephone){
        return new BaseDto(ObjectType.OBJECT, userBasicService.getUserBriefBasicByTelephone(telephone));
    }

    @ResponseBody
    @PostMapping("/get/check-info/telephone/{telephone}")
    public BaseDto getCheckInfoByTelephone(
            @PathVariable(name = "telephone", required = false) String telephone){
        return new BaseDto(ObjectType.OBJECT, userBasicService.getCheckInfoByTelephone(telephone));
    }

    @ResponseBody
    @PostMapping("/get/check-info/email/{email}")
    public BaseDto getCheckInfoByEmail(
            @PathVariable(name = "email", required = false) String email){
        return new BaseDto(ObjectType.OBJECT, userBasicService.getCheckInfoByEmail(email));
    }


    @ResponseBody
    @PostMapping("/update/{userBasic}")
    public BaseDto updateUserBasic(
            @PathVariable(name = "userBasic", required = false) String userBasic){
        return new BaseDto(ObjectType.OBJECT, userBasicService.updateUserBasic(JSON.parseObject(userBasic, UserBasic.class)));
    }


    @ResponseBody
    @PostMapping("/insert/{userBasic}")
    public BaseDto insertUserBasic(
            @PathVariable(name = "userBasic", required = false) String userBasic){
        return new BaseDto(ObjectType.OBJECT, userBasicService.insertUserBasic(JSON.parseObject(userBasic, UserBasic.class)));
    }
}