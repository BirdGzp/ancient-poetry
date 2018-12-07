package com.moon.ancientpoetry.poetry.core.controller;

import com.moon.ancientpoetry.common.po.AncientDynasty;
import com.moon.ancientpoetry.poetry.core.service.AncientDynastyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ancient_dynasty")
public class AncientDynastyController {
    @Autowired
    private AncientDynastyService ancientDynastyService;

    @ResponseBody
    @GetMapping("/list/full")
    public List<AncientDynasty> listAllAncientDynasty(){
        return ancientDynastyService.listAllAncientDynasty();
    }

    @ResponseBody
    @GetMapping("/list")
    public List<AncientDynasty> listAllBriefAncientDynasty(){
        return ancientDynastyService.listAllBriefAncientDynasty();
    }

    @ResponseBody
    @PostMapping("/insert")
    public int insertAncientAuthor(AncientDynasty ancientDynasty){
        return ancientDynastyService.insertAncientDynasty(ancientDynasty);
    }
}
