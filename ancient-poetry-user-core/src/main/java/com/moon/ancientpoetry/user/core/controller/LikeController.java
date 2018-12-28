package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.Like;
import com.moon.ancientpoetry.user.core.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:13
 * @Description:
 */
@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    LikeService likeService;

    @ResponseBody
    @PostMapping("/list/user/{userId}/{pageNum}/{pageSize}")
    public BaseDto listLikeByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, likeService.listLikeByUserIdOrderByTime(userId ,pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/count/{fromType}/{fromId}")
    public BaseDto getCountByFromIdAndFromType(
            @PathVariable(name = "fromId", required = false) Integer fromId,
            @PathVariable(name = "fromType", required = false) Integer fromType){
        return new BaseDto(ObjectType.OBJECT, likeService.getCountByFromIdAndFromType(fromId ,fromType));
    }

    @ResponseBody
    @PostMapping("/update/{like}")
    public BaseDto updateLikeDeleteState(
            @PathVariable(name = "like", required = false) String like){
        return new BaseDto(ObjectType.OBJECT, likeService.updateLikeDeleteState(JSON.parseObject(like, Like.class)));
    }

    @ResponseBody
    @PostMapping("/insert/batch/{likeList}")
    public BaseDto insertBatchLikes(
            @PathVariable(name = "likeList", required = false) String likeList){
        return new BaseDto(ObjectType.OBJECT, likeService.insertBatchLikes(JSON.parseObject(likeList,
                new TypeReference<List<Like>>(){})));
    }

    @ResponseBody
    @PostMapping("/insert/{like}")
    public BaseDto insertLike(
            @PathVariable(name = "like", required = false) String like){
        return new BaseDto(ObjectType.OBJECT, likeService.insertLike(JSON.parseObject(like, Like.class)));
    }
}
