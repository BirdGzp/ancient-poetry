package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Relation;
import com.moon.ancientpoetry.user.core.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:16
 * @Description:
 */
@RestController
@RequestMapping("/relation")
public class RelationController {
    @Autowired
    RelationService relationService;

    @ResponseBody
    @GetMapping("/list/user/{userId}/{pageNum}/{pageSize}")
    public PageInfo listRelationByUserId(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return relationService.listRelationByUserId(userId, pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/follow/{followId}/{pageNum}/{pageSize}")
    public PageInfo listRelationByFollowId(
            @PathVariable(name = "followId", required = false) Integer followId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return relationService.listRelationByFollowId(followId, pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/update/batch/{relationList}")
    public Integer updateBatchRelationDeleteState(
            @PathVariable(name = "relationList", required = false) String relationList){
        return relationService.updateBatchRelationDeleteState(JSON.parseObject(relationList, new TypeReference<List<Relation>>(){}));
    }

    @ResponseBody
    @GetMapping("/update/{relation}")
    public Integer updateRelationDeleteState(
            @PathVariable(name = "relation", required = false) String relation){
        return relationService.updateRelationDeleteState(JSON.parseObject(relation, Relation.class));
    }

    @ResponseBody
    @GetMapping("/insert/batch/{relationList}")
    public Integer insertBatchRelation(
            @PathVariable(name = "relationList", required = false) String relationList){
        return relationService.insertBatchRelation(JSON.parseObject(relationList, new TypeReference<List<Relation>>(){}));
    }

    @ResponseBody
    @GetMapping("/insert/{relation}")
    public Integer insertRelation(
            @PathVariable(name = "relation", required = false) String relation){
        return relationService.insertRelation(JSON.parseObject(relation, Relation.class));
    }
}
