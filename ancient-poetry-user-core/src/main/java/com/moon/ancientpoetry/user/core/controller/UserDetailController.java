package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
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
    @GetMapping("/get/full/{userId}")
    public UserDetail getUserFullDetailByUserId(
            @PathVariable(name = "userId", required = false) Integer userId){
        return userDetailService.getUserFullDetailByUserId(userId);
    }

    @ResponseBody
    @GetMapping("/get/{userId}")
    public UserDetail getUserDetailByUserId(
            @PathVariable(name = "userId", required = false) Integer userId){
        return userDetailService.getUserDetailByUserId(userId);
    }

    @ResponseBody
    @GetMapping("/update/batch/{listUserDetail}")
    public int updateBatchUserDetail(
            @PathVariable(name = "listUserDetail", required = false) String listUserDetail){
        return userDetailService.updateBatchUserDetail(JSON.parseObject(listUserDetail, new TypeReference<List<UserDetail>>(){}));
    }

    @ResponseBody
    @GetMapping("/update/{userDetail}")
    public int updateUserDetail(
            @PathVariable(name = "userDetail", required = false) String userDetail){
        return userDetailService.updateUserDetail(JSON.parseObject(userDetail, UserDetail.class));
    }

    @ResponseBody
    @GetMapping("/insert/{userDetail}")
    public int insertUserDetail(
            @PathVariable(name = "userDetail", required = false) String userDetail){
        return userDetailService.insertUserDetail(JSON.parseObject(userDetail, UserDetail.class));
    }

}
