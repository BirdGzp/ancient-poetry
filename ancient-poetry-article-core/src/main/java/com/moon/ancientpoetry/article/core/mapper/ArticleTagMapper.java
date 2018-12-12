package com.moon.ancientpoetry.article.core.mapper;

import com.moon.ancientpoetry.common.po.ArticleTag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleTagMapper {
    /**
     * 获得全部标签，article_tag_id为null
     * @return
     */
    List<ArticleTag> listArticleTag() ;

    /**
     * 根据id查找子标签
     * @param parentTagId
     * @return
     */
    List<ArticleTag> listArticleTagByParentTagId(Integer parentTagId);

    /**
     * 更新标签信息
     * @param articleTag
     * @return
     */
    int updateArticleTagByTagId(ArticleTag articleTag);

    /**
     * 插入新的标签
     * @param articleTag
     * @return
     */
    int insertArticleTag(ArticleTag articleTag);
}