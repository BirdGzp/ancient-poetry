package com.moon.ancientpoetry.poetry.core.controller;

import com.moon.ancientpoetry.common.po.AncientWord;
import com.moon.ancientpoetry.poetry.core.service.AncientWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ancient/word")
public class AncientWordController {
    @Autowired
    AncientWordService ancientWordService;

    @ResponseBody
    @GetMapping("/get/id/{ancientWordId}")
    public AncientWord getAncientWordByAncientWordId(
            @PathVariable(name = "ancientWordId") Integer ancientWordId){
        return ancientWordService.getAncientWordByAncientWordId(ancientWordId);
    }

    @ResponseBody
    @GetMapping("/get/word/{ancientWord}")
    public AncientWord getAncientWordByAncientWord(
            @PathVariable(name = "ancientWord") String ancientWord){
        return ancientWordService.getAncientWordByAncientWord(ancientWord);
    }

    @ResponseBody
    @PostMapping("/insert")
    public int insertAuthorWord(AncientWord ancientWord){
        return ancientWordService.insertAuthorWord(ancientWord);
    }
}
