package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.UserTimeLine;
import com.moon.ancientpoetry.user.core.service.UserTimeLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:14
 * @Description:
 */
@RestController
@RequestMapping("/user/detail")
public class UserTimeLineController {
    @Autowired
    UserTimeLineService userTimeLineService;

    @ResponseBody
    @GetMapping("/list/event-type/{eventType}/user/{userId}/{pageNum}/{pageSize}")
    public PageInfo<UserTimeLine> listUserTimeLineByUserIdAndEventStateOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "eventType", required = false) Byte eventType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize) {
        return userTimeLineService.listUserTimeLineByUserIdAndEventStateOrderByTime(userId, eventType, pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/user/{userId}/{pageNum}/{pageSize}")
    public PageInfo<UserTimeLine> listUserTimeLineByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize) {
        return userTimeLineService.listUserTimeLineByUserIdOrderByTime(userId, pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/get/event/{eventId}")
    public UserTimeLine listUserTimeLineByUserIdOrderByTime(
            @PathVariable(name = "eventId", required = false) Integer eventId) {
        return userTimeLineService.getUserTimeLineByEventId(eventId);
    }

    @ResponseBody
    @GetMapping("/update/batch/{listUserTimeLine}")
    public int updateBatchUserTimeLine(
            @PathVariable(name = "listUserTimeLine", required = false) String listUserTimeLine){
        return userTimeLineService.updateBatchUserTimeLine(JSON.parseObject(listUserTimeLine, new TypeReference<List<UserTimeLine>>(){}));
    }

    @ResponseBody
    @GetMapping("/update/{userTimeLine}")
    public int updateUserTimeLine(
            @PathVariable(name = "userTimeLine", required = false) String userTimeLine){
        return userTimeLineService.updateUserTimeLine(JSON.parseObject(userTimeLine, UserTimeLine.class));
    }

    @ResponseBody
    @GetMapping("/update/batch/{listUserTimeLine}")
    public int insertBatchUserTimeLine(
            @PathVariable(name = "listUserTimeLine", required = false) String listUserTimeLine){
        return userTimeLineService.insertBatchUserTimeLine(JSON.parseObject(listUserTimeLine, new TypeReference<List<UserTimeLine>>(){}));
    }

    @ResponseBody
    @GetMapping("/insert/{userTimeLine}")
    public int insertUserTimeLine(
            @PathVariable(name = "userTimeLine", required = false) String userTimeLine){
        return userTimeLineService.insertUserTimeLine(JSON.parseObject(userTimeLine, UserTimeLine.class));
    }
}