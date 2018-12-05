package com.moon.ancientpoetry.poetry.core.controller;

import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.poetry.core.service.impl.AncientAuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ancientAuthor")
public class AncientAuthorController {
    @Autowired
    private AncientAuthorServiceImpl ancientAuthorService;

    @ResponseBody
    @RequestMapping("/getAncientAuthor/{id}")
    public AncientAuthor getAncientAuthor(@PathVariable("id") int id){
        return ancientAuthorService.getAncientAuthor(id);
    }
}



  /*  @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }*/

