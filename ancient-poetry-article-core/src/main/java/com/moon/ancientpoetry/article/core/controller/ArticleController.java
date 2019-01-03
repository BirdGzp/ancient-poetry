package com.moon.ancientpoetry.article.core.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.article.core.service.ArticleService;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:31
 * @Description:
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    /**
     * 根据文件夹id 获取文件夹下的文章
     * @param folderId
     * @return
     */
    @PostMapping("/list/folder-id/{folderId}")
    @ResponseBody
    public String listArticleByFolderId(@PathVariable("folderId")Integer folderId) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT, articleService.listArticleByFolderId(folderId)));
    }

    /**
     * 通过用户id  获取文章列表
     * @param userId
     * @return
     */
    @PostMapping("/list/user-id/{userId}/{pageSize}/{pageNum}")
    @ResponseBody
    public String listArticleByUserId(@PathVariable("userId")Integer userId, @PathVariable("pageSize")Integer pageSize, @PathVariable("pageNum")Integer pageNum) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleService.listArticleByUserId(userId, pageSize, pageNum)));
    }

    /**
     * 根据文章ID  返回文章信息
     * @param articleId
     * @return
     */
    @PostMapping("/get/article-id/{articleId}")
    @ResponseBody
    public String getArticleByArticleId(@PathVariable("articleId")Integer articleId) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT, articleService.getArticleByArticleId(articleId)));
    }

    /**
     * 修改文章
     * @param article
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public String updateArticleByArticleId(@RequestBody Article article) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleService.updateArticleByArticleId(article)));
    }

    /**
     * 插入一批文章记录
     * @param articleList
     * @return
     */
    @PostMapping("/batch/insert")
    @ResponseBody
    public String insertBatchArticle(@RequestBody List<Article> articleList) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleService.insertBatchArticle(articleList)));
    }

    /**
     * 插入一篇文章记录
     * @param article
     * @return
     */
    @PostMapping("/insert")
    @ResponseBody
    public String insertArticle(@RequestBody Article article) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleService.insertArticle(article)));
    }
}
