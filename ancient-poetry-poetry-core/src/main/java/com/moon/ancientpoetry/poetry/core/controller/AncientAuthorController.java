package com.moon.ancientpoetry.poetry.core.controller;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.poetry.core.service.AncientAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ancient/author")
public class AncientAuthorController {
    @Autowired
    private AncientAuthorService ancientAuthorService;

    @ResponseBody
    @PostMapping("/list/full/{pageNum}/{pageSize}")
    public BaseDto listFullAllAncientAuthor(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.listAllAncientAuthor(pageNum,pageSize));
    }

    @ResponseBody
    @PostMapping("/list/{pageNum}/{pageSize}")
    public BaseDto listBriefAncientAuthor(
            @PathVariable(name = "pageNum") Integer pageNum,
            @PathVariable(name = "pageSize") Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.listAllBriefAncientAuthor(pageNum,pageSize).getList());
    }

    @ResponseBody
    @PostMapping("/get/id/{id}")
    public BaseDto getAncientAuthorByAuthorId(
            @PathVariable("id") int id){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.getAncientAuthorByAuthorId(id));
    }

    @ResponseBody
    @PostMapping("/get/brief/id/{id}")
    public BaseDto getBriefAncientAuthorByAuthorId(
            @PathVariable("id") int id){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.getBriefAncientAuthorByAuthorId(id));
    }

    @ResponseBody
    @PostMapping("get/name/{name}")
    public BaseDto getAncientAuthorByAuthorName(
            @PathVariable("name")String authorName){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.getAncientAuthorByAuthorName(authorName));
    }

    @ResponseBody
    @PostMapping("get/brief/name/{name}")
    public BaseDto getBriefAncientAuthorByAuthorName(
            @PathVariable("name")String authorName){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.getBriefAncientAuthorByAuthorName(authorName));
    }

    @ResponseBody
    @PostMapping("/insert")
    public BaseDto insertAncientAuthor(AncientAuthor ancientAuthor){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.insertAncientAuthor(ancientAuthor));
    }

    @ResponseBody
    @PostMapping("/update")
    public BaseDto updateAncientAuthor(AncientAuthor ancientAuthor){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.updateAncientAuthor(ancientAuthor));
    }

    @ResponseBody
    @PostMapping("/update/id/{id}/likes/{likes}/visit_count/{visitCount}")
    public BaseDto updateAncientAuthorLikesAndVisitCount(
            @PathVariable("id")Integer authorId,
            @PathVariable("likes") Integer likes,
            @PathVariable("visitCount") Integer visitCount){
        return new BaseDto(ObjectType.OBJECT, ancientAuthorService.updateAncientAuthorLikesAndVisitCount(authorId, likes, visitCount));
    }
}


