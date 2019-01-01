package com.moon.ancientpoetry.poetry.core.controller;

import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
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
    @PostMapping("/get/id/{ancientWordId}")
    public BaseDto getAncientWordByAncientWordId(
            @PathVariable(name = "ancientWordId") Integer ancientWordId){
        return new BaseDto(ObjectType.OBJECT, ancientWordService.getAncientWordByAncientWordId(ancientWordId));
    }

    @ResponseBody
    @PostMapping("/get/word/{ancientWord}")
    public BaseDto getAncientWordByAncientWord(
            @PathVariable(name = "ancientWord") String ancientWord){
        return new BaseDto(ObjectType.OBJECT, ancientWordService.getAncientWordByAncientWord(ancientWord));
    }

    @ResponseBody
    @PostMapping("/insert")
    public BaseDto insertAuthorWord(AncientWord ancientWord){
        return new BaseDto(ObjectType.OBJECT, ancientWordService.insertAuthorWord(ancientWord));
    }
}
