package com.moon.ancientpoetry.article.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.article.core.mapper.ArticleMapper;
import com.moon.ancientpoetry.article.core.service.ArticleService;
import com.moon.ancientpoetry.common.po.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:31
 * @Description:
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    /**
     * 根据文件夹id 获取文件夹下的文章
     * @param folderId
     * @return
     */
    @Override
    public List listArticleByFolderId(Integer folderId) {
        return articleMapper.listArticleByFolderId(folderId);
    }

    /**
     * 通过用户id  获取文章列表
     * @param userId
     * @return
     */
    @Override
    public PageInfo listArticleByUserId(Integer userId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(articleMapper.listArticleByUserId(userId));
    }

    /**
     * 根据文章ID  返回文章信息
     * @param articleId
     * @return
     */
    @Override
    public Article getArticleByArticleId(Integer articleId) {
        return articleMapper.getArticleByArticleId(articleId);
    }

    /**
     * 修改文章
     * @param article
     * @return
     */
    @Override
    public Integer updateArticleByArticleId(Article article) {
        return articleMapper.updateArticleByArticleId(article);
    }

    /**
     * 插入一批文章记录
     * @param articleList
     * @return
     */
    @Override
    public Integer insertBatchArticle(List<Article> articleList) {
        return articleMapper.insertBatchArticle(articleList);
    }

    /**
     * 插入一篇文章记录
     * @param article
     * @return
     */
    @Override
    public Integer insertArticle(Article article) {
        return articleMapper.insertArticle(article);
    }
}
