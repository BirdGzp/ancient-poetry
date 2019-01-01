package com.moon.ancientpoetry.web.feign.poetry.service;

import com.moon.ancientpoetry.common.po.AncientArticle;
import com.moon.ancientpoetry.web.feign.poetry.fallback.AncientArticleFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:05
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-POETRY-CORE", fallback = AncientArticleFeignServiceFallback.class)
public interface AncientArticleFeignService {
    
    @RequestMapping(value = "/list/full/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listFullAllAncientAuthor(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/list/{authorId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listAncientArticleByAuthorId(
            @PathVariable(name = "authorId", required = false) Integer authorId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "get/brief/id/{articleId}", method = RequestMethod.POST)
    String getBriefAncientAuthorByAuthorName(
            @PathVariable("articleId")Integer articleId);

    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    String insertAncientArticle(@RequestBody AncientArticle ancientArticle);

    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    String updateAncientArticle(@RequestBody AncientArticle ancientArticle);
}
