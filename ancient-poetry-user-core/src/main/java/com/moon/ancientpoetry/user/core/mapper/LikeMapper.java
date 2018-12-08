package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.Like;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LikeMapper {

    int selectCountByFromIdAndFromType(Integer fromId, Integer fromType);

    /**
     * 获得用户的点赞记录(时间排序)
     * @param userId
     * @return
     */
    List<Like> selectLikeByUserIdOrderByTime(Integer userId);

    /**
     * 更新一条记录为删除状态
     * @param like
     * @return
     */
    int updataLikeDeleteState(Like like);

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