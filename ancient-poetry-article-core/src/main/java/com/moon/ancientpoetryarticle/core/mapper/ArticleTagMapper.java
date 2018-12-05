package com.moon.ancientpoetryarticle.core.mapper;

import com.moon.ancientpoetry.common.po.ArticleTag;

public interface ArticleTagMapper {
    int deleteByPrimaryKey(Integer articleTagId);

    int insert(ArticleTag record);

    int insertSelective(ArticleTag record);

    ArticleTag selectByPrimaryKey(Integer articleTagId);

    int updateByPrimaryKeySelective(ArticleTag record);

    int updateByPrimaryKey(ArticleTag record);
}