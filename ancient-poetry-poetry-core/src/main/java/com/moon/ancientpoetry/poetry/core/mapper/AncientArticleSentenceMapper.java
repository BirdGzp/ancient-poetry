package com.moon.ancientpoetry.poetry.core.mapper;

public interface AncientArticleSentenceMapper {
    int deleteByPrimaryKey(Integer ancientArticleSentennceId);

    int insert(AncientArticleSentence record);

    int insertSelective(AncientArticleSentence record);

    AncientArticleSentence selectByPrimaryKey(Integer ancientArticleSentennceId);

    int updateByPrimaryKeySelective(AncientArticleSentence record);

    int updateByPrimaryKey(AncientArticleSentence record);
}