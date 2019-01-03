package com.moon.ancientpoetry.article.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.ArticleTag;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:30
 * @Description:
 */
public interface ArticleTagService {
    /**
     * 获得全部标签，article_tag_id为null
     * @return
     */
    List listArticleTag() ;

    /**
     * 根据id查找子标签
     * @param parentTagId
     * @return
     */
    List listArticleTagByParentTagId(Integer parentTagId);

    /**
     * 更新标签信息
     * @param articleTag
     * @return
     */
    Integer updateArticleTagByTagId(ArticleTag articleTag);

    /**
     * 插入新的标签
     * @param articleTag
     * @return
     */
    Integer insertArticleTag(ArticleTag articleTag);
}
