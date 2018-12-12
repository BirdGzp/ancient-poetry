package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
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
    @GetMapping("/list/full/{pageNum}/{pageSize}")
    public PageInfo listFullComment(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return commentService.listFullComment(pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/article/{articleId}/type/{articleType}/{pageNum}{pageSize}")
    public PageInfo listCommentsByArticleIdAndArticleType(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "articleType", required = false) Integer articleType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return commentService.listCommentsByArticleIdAndArticleType(articleId, articleType, pageNum, pageSize);
    }


    @ResponseBody
    @GetMapping("/list/parent/{parentCommentId}/{pageNum}{pageSize}")
    public PageInfo listCommentByParentCommentId(
            @PathVariable(name = "parentCommentId", required = false) Integer parentCommentId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return commentService.listCommentByParentCommentId(parentCommentId,  pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/user/like/{userId}/{pageNum}{pageSize}")
    public PageInfo listCommentByUserIdOrderByLikes(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return commentService.listCommentByUserIdOrderByLikes(userId,  pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/user/time/{userId}/{pageNum}{pageSize}")
    public PageInfo listCommentByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return commentService.listCommentByUserIdOrderByTime(userId,  pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/update/batch/{commentList}")
    public int updateBatchCommentLikes(@PathVariable(name = "commentList", required = false) String commentList){
        return commentService.updateBatchCommentLikes(JSON.parseObject(commentList, new TypeReference<List<Comment>>(){}));
    }

    @ResponseBody
    @GetMapping("/delete/{comment}")
    public int updateCommentsDeleteState(@PathVariable(name = "comment", required = false) String comment){
        return commentService.updateCommentsDeleteState(JSON.parseObject(comment, Comment.class));
    }

    @ResponseBody
    @GetMapping("/insert/batch/{commentList}")
    public int insertBatchComments(@PathVariable(name = "commentList", required = false) String commentList){
        return commentService.insertBatchComments(JSON.parseObject(commentList, new TypeReference<List<Comment>>(){}));
    }

    @ResponseBody
    @GetMapping("/insert/{comment}")
    public int insertComment(@PathVariable(name = "comment", required = false) String comment){
        return commentService.insertComment(JSON.parseObject(comment, Comment.class));
    }
}
