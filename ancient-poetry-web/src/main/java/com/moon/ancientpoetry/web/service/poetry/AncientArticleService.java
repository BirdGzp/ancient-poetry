package com.moon.ancientpoetry.web.service.poetry;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientArticle;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:13
 * @Description:
 */
public interface AncientArticleService {
    /**
     * 获得推荐的十首古诗词
     * @return
     */
     List listRecommendAncientPoetry();

    /**
     * 通过文章 id 获得文章记录
     * @param articleId
     * @return
     */
     AncientArticle getAncientArticleByArticleId(Integer articleId);


    /**
     * 获得简略的文章信息
     * @return
     */
    PageInfo listAncientArticle(Integer pageNum, Integer pageSize);


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
     *  更新文章信息
     * @param ancientArticle
     * @return
     */
    Integer updateAncientArticle(AncientArticle ancientArticle);

    /**
     * 插入古代文章
     * @param ancientArticle
     * @return
     */
    Integer insertAncientArticle(AncientArticle ancientArticle);
}
