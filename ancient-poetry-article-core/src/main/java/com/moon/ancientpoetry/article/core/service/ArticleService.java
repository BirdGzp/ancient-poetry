package com.moon.ancientpoetry.article.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Article;
import com.moon.ancientpoetry.common.po.ArticleFolder;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:27
 * @Description:
 */
public interface ArticleService {
    /**
     * 根据文件夹id 获取文件夹下的文章
     * @param folderId
     * @return
     */
    List<ArticleFolder> listArticleByFolderId(Integer folderId);

    /**
     * 通过用户id  获取文章列表
     * @param userId
     * @return
     */
    PageInfo listArticleByUserId(Integer userId, Integer pageSize, Integer pageNum);

    /**
     * 根据文章ID  返回文章信息
     * @param articleId
     * @return
     */
    Article getArticleByArticleId(Integer articleId);

    /**
     * 修改文章
     * @param article
     * @return
     */
    Integer updateArticleByArticleId(Article article);

    /**
     * 插入一批文章记录
     * @param articleList
     * @return
     */
    Integer insertBatchArticle(List<Article> articleList);

    /**
     * 插入一篇文章记录
     * @param article
     * @return
     */
    Integer insertArticle(Article article);
}
