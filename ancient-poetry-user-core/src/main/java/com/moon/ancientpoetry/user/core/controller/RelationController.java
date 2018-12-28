package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
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
    @PostMapping("/list/user/{userId}/{pageNum}/{pageSize}")
    public BaseDto listRelationByUserId(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, relationService.listRelationByUserId(userId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/follow/{followId}/{pageNum}/{pageSize}")
    public BaseDto listRelationByFollowId(
            @PathVariable(name = "followId", required = false) Integer followId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, relationService.listRelationByFollowId(followId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/update/batch/{relationList}")
    public BaseDto updateBatchRelationDeleteState(
            @PathVariable(name = "relationList", required = false) String relationList){
        return new BaseDto(ObjectType.OBJECT, relationService.updateBatchRelationDeleteState(JSON.parseObject(relationList, new TypeReference<List<Relation>>(){})));
    }

    @ResponseBody
    @PostMapping("/update/{relation}")
    public BaseDto updateRelationDeleteState(
            @PathVariable(name = "relation", required = false) String relation){
        return new BaseDto(ObjectType.OBJECT, relationService.updateRelationDeleteState(JSON.parseObject(relation, Relation.class)));
    }

    @ResponseBody
    @PostMapping("/insert/batch/{relationList}")
    public BaseDto insertBatchRelation(
            @PathVariable(name = "relationList", required = false) String relationList){
        return new BaseDto(ObjectType.OBJECT, relationService.insertBatchRelation(JSON.parseObject(relationList, new TypeReference<List<Relation>>(){})));
    }

    @ResponseBody
    @PostMapping("/insert/{relation}")
    public BaseDto insertRelation(
            @PathVariable(name = "relation", required = false) String relation){
        return new BaseDto(ObjectType.OBJECT, relationService.insertRelation(JSON.parseObject(relation, Relation.class)));
    }
}
