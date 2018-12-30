package com.moon.ancientpoetry.web.feign.user.service;

import com.moon.ancientpoetry.web.feign.user.fallback.LikeFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:58
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-USER-CORE", fallback = LikeFeignServiceFallback.class)
public interface LikeFeignService {
    @RequestMapping(value = "/list/user/{userId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listLikeByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);


    @RequestMapping(value = "/count/{fromType}/{fromId}", method = RequestMethod.POST)
    String getCountByFromIdAndFromType(
            @PathVariable(name = "fromId", required = false) Integer fromId,
            @PathVariable(name = "fromType", required = false) Integer fromType);


    @RequestMapping(value = "/update/{like}", method = RequestMethod.POST)
    String updateLikeDeleteState(
            @PathVariable(name = "like", required = false) String like);


    @RequestMapping(value = "/insert/batch/{likeList}", method = RequestMethod.POST)
    String insertBatchLikes(
            @PathVariable(name = "likeList", required = false) String likeList);


    @RequestMapping(value = "/insert/{like}", method = RequestMethod.POST)
    String insertLike(
            @PathVariable(name = "like", required = false) String like);
}
