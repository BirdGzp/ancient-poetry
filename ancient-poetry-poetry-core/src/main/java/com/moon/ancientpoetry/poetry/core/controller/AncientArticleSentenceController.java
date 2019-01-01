package com.moon.ancientpoetry.poetry.core.controller;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
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
    @PostMapping("/list/full/{pageNum}/{pageSize}")
    public BaseDto listFullAncientArticleSentence(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientArticleSentenceService.listFullAncientArticleSentence(pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/{articleId}/{pageNum}/{pageSize}")
    public BaseDto listAncientArticleSentenceByAncientArticleId(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientArticleSentenceService.listAncientArticleSentenceByAncientArticleId(articleId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/{authorId}/{pageNum}/{pageSize}")
    public BaseDto listAncientArticleSentenceByAuthorId(
            @PathVariable(name = "authorId", required = false) Integer authorId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientArticleSentenceService.listAncientArticleSentenceByAuthorId(authorId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/insert")
    public BaseDto insertAncientArticleSentence(AncientArticleSentence ancientArticleSentence){
        return new BaseDto(ObjectType.OBJECT, ancientArticleSentenceService.insertAncientArticleSentence(ancientArticleSentence));
    }

    @ResponseBody
    @PostMapping("/update")
    public BaseDto updateAncientArticleSentence(AncientArticleSentence ancientArticleSentence){
        return new BaseDto(ObjectType.OBJECT, ancientArticleSentenceService.updateAncientArticleSentence(ancientArticleSentence));
    }
}
