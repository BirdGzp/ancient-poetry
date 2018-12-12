package com.moon.ancientpoetry.user.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Comment;
import com.moon.ancientpoetry.user.core.mapper.CommentMapper;
import com.moon.ancientpoetry.user.core.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:17A
 * @Description:
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 获得全部评论
     * @return
     */
    @Override
    public PageInfo<Comment> listFullComment(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(commentMapper.listFullComment());
    }

    /**
     * 根据评论 id 查找评论下的评论
     * @param parentCommentId
     * @return
     */
    @Override
    public PageInfo<Comment> listCommentByParentCommentId(Integer parentCommentId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(commentMapper.listCommentByParentCommentId(parentCommentId));
    }

    /**
     * 根据用户 id 查询评论(点赞排序)
     * @param userId
     * @return
     */
    @Override
    public PageInfo<Comment> listCommentByUserIdOrderByLikes(Integer userId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(commentMapper.listCommentByUserIdOrderByLikes(userId));
    }

    /**
     * 根据用户 id 查询评论(时间排序)
     * @param userId
     * @return
     */
    @Override
    public PageInfo<Comment> listCommentByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(commentMapper.listCommentByUserIdOrderByTime(userId));
    }

    /**
     * 根据文章id  和 文章类型查询评论
     * @param articleId
     * @return
     */
    @Override
    public PageInfo<Comment> listCommentsByArticleIdAndArticleType(Integer articleId, Integer articleType, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(commentMapper.listCommentsByArticleIdAndArticleType(articleId, articleType));
    }

    /**
     * 更新评论为删除状态
     * @param comment
     * @param
     * @return
     */
    @Override
    public int updateCommentsDeleteState(Comment comment){
        return commentMapper.updateCommentsDeleteState(comment);
    }

    /**
     * 更新评论的点赞数
     * @param comments
     * @return
     */
    @Override
    public int updateBatchCommentLikes(List comments){
        return commentMapper.updateBatchCommentLikes(comments);
    }

    /**
     * 批量插入一批评论
     * @param comments
     * @return
     */
    @Override
    public int insertBatchComments(List comments){
        return commentMapper.insertBatchComments(comments);
    }

    /**
     * 插入一条评论
     * @param comment 评论消息
     * @return
     */
    @Override
    public int insertComment(Comment comment){
        return commentMapper.insertComment(comment);
    }
}
