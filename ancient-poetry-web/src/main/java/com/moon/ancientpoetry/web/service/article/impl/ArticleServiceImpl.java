package com.moon.ancientpoetry.web.service.article.impl;

import com.moon.ancientpoetry.common.po.Article;
import com.moon.ancientpoetry.web.feign.article.service.ArticleFeignService;
import com.moon.ancientpoetry.web.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/3 15:17
 * @Description:
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleFeignService articleFeignService;
    /**
     * 根据文件夹id 获取文件夹下的文章
     * @param folderId
     * @return
     */
    @Override
    public String listArticleByFolderId(Integer folderId){
        return articleFeignService.listArticleByFolderId(folderId);
    }

    /**
     * 通过用户id  获取文章列表
     * @param userId
     * @return
     */
    @Override
    public String listArticleByUserId(Integer userId, Integer pageSize, Integer pageNum){
        return articleFeignService.listArticleByUserId(userId, pageSize, pageNum);
    }

    /**
     * 根据文章ID  返回文章信息
     * @param articleId
     * @return
     */
    @Override
    public String getArticleByArticleId(Integer articleId){
        return articleFeignService.getArticleByArticleId(articleId);
    }

    /**
     * 修改文章
     * @param article
     * @return
     */
    @Override
    public String updateArticleByArticleId(Article article){
        return articleFeignService.updateArticleByArticleId(article);
    }

    /**
     * 插入一批文章记录
     * @param articleList
     * @return
     */
    @Override
    public String insertBatchArticle(List<Article> articleList){
        return articleFeignService.insertBatchArticle(articleList);
    }

    /**
     * 插入一篇文章记录
     * @param article
     * @return
     */
    @Override
    public String insertArticle(Article article){
        return articleFeignService.insertArticle(article);
    }
}
