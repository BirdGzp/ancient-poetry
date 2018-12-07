package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    /**
     * 获得全部评论
     * @return
     */
    List<Comment> selectFullComment();

    /**
     * 根据评论 id 查找评论下的评论
     * @param parentCommentId
     * @return
     */
    List<Comment> selectCommentByParentCommentId(Integer parentCommentId);

    /**
     * 根据用户 id 查询评论(点赞排序)
     * @param userId
     * @return
     */
    List<Comment> selectCommentByUserIdOrderByLikes(Integer userId);

    /**
     * 根据用户 id 查询评论(时间排序)
     * @param userId
     * @return
     */
    List<Comment> selectCommentByUserIdOrderByTime(Integer userId);

    /**
     * 根据文章id 查询评论
     * @param articleId
     * @return
     */
    List<Comment> selectCommentsByArticleId(Integer articleId);

    /**
     * 更新评论为删除状态
     * @param comment
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