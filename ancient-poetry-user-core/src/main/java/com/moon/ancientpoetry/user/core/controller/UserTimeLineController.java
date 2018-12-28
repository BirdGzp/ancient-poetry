package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
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
@RequestMapping("/user-time-line")
public class UserTimeLineController {
    @Autowired
    UserTimeLineService userTimeLineService;

    @ResponseBody
    @PostMapping("/list/event-type/{eventType}/user/{userId}/{pageNum}/{pageSize}")
    public BaseDto<UserTimeLine> listUserTimeLineByUserIdAndEventStateOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "eventType", required = false) Byte eventType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize) {
        return new BaseDto(ObjectType.OBJECT, userTimeLineService.
                listUserTimeLineByUserIdAndEventStateOrderByTime(userId, eventType, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/user/{userId}/{pageNum}/{pageSize}")
    public BaseDto<UserTimeLine> listUserTimeLineByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize) {
        return new BaseDto(ObjectType.OBJECT, userTimeLineService.
                listUserTimeLineByUserIdOrderByTime(userId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/get/event/{eventId}")
    public BaseDto listUserTimeLineByUserIdOrderByTime(
            @PathVariable(name = "eventId", required = false) Integer eventId) {
        return new BaseDto(ObjectType.OBJECT, userTimeLineService.getUserTimeLineByEventId(eventId));
    }

    @ResponseBody
    @PostMapping("/update/batch/{listUserTimeLine}")
    public BaseDto updateBatchUserTimeLine(
            @PathVariable(name = "listUserTimeLine", required = false) String listUserTimeLine){
        return new BaseDto(ObjectType.OBJECT, userTimeLineService.
                updateBatchUserTimeLine(JSON.parseObject(listUserTimeLine, new TypeReference<List<UserTimeLine>>(){})));
    }

    @ResponseBody
    @PostMapping("/update/{userTimeLine}")
    public BaseDto updateUserTimeLine(
            @PathVariable(name = "userTimeLine", required = false) String userTimeLine){
        return new BaseDto(ObjectType.OBJECT, userTimeLineService.updateUserTimeLine(
                JSON.parseObject(userTimeLine, UserTimeLine.class)));
    }

    @ResponseBody
    @PostMapping("/insert/batch/{listUserTimeLine}")
    public BaseDto insertBatchUserTimeLine(
            @PathVariable(name = "listUserTimeLine", required = false) String listUserTimeLine){
        return new BaseDto(ObjectType.OBJECT, userTimeLineService.
                insertBatchUserTimeLine(JSON.parseObject(listUserTimeLine, new TypeReference<List<UserTimeLine>>(){})));
    }

    @ResponseBody
    @PostMapping("/insert/{userTimeLine}")
    public BaseDto insertUserTimeLine(
            @PathVariable(name = "userTimeLine", required = false) String userTimeLine){
        return new BaseDto(ObjectType.OBJECT, userTimeLineService.insertUserTimeLine(
                JSON.parseObject(userTimeLine, UserTimeLine.class)));
    }
}