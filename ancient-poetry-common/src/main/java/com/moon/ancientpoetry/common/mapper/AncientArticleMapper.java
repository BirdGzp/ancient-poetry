package com.moon.ancientpoetry.common.mapper;

import com.moon.ancientpoetry.common.po.AncientArticle;

public interface AncientArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(AncientArticle record);

    int insertSelective(AncientArticle record);

    AncientArticle selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(AncientArticle record);

    int updateByPrimaryKey(AncientArticle record);
}