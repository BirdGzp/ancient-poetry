package com.moon.ancientpoetry.poetry.core.controller;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientArticleSentence;
import com.moon.ancientpoetry.poetry.core.service.AncientArticleSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/7 13:32
 * @Description: 古代文章的控制器
 */
@RestController
@RequestMapping("/ancient/article/sentence")
public class AncientArticleSentenceController {
    @Autowired
    AncientArticleSentenceService ancientArticleSentenceService;

    @ResponseBody
    @GetMapping("/list/full/{pageNum}/{pageSize}")
    public PageInfo listFullAncientArticleSentence(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientArticleSentenceService.listFullAncientArticleSentence(pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/{articleId}/{pageNum}/{pageSize}")
    public PageInfo listAncientArticleSentenceByAncientArticleId(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientArticleSentenceService.listAncientArticleSentenceByAncientArticleId(articleId, pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/{authorId}/{pageNum}/{pageSize}")
    public PageInfo listAncientArticleSentenceByAuthorId(
            @PathVariable(name = "authorId", required = false) Integer authorId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientArticleSentenceService.listAncientArticleSentenceByAuthorId(authorId, pageNum, pageSize);
    }

    @ResponseBody
    @PostMapping("/insert")
    public int insertAncientArticleSentence(AncientArticleSentence ancientArticleSentence){
        return ancientArticleSentenceService.insertAncientArticleSentence(ancientArticleSentence);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateAncientArticleSentence(AncientArticleSentence ancientArticleSentence){
        return ancientArticleSentenceService.updateAncientArticleSentence(ancientArticleSentence);
    }
}
