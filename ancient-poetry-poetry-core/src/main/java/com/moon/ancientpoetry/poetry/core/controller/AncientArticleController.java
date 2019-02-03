package com.moon.ancientpoetry.poetry.core.controller;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.AncientArticle;
import com.moon.ancientpoetry.poetry.core.service.AncientArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PostMapping("/list/{pageNum}/{pageSize}")
    public BaseDto listAllAncientArticle(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT,  ancientArticleService.listAncientArticle(pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/full/{pageNum}/{pageSize}")
    public BaseDto listFullAllAncientArticle(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientArticleService.listFullAncientArticle(pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/{authorId}/{pageNum}/{pageSize}")
    public BaseDto listAncientArticleByAuthorId(
            @PathVariable(name = "authorId", required = false) Integer authorId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientArticleService.listAncientArticleByAuthorId(authorId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("get/brief/id/{articleId}")
    public BaseDto getAncientArticleByArticleId(
            @PathVariable("articleId")Integer articleId){
        return new BaseDto(ObjectType.OBJECT, ancientArticleService.getAncientArticleByArticleId(articleId));
    }

    @ResponseBody
    @PostMapping("/insert")
    public BaseDto insertAncientArticle(AncientArticle ancientArticle){
        return new BaseDto(ObjectType.OBJECT, ancientArticleService.insertAncientArticle(ancientArticle));
    }

    @ResponseBody
    @PostMapping("/update")
    public BaseDto updateAncientArticle(AncientArticle ancientArticle){
        return new BaseDto(ObjectType.OBJECT, ancientArticleService.updateAncientArticle(ancientArticle));
    }
}
