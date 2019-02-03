package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserDetail;
import com.moon.ancientpoetry.user.core.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:12
 * @Description:
 */
@RestController
@RequestMapping("/user/detail")
public class UserDetailController {
    @Autowired
    UserDetailService userDetailService;

    @ResponseBody
    @PostMapping("/get/full/{userId}")
    public BaseDto getUserFullDetailByUserId(
            @PathVariable(name = "userId", required = false) Integer userId){
        return new BaseDto(ObjectType.OBJECT, userDetailService.getUserFullDetailByUserId(userId));
    }

    @ResponseBody
    @PostMapping("/get/{userId}")
    public BaseDto getUserDetailByUserId(
            @PathVariable(name = "userId", required = false) Integer userId){
        UserDetail userDetail = userDetailService.getUserDetailByUserId(userId);
        if(userDetail == null){
            return  new BaseDto(ObjectType.NULL, userDetail);
        }
        return new BaseDto(ObjectType.OBJECT, userDetail);
    }

    @ResponseBody
    @PostMapping("/update/batch/{listUserDetail}")
    public BaseDto updateBatchUserDetail(
            @PathVariable(name = "listUserDetail", required = false) String listUserDetail){
        return new BaseDto(ObjectType.OBJECT, userDetailService.updateBatchUserDetail(
                JSON.parseObject(listUserDetail, new TypeReference<List<UserDetail>>(){})));
    }

    @ResponseBody
    @PostMapping("/update/{userDetail}")
    public BaseDto updateUserDetail(@RequestBody UserDetail userDetail){
        return new BaseDto(ObjectType.OBJECT, userDetailService.updateUserDetail(userDetail));
    }

    @ResponseBody
    @PostMapping("/insert/{userDetail}")
    public BaseDto insertUserDetail(@RequestBody UserDetail userDetail){
        return new BaseDto(ObjectType.OBJECT, userDetailService.insertUserDetail(userDetail));
    }

}
