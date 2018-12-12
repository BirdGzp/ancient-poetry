package com.moon.ancientpoetry.user.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Like;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:14
 * @Description:
 */
public interface LikeService {
    /**
     * 根据类型 和id 得到点赞总数
     * @param fromId
     * @param fromType
     * @return
     */
    int getCountByFromIdAndFromType(Integer fromId, Integer fromType);

    /**
     * 获得用户的点赞记录(时间排序)
     * @param userId
     * @return
     */
    PageInfo listLikeByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize);

    /**
     * 更新一条记录为删除状态
     * @param like
     * @return
     */
    int updateLikeDeleteState(Like like);

    /**
     * 批量插入一批点赞记录
     * @param likes
     * @return
     */
    int insertBatchLikes(List likes);

    /**
     * 插入点赞记录
     * @param like
     * @return
     */
    int insertLike(Like like);
}
