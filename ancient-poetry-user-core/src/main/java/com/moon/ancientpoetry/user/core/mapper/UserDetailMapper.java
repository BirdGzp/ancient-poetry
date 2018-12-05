package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.UserDetail;

public interface UserDetailMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    UserDetail selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
}