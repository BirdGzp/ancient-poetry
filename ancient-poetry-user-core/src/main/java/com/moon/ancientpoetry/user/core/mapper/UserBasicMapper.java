package com.moon.ancientpoetry.user.core.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBasicMapper {

    int deleteByPrimaryKey(Integer userId);

    int insertUserBasic(UserBasic userBasic);

    int insertSelective(UserBasic record);

    UserBasic selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserBasic record);

    int updateByPrimaryKey(UserBasic record);
}