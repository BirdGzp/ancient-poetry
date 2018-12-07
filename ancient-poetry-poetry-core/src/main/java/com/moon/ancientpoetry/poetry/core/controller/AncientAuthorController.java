package com.moon.ancientpoetry.poetry.core.controller;

import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.poetry.core.service.impl.AncientAuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ancient_author")
public class AncientAuthorController {
    @Autowired
    private AncientAuthorServiceImpl ancientAuthorService;

    @ResponseBody
    @GetMapping("/list/full/{page_num}/{page_size}")
    public List findAllAncientAuthor(
            @PathVariable(name = "page_num", required = false) Integer pageNum,
            @PathVariable(name = "page_size", required = false) Integer pageSize){
        return ancientAuthorService.listAllAncientAuthor(pageNum,pageSize).getList();
    }

    @ResponseBody
    @GetMapping("/list/{page_num}/{page_size}")
    public List findAllBriefAncientAuthor(
            @PathVariable(name = "page_num", required = false) Integer pageNum,
            @PathVariable(name = "page_size", required = false) Integer pageSize){
        return ancientAuthorService.listAllBriefAncientAuthor(pageNum,pageSize).getList();
    }

    @ResponseBody
    @GetMapping("/get/id/{id}")
    public AncientAuthor getAncientAuthorByAuthorId(@PathVariable("id") int id){
        return ancientAuthorService.getAncientAuthorByAuthorId(id);
    }

    @ResponseBody
    @GetMapping("/get/brief/id/{id}")
    public AncientAuthor getBriefAncientAuthorByAuthorId(@PathVariable("id") int id){
        return ancientAuthorService.getBriefAncientAuthorByAuthorId(id);
    }

    @ResponseBody
    @GetMapping("get/name/{name}")
    public AncientAuthor getAncientAuthorByAuthorName(@PathVariable("name")String authorName){
        return ancientAuthorService.getAncientAuthorByAuthorName(authorName);
    }

    @ResponseBody
    @GetMapping("get/brief/name/{name}")
    public AncientAuthor getBriefAncientAuthorByAuthorName(@PathVariable("name")String authorName){
        return ancientAuthorService.getBriefAncientAuthorByAuthorName(authorName);
    }

    @ResponseBody
    @PostMapping("/insert")
    public int insertAncientAuthor(AncientAuthor ancientAuthor){
        return ancientAuthorService.insertAncientAuthor(ancientAuthor);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateAncientAuthorByAuthorId(AncientAuthor ancientAuthor){
        return ancientAuthorService.updateAncientAuthorByAuthorId(ancientAuthor);
    }

    @ResponseBody
    @GetMapping("/update/id/{id}/likes/{likes}/visit_count/{visitCount}")
    public int updateAncientAuthorLikesAndVisitCountByAuthorId(@PathVariable("id")Integer authorId, @PathVariable("likes") Integer likes, @PathVariable("visitCount") Integer visitCount){
        return ancientAuthorService.updateAncientAuthorLikesAndVisitCountByAuthorId(authorId, likes, visitCount);
    }
}


