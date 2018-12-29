package com.moon.ancientpoetry.user.web.feign.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.user.web.feign.service.CommentFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 10:01
 * @Description:
 */
@Component
@DefaultFallback
public class CommentFeignServiceFallback implements CommentFeignService {

    @Override
    public String listFullComment(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listCommentsByArticleIdAndArticleType(Integer articleId, Integer articleType, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listCommentByParentCommentId(Integer parentCommentId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listCommentByUserIdOrderByLikes(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listCommentByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String updateBatchCommentLikes(String commentList) {
        return null;
    }

    @Override
    public String updateCommentsDeleteState(String comment) {
        return null;
    }

    @Override
    public String insertBatchComments(String commentList) {
        return null;
    }

    @Override
    public String insertComment(String comment) {
        return null;
    }
}
