package com.moon.ancientpoetry.poetry.core.mapper;

public interface AncientAuthorMapper {
    int deleteByPrimaryKey(Integer authorId);

    int insert(AncientAuthor record);

    int insertSelective(AncientAuthor record);

    AncientAuthor selectByPrimaryKey(Integer authorId);

    int updateByPrimaryKeySelective(AncientAuthor record);

    int updateByPrimaryKey(AncientAuthor record);
}