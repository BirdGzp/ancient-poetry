package com.moon.ancientpoetry.article.core.mapper;

import com.moon.ancientpoetry.common.po.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    /**
     * 根据文件夹id 获取文件夹下的文章
     * @param folderId
     * @return
     */
    List<Article> listArticleByFolderId(Integer folderId);

    /**
     * 通过用户id  获取文章列表
     * @param userId
     * @return
     */
    List<Article> listArticleByUserId(Integer userId);

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
    int updateArticleByArticleId(Article article);

    /**
     * 插入一批文章记录
     * @param articleList
     * @return
     */
    int insertBatchArticle(List<Article> articleList);

    /**
     * 插入一篇文章记录
     * @param article
     * @return
     */
    int insertArticle(Article article);
}