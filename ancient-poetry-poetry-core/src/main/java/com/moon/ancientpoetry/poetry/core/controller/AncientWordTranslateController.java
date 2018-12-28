package com.moon.ancientpoetry.poetry.core.controller;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientWordTranslate;
import com.moon.ancientpoetry.poetry.core.service.AncientWordTranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ancient/word/translate")
public class AncientWordTranslateController {
    @Autowired
    private AncientWordTranslateService ancientWordTranslateService;

    @ResponseBody
    @PostMapping("/list/full/{pageNum}/{pageSize}")
    public PageInfo listFullAllAncientAuthor(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientWordTranslateService.listFullAncientWordTranslate(pageNum,pageSize);
    }

    @ResponseBody
    @PostMapping("/list/article_id/{articleId}/{pageNum}/{pageSize}")
    public PageInfo listAncientWordTranslateByWordFromArticleId(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientWordTranslateService.listAncientWordTranslateByWordFromArticleId(articleId, pageNum, pageSize);
    }

    @ResponseBody
    @PostMapping("/list/sentence/{sentenceId}/{pageNum}/{pageSize}")
    public PageInfo listAncientWordTranslateByWordFromSentenceId(
            @PathVariable(name = "sentenceId", required = false) Integer sentenceId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientWordTranslateService.listAncientWordTranslateByWordFromSentenceId(sentenceId, pageNum, pageSize);
    }

    @ResponseBody
    @PostMapping("/list/word/{wordId}/{pageNum}/{pageSize}")
    public PageInfo listAncientWordTranslateByWordId(
            @PathVariable(name = "wordId", required = false) Integer wordId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientWordTranslateService.listAncientWordTranslateByWordId(wordId, pageNum, pageSize);
    }

    @ResponseBody
    @PostMapping("/get/{translateByWordId}")
    public AncientWordTranslate listAncientWordTranslateByWordId(
            @PathVariable(name = "translateByWordId", required = false) Integer translateByWordId){
        return ancientWordTranslateService.getAncientWordTranslateByAncientWordId(translateByWordId);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate){
        return ancientWordTranslateService.updateAncientWordTranslate(ancientWordTranslate);
    }

    @ResponseBody
    @PostMapping("/insert")
    public int insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate){
        return ancientWordTranslateService.insertAncientWordTranslate(ancientWordTranslate);
    }

}
