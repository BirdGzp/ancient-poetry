package com.moon.ancientpoetry.web.controller;

import com.moon.ancientpoetry.common.po.AncientArticle;
import com.moon.ancientpoetry.web.service.poetry.AncientArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Harold
 * @Description
 * @Date : 2019/2/3 16:22
 */
@Controller
@RequestMapping("/ancient/article")
public class AncientArticleController {
    @Autowired
    private AncientArticleService ancientArticleService;
   @RequestMapping("/get/{article-id}")
    public String getAncientArticleByArticleId(@PathVariable("article-id") Integer articleId){
       ancientArticleService.getAncientArticleByArticleId(articleId);
       return null;
   }
}
