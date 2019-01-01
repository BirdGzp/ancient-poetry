package com.moon.ancientpoetry.poetry.core.controller;

import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.AncientDynasty;
import com.moon.ancientpoetry.poetry.core.service.AncientDynastyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ancient/dynasty")
public class AncientDynastyController {
    @Autowired
    private AncientDynastyService ancientDynastyService;

    @ResponseBody
    @PostMapping("/list/full")
    public BaseDto listAllAncientDynasty(){
        return new BaseDto(ObjectType.LIST, ancientDynastyService.listAllAncientDynasty());
    }

    @ResponseBody
    @PostMapping("/list")
    public BaseDto listAllBriefAncientDynasty(){
        return new BaseDto(ObjectType.LIST, ancientDynastyService.listAllBriefAncientDynasty());
    }

    @ResponseBody
    @PostMapping("/insert")
    public BaseDto insertAncientAuthor(AncientDynasty ancientDynasty){
        return new BaseDto(ObjectType.OBJECT, ancientDynastyService.insertAncientDynasty(ancientDynasty));
    }
}
