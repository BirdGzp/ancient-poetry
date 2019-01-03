package com.moon.ancientpoetry.web.feign.article.fallback;


import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.ArticleFolder;
import com.moon.ancientpoetry.web.feign.article.service.ArticleFolderFeignService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:14
 * @Description:
 */
@Component
@DefaultFallback
public class ArticleFolderServiceFallback implements ArticleFolderFeignService {

    @Override
    public String listDeleteFolderByUserId(Integer userId, LocalDateTime localDateTime, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public String listArticleFolderByParentFolderId(Integer parentFolderId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public String listArticleFolderByUserId(Integer userId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public String getArticleFolderByFolderId(Integer articleFolderId) {
        return null;
    }

    @Override
    public String updateArticleFolderByArticleFloderId(ArticleFolder articleFolder) {
        return null;
    }

    @Override
    public String insertBatchArticleFolder(List<ArticleFolder> articleFolderList) {
        return null;
    }

    @Override
    public String insertArticleFolder(ArticleFolder articleFolder) {
        return null;
    }
}
