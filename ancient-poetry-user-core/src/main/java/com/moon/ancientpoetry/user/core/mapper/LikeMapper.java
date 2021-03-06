package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.Like;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LikeMapper {
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
    List<Like> listLikeByUserIdOrderByTime(Integer userId);

    /**
     * 更新一条记录为删除状态
     * @param like
     * @return
     */
    int updateLikeDeleteState(Like like);

    /**
     * 批量插入一批点赞记录
     * @param like
     * @return
     */
    int insertBatchLikes(List like);

    /**
     * 插入点赞记录
     * @param like
     * @return
     */
    int insertLike(Like like);
}