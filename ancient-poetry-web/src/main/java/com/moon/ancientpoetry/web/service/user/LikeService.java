package com.moon.ancientpoetry.web.service.user;

import com.github.pagehelper.PageInfo;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:22
 * @Description:
 */
public interface LikeService {
    /**
     * 通过用户 Id  拿到用户的点赞信息记录
     * @param userId
     * @return
     */
    PageInfo listLikeByUserIdOrderByTime(Integer userId);

    /**
     * 通过来源的数据 id 和 来源类型
     * @param fromId
     * @param fromType
     * @return
     */
    Integer getCountByFromIdAndFromType(Integer fromId, Integer fromType);

    /**
     * 更新点赞记录信息
     * @param like
     * @return
     */
    String updateLikeDeleteState(String like);

    /**
     * 插入一批点赞记录信息
     * @param like
     * @return
     */
    Integer insertBatchLikes(String like);

    /**
     * 插入一条点赞记录信息
     * @param like
     * @return
     */
    Integer insertLike(String like);
}
