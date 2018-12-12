package com.moon.ancientpoetry.user.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Comment;

import java.util.List;


/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:14
 * @Description:
 */
public interface CommentService {
    /**
     * 获得全部评论
     * @return
     */
    PageInfo<Comment> listFullComment(Integer pageNum, Integer pageSize);

    /**
     * 根据评论 id 查找评论下的评论
     * @param parentCommentId
     * @return
     */
    PageInfo<Comment> listCommentByParentCommentId(Integer parentCommentId, Integer pageNum, Integer pageSize);

    /**
     * 根据用户 id 查询评论(点赞排序)
     * @param userId
     * @return
     */
    PageInfo<Comment> listCommentByUserIdOrderByLikes(Integer userId, Integer pageNum, Integer pageSize);

    /**
     * 根据用户 id 查询评论(时间排序)
     * @param userId
     * @return
     */
    PageInfo<Comment> listCommentByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize);

    /**
     * 根据文章id 查询评论
     * @param articleId
     * @return
     */
    PageInfo<Comment> listCommentsByArticleIdAndArticleType(Integer articleId, Integer articleType, Integer pageNum, Integer pageSize);

    /**
     * 更新评论为删除状态
     * @param comment
     * @param
     * @return
     */
    int updateCommentsDeleteState(Comment comment);

    /**
     * 更新评论的点赞数
     * @param comments
     * @return
     */
    int updateBatchCommentLikes(List comments);

    /**
     * 批量插入一批评论
     * @param comments
     * @return
     */
    int insertBatchComments(List comments);

    /**
     * 插入一条评论
     * @param comment 评论消息
     * @return
     */
    int insertComment(Comment comment);
}
