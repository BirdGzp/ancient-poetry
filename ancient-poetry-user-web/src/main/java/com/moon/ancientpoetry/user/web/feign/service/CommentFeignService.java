package com.moon.ancientpoetry.user.web.feign.service;

import com.moon.ancientpoetry.user.web.feign.fallback.CommentFeignServiceFallback;
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
@FeignClient(value = "ANCIENT-POETRY-USER-CORE", fallback = CommentFeignServiceFallback.class)
public interface CommentFeignService {
    
    @RequestMapping(value = "/comment/list/full/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listFullComment(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/comment/list/article/{articleId}/type/{articleType}/{pageNum}{pageSize}", method = RequestMethod.POST)
    String listCommentsByArticleIdAndArticleType(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "articleType", required = false) Integer articleType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);


    
    @RequestMapping(value = "/comment/list/parent/{parentCommentId}/{pageNum}{pageSize}", method = RequestMethod.POST)
    String listCommentByParentCommentId(
            @PathVariable(name = "parentCommentId", required = false) Integer parentCommentId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/comment/list/user/like/{userId}/{pageNum}{pageSize}", method = RequestMethod.POST)
    String listCommentByUserIdOrderByLikes(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/comment/list/user/time/{userId}/{pageNum}{pageSize}", method = RequestMethod.POST)
    String listCommentByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/comment/update/batch/{commentList}", method = RequestMethod.POST)
    String updateBatchCommentLikes(@PathVariable(name = "commentList", required = false) String commentList);

    
    @RequestMapping(value = "/comment/delete/{comment}", method = RequestMethod.POST)
    String updateCommentsDeleteState(@PathVariable(name = "comment", required = false) String comment);
    
    @RequestMapping(value = "/comment/insert/batch/{commentList}", method = RequestMethod.POST)
    String insertBatchComments(@PathVariable(name = "commentList", required = false) String commentList);

    
    @RequestMapping(value = "/comment/insert/{comment}", method = RequestMethod.POST)
    String insertComment(@PathVariable(name = "comment", required = false) String comment);
}
