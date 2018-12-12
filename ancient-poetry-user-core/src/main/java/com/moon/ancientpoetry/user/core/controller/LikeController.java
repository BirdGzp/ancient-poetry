package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
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
    @GetMapping("/list/user/{userId}/{pageNum}/{pageSize}")
    public PageInfo listLikeByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return likeService.listLikeByUserIdOrderByTime(userId ,pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/count/{fromType}/{fromId}")
    public Integer getCountByFromIdAndFromType(
            @PathVariable(name = "fromId", required = false) Integer fromId,
            @PathVariable(name = "fromType", required = false) Integer fromType){
        return likeService.getCountByFromIdAndFromType(fromId ,fromType);
    }

    @ResponseBody
    @GetMapping("/update/{like}")
    public Integer updateLikeDeleteState(
            @PathVariable(name = "like", required = false) String like){
        return likeService.updateLikeDeleteState(JSON.parseObject(like, Like.class));
    }

    @ResponseBody
    @GetMapping("/insert/batch/{likeList}")
    public Integer insertBatchLikes(
            @PathVariable(name = "likeList", required = false) String likeList){
        return likeService.insertBatchLikes(JSON.parseObject(likeList, new TypeReference<List<Like>>(){}));
    }

    @ResponseBody
    @GetMapping("/insert/{like}")
    public Integer insertLike(
            @PathVariable(name = "like", required = false) String like){
        return likeService.insertLike(JSON.parseObject(like, Like.class));
    }
}
