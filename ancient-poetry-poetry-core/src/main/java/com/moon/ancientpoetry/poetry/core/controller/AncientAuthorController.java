package com.moon.ancientpoetry.poetry.core.controller;

import com.github.pagehelper.PageInfo;
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
    @GetMapping("/list/full/{pageNum}/{pageSize}")
    public PageInfo listFullAllAncientAuthor(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return ancientAuthorService.listAllAncientAuthor(pageNum,pageSize);
    }

    @ResponseBody
    @GetMapping("/list/{pageNum}/{pageSize}")
    public List listBriefAncientAuthor(
            @PathVariable(name = "pageNum") Integer pageNum,
            @PathVariable(name = "pageSize") Integer pageSize){
        return ancientAuthorService.listAllBriefAncientAuthor(pageNum,pageSize).getList();
    }

    @ResponseBody
    @GetMapping("/get/id/{id}")
    public AncientAuthor getAncientAuthorByAuthorId(
            @PathVariable("id") int id){
        return ancientAuthorService.getAncientAuthorByAuthorId(id);
    }

    @ResponseBody
    @GetMapping("/get/brief/id/{id}")
    public AncientAuthor getBriefAncientAuthorByAuthorId(
            @PathVariable("id") int id){
        return ancientAuthorService.getBriefAncientAuthorByAuthorId(id);
    }

    @ResponseBody
    @GetMapping("get/name/{name}")
    public AncientAuthor getAncientAuthorByAuthorName(
            @PathVariable("name")String authorName){
        return ancientAuthorService.getAncientAuthorByAuthorName(authorName);
    }

    @ResponseBody
    @GetMapping("get/brief/name/{name}")
    public AncientAuthor getBriefAncientAuthorByAuthorName(
            @PathVariable("name")String authorName){
        return ancientAuthorService.getBriefAncientAuthorByAuthorName(authorName);
    }

    @ResponseBody
    @PostMapping("/insert")
    public int insertAncientAuthor(AncientAuthor ancientAuthor){
        return ancientAuthorService.insertAncientAuthor(ancientAuthor);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateAncientAuthor(AncientAuthor ancientAuthor){
        return ancientAuthorService.updateAncientAuthor(ancientAuthor);
    }

    @ResponseBody
    @GetMapping("/update/id/{id}/likes/{likes}/visit_count/{visitCount}")
    public int updateAncientAuthorLikesAndVisitCount(
            @PathVariable("id")Integer authorId,
            @PathVariable("likes") Integer likes,
            @PathVariable("visitCount") Integer visitCount){
        return ancientAuthorService.updateAncientAuthorLikesAndVisitCount(authorId, likes, visitCount);
    }
}


