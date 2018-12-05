package com.moon.ancientpoetryarticle.core.mapper;


import com.moon.ancientpoetry.common.po.ArticleFloder;

public interface ArticleFloderMapper {
    int deleteByPrimaryKey(Integer floderId);

    int insert(ArticleFloder record);

    int insertSelective(ArticleFloder record);

    ArticleFloder selectByPrimaryKey(Integer floderId);

    int updateByPrimaryKeySelective(ArticleFloder record);

    int updateByPrimaryKey(ArticleFloder record);
}