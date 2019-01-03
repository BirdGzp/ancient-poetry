package com.moon.ancientpoetry.web.feign.article.service;


import com.moon.ancientpoetry.common.po.Article;
import com.moon.ancientpoetry.web.feign.article.fallback.ArticleFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:13
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-ARTICLE-CORE", fallback = ArticleFeignServiceFallback.class)
public interface ArticleFeignService {
    /**
     * 根据文件夹id 获取文件夹下的文章
     * @param folderId
     * @return
     */
    @RequestMapping(value = "/article/list/folder-id/{folderId}", method = RequestMethod.POST)
    String listArticleByFolderId(@PathVariable("folderId")Integer folderId);

    /**
     * 通过用户id  获取文章列表
     * @param userId
     * @return
     */
    @RequestMapping(value = "/article/list/user-id/{userId}/{pageSize}/{pageNum}", method = RequestMethod.POST)
    String listArticleByUserId(@PathVariable("userId")Integer userId, @PathVariable("pageSize")Integer pageSize, @PathVariable("pageNum")Integer pageNum);

    /**
     * 根据文章ID  返回文章信息
     * @param articleId
     * @return
     */
    @RequestMapping(value = "/article/get/article-id/{articleId}", method = RequestMethod.POST)
    String getArticleByArticleId(@PathVariable("articleId")Integer articleId);

    /**
     * 修改文章
     * @param article
     * @return
     */
    @RequestMapping(value = "/article/update", method = RequestMethod.POST)
    String updateArticleByArticleId(@RequestBody Article article);

    /**
     * 插入一批文章记录
     * @param articleList
     * @return
     */
    @RequestMapping(value = "/article/batch/insert", method = RequestMethod.POST)
    String insertBatchArticle(@RequestBody List<Article> articleList);

    /**
     * 插入一篇文章记录
     * @param article
     * @return
     */
    @RequestMapping(value = "/article/insert", method = RequestMethod.POST)
    String insertArticle(@RequestBody Article article);
}
