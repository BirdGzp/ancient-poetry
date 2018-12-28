package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.Comment;
import com.moon.ancientpoetry.user.core.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:13
 * @Description:
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @ResponseBody
    @PostMapping("/list/full/{pageNum}/{pageSize}")
    public BaseDto listFullComment(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, commentService.listFullComment(pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/article/{articleId}/type/{articleType}/{pageNum}{pageSize}")
    public BaseDto listCommentsByArticleIdAndArticleType(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "articleType", required = false) Integer articleType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT,
                commentService.listCommentsByArticleIdAndArticleType(articleId, articleType, pageNum, pageSize));
    }


    @ResponseBody
    @PostMapping("/list/parent/{parentCommentId}/{pageNum}{pageSize}")
    public BaseDto listCommentByParentCommentId(
            @PathVariable(name = "parentCommentId", required = false) Integer parentCommentId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT,
                commentService.listCommentByParentCommentId(parentCommentId,  pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/user/like/{userId}/{pageNum}{pageSize}")
    public BaseDto listCommentByUserIdOrderByLikes(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, commentService.listCommentByUserIdOrderByLikes(userId,  pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/user/time/{userId}/{pageNum}{pageSize}")
    public BaseDto listCommentByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, commentService.listCommentByUserIdOrderByTime(userId,  pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/update/batch/{commentList}")
    public BaseDto updateBatchCommentLikes(@PathVariable(name = "commentList", required = false) String commentList){
        return new BaseDto(ObjectType.OBJECT,
                commentService.updateBatchCommentLikes(JSON.parseObject(commentList, new TypeReference<List<Comment>>(){})));
    }

    @ResponseBody
    @PostMapping("/delete/{comment}")
    public BaseDto updateCommentsDeleteState(@PathVariable(name = "comment", required = false) String comment){
        return new BaseDto(ObjectType.OBJECT,
                commentService.updateCommentsDeleteState(JSON.parseObject(comment, Comment.class)));
    }

    @ResponseBody
    @PostMapping("/insert/batch/{commentList}")
    public BaseDto insertBatchComments(@PathVariable(name = "commentList", required = false) String commentList){
        return new BaseDto(ObjectType.OBJECT, commentService.insertBatchComments(
                JSON.parseObject(commentList, new TypeReference<List<Comment>>(){})));
    }

    @ResponseBody
    @PostMapping("/insert/{comment}")
    public BaseDto insertComment(@PathVariable(name = "comment", required = false) String comment){
        return new BaseDto(ObjectType.OBJECT, commentService.insertComment(JSON.parseObject(comment, Comment.class)));
    }
}
