package com.moon.ancientpoetry.poetry.core.controller;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
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
    public BaseDto listFullAllAncientAuthor(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientWordTranslateService.listFullAncientWordTranslate(pageNum,pageSize));
    }

    @ResponseBody
    @PostMapping("/list/article_id/{articleId}/{pageNum}/{pageSize}")
    public BaseDto listAncientWordTranslateByWordFromArticleId(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientWordTranslateService.listAncientWordTranslateByWordFromArticleId(articleId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/sentence/{sentenceId}/{pageNum}/{pageSize}")
    public BaseDto listAncientWordTranslateByWordFromSentenceId(
            @PathVariable(name = "sentenceId", required = false) Integer sentenceId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientWordTranslateService.listAncientWordTranslateByWordFromSentenceId(sentenceId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/word/{wordId}/{pageNum}/{pageSize}")
    public BaseDto listAncientWordTranslateByWordId(
            @PathVariable(name = "wordId", required = false) Integer wordId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientWordTranslateService.listAncientWordTranslateByWordId(wordId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/get/{translateByWordId}")
    public BaseDto listAncientWordTranslateByWordId(
            @PathVariable(name = "translateByWordId", required = false) Integer translateByWordId){
        return new BaseDto(ObjectType.OBJECT, ancientWordTranslateService.getAncientWordTranslateByAncientWordId(translateByWordId));
    }

    @ResponseBody
    @PostMapping("/update")
    public BaseDto updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate){
        return new BaseDto(ObjectType.OBJECT, ancientWordTranslateService.updateAncientWordTranslate(ancientWordTranslate));
    }

    @ResponseBody
    @PostMapping("/insert")
    public BaseDto insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate){
        return new BaseDto(ObjectType.OBJECT, ancientWordTranslateService.insertAncientWordTranslate(ancientWordTranslate));
    }

}
