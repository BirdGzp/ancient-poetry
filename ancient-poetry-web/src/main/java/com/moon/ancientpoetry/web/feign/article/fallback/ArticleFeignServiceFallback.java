package com.moon.ancientpoetry.web.feign.article.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.Article;
import com.moon.ancientpoetry.web.feign.article.service.ArticleFeignService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:14
 * @Description:
 */
@Component
@DefaultFallback
public class ArticleFeignServiceFallback implements ArticleFeignService {
    @Override
    public String listArticleByFolderId(Integer folderId) {
        return null;
    }

    @Override
    public String listArticleByUserId(Integer userId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public String getArticleByArticleId(Integer articleId) {
        return null;
    }

    @Override
    public String updateArticleByArticleId(Article article) {
        return null;
    }

    @Override
    public String insertBatchArticle(List<Article> articleList) {
        return null;
    }

    @Override
    public String insertArticle(Article article) {
        return null;
    }
}
