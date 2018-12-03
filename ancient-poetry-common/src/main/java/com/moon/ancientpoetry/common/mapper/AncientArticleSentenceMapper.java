package com.moon.ancientpoetry.common.mapper;

import com.moon.ancientpoetry.common.po.AncientArticleSentence;

public interface AncientArticleSentenceMapper {
    int deleteByPrimaryKey(Integer ancientArticleSentennceId);

    int insert(AncientArticleSentence record);

    int insertSelective(AncientArticleSentence record);

    AncientArticleSentence selectByPrimaryKey(Integer ancientArticleSentennceId);

    int updateByPrimaryKeySelective(AncientArticleSentence record);

    int updateByPrimaryKey(AncientArticleSentence record);
}