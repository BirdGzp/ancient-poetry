package com.moon.ancientpoetry.common.mapper;

import com.moon.ancientpoetry.common.po.UserBasic;

public interface UserBasicMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserBasic record);

    int insertSelective(UserBasic record);

    UserBasic selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserBasic record);

    int updateByPrimaryKey(UserBasic record);
}