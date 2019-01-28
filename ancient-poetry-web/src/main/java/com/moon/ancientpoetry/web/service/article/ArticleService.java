package com.moon.ancientpoetry.web.service.article;

import com.moon.ancientpoetry.common.po.Article;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/3 15:17
 * @Description:
 */
public interface ArticleService {
    /**
     * 根据文件夹id 获取文件夹下的文章
     * @param folderId
     * @return
     */
    String listArticleByFolderId(Integer folderId);

    /**
     * 通过用户id  获取文章列表
     * @param userId
     * @return
     */
    String listArticleByUserId(Integer userId, Integer pageSize, Integer pageNum);

    /**
     * 根据文章ID  返回文章信息
     * @param articleId
     * @return
     */
    String getArticleByArticleId(Integer articleId);

    /**
     * 修改文章
     * @param article
     * @return
     */
    String updateArticleByArticleId(Article article);

    /**
     * 插入一批文章记录
     * @param articleList
     * @return
     */
    String insertBatchArticle(List<Article> articleList);

    /**
     * 插入一篇文章记录
     * @param article
     * @return
     */
    String insertArticle(Article article);
}
