package com.moon.ancientpoetry.web.feign.user.service;

import com.moon.ancientpoetry.web.feign.user.fallback.UserTimeLineFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:59
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-USER-CORE", fallback = UserTimeLineFeignServiceFallback.class)
public interface UserTimeLineFeignService {
    
    @RequestMapping(value = "/user-time-line/list/event-type/{eventType}/user/{userId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listUserTimeLineByUserIdAndEventStateOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "eventType", required = false) Byte eventType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/user-time-line/list/user/{userId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listUserTimeLineByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/user-time-line/get/event/{eventId}", method = RequestMethod.POST)
    String listUserTimeLineByUserIdOrderByTime(
            @PathVariable(name = "eventId", required = false) Integer eventId);
    
    @RequestMapping(value = "/user-time-line/update/batch/{listUserTimeLine}", method = RequestMethod.POST)
    String updateBatchUserTimeLine(
            @PathVariable(name = "listUserTimeLine", required = false) String listUserTimeLine);
    
    @RequestMapping(value = "/user-time-line/update/{userTimeLine}", method = RequestMethod.POST)
    String updateUserTimeLine(
            @PathVariable(name = "userTimeLine", required = false) String userTimeLine);

    
    @RequestMapping(value = "/user-time-line/insert/batch/{listUserTimeLine}", method = RequestMethod.POST)
    String insertBatchUserTimeLine(
            @PathVariable(name = "listUserTimeLine", required = false) String listUserTimeLine);

    
    @RequestMapping(value = "/user-time-line/insert/{userTimeLine}", method = RequestMethod.POST)
    String insertUserTimeLine(
            @PathVariable(name = "userTimeLine", required = false) String userTimeLine);
}
