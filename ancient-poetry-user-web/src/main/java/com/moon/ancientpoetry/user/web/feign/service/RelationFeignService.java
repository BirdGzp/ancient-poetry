package com.moon.ancientpoetry.user.web.feign.service;

import com.moon.ancientpoetry.user.web.feign.fallback.RelationFeignServiceFallback;
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
@FeignClient(value = "ANCIENT-POETRY-USER-CORE", fallback = RelationFeignServiceFallback.class)
public interface RelationFeignService {
    
    @RequestMapping(value = "/list/user/{userId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listRelationByUserId(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/list/follow/{followId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listRelationByFollowId(
            @PathVariable(name = "followId", required = false) Integer followId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/update/batch/{relationList}", method = RequestMethod.POST)
    String updateBatchRelationDeleteState(
            @PathVariable(name = "relationList", required = false) String relationList);

    
    @RequestMapping(value = "/update/{relation}", method = RequestMethod.POST)
    String updateRelationDeleteState(
            @PathVariable(name = "relation", required = false) String relation);


    @RequestMapping(value = "/insert/batch/{relationList}", method = RequestMethod.POST)
    String insertBatchRelation(
            @PathVariable(name = "relationList", required = false) String relationList);

    
    @RequestMapping(value = "/insert/{relation}", method = RequestMethod.POST)
    String insertRelation(
            @PathVariable(name = "relation", required = false) String relation);
}
