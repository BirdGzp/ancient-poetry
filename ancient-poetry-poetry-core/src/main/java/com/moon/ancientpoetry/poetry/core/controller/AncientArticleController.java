package com.moon.ancientpoetry.poetry.core.controller;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientArticle;
import com.moon.ancientpoetry.poetry.core.service.AncientArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/7 13:32
 * @Description: 古代文章的
 */
@RestController
@RequestMapping("/ancient/article")
public class AncientArticleController {

    @Autowired
    AncientArticleService ancientArticleService;

    @ResponseBody
    @GetMapping("/list/full/{pageNum}/{pageSize}")
    public PageInfo listFullAllAncientAuthor(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientArticleService.listFullAncientArticle(pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/{authorId}/{pageNum}/{pageSize}")
    public PageInfo listAncientArticleByAuthorId(
            @PathVariable(name = "authorId", required = false) Integer authorId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientArticleService.listAncientArticleByAuthorId(authorId, pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("get/brief/id/{articleId}")
    public AncientArticle getBriefAncientAuthorByAuthorName(
            @PathVariable("articleId")Integer articleId){
        return ancientArticleService.getAncientArticleByArticleId(articleId);
    }

    @ResponseBody
    @PostMapping("/insert")
    public int insertAncientArticle(AncientArticle ancientArticle){
        return ancientArticleService.insertAncientArticle(ancientArticle);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateAncientArticle(AncientArticle ancientArticle){
        return ancientArticleService.updateAncientArticle(ancientArticle);
    }
}
