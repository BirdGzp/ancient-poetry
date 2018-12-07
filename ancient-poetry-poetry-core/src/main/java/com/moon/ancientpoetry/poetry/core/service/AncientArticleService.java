package com.moon.ancientpoetry.poetry.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientArticle;


public interface AncientArticleService {
    /**
     * 获得全部文章
     * @return
     */
    PageInfo listFullAncientArticle(Integer pageNum, Integer pageSize);

    /**
     * 根据作者id 去获得文章列表
     * @param authorId
     * @return
     */
    PageInfo listAncientArticleByAuthorId(Integer authorId, Integer pageNum, Integer pageSize);

    /**
     * 通过 articleId 获得文章
     * @param articleId
     * @return
     */
    AncientArticle getAncientArticleByArticleId(Integer articleId);

    /**
     *  更新文章信息
     * @param ancientArticle
     * @return
     */
    int updateAncientArticle(AncientArticle ancientArticle);

    /**
     * 插入古代文章
     * @param ancientArticle
     * @return
     */
    int insertAncientArticle(AncientArticle ancientArticle);
}
