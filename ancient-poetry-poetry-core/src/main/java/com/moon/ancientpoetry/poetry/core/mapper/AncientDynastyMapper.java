package com.moon.ancientpoetry.poetry.core.mapper;

public interface AncientDynastyMapper {
    int deleteByPrimaryKey(Integer dynastyId);

    int insert(AncientDynasty record);

    int insertSelective(AncientDynasty record);

    AncientDynasty selectByPrimaryKey(Integer dynastyId);

    int updateByPrimaryKeySelective(AncientDynasty record);

    int updateByPrimaryKey(AncientDynasty record);
}