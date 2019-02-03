package com.moon.ancientpoetry.web.service.user.impl;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Comment;
import com.moon.ancientpoetry.web.feign.user.service.CommentFeignService;
import com.moon.ancientpoetry.web.service.user.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:21
 * @Description:
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentFeignService commentFeignService;

    @Override
    public PageInfo<Comment> listFullComment(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo<Comment> listCommentByParentCommentId(Integer parentCommentId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo<Comment> listCommentByUserIdOrderByLikes(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo<Comment> listCommentByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo<Comment> listCommentsByArticleIdAndArticleType(Integer articleId, Integer articleType, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public int updateCommentsDeleteState(Comment comment) {
        return 0;
    }

    @Override
    public int updateBatchCommentLikes(List comments) {
        return 0;
    }

    @Override
    public int insertBatchComments(List comments) {
        return 0;
    }

    @Override
    public int insertComment(Comment comment) {
        return 0;
    }
}
