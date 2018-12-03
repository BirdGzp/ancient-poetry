package com.moon.ancientpoetry.common.mapper;

import com.moon.ancientpoetry.common.po.Like;

public interface LikeMapper {
    int deleteByPrimaryKey(Integer likeId);

    int insert(Like record);

    int insertSelective(Like record);

    Like selectByPrimaryKey(Integer likeId);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);
}