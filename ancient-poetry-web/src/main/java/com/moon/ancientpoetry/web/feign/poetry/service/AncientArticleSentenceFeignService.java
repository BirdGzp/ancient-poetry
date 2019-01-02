package com.moon.ancientpoetry.web.feign.poetry.service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:05
 * @Description:
 */

import com.moon.ancientpoetry.common.po.AncientArticleSentence;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "ANCIENT-POETRY-POETRY-CORE", fallback = AncientArticleSentence.class)
public interface AncientArticleSentenceFeignService {
    
    @RequestMapping("/ancient/article/sentence/list/full/{pageNum}/{pageSize}")
    String listFullAncientArticleSentence(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping("/ancient/article/sentence/list/{articleId}/{pageNum}/{pageSize}")
    String listAncientArticleSentenceByAncientArticleId(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);
    
    @RequestMapping("/ancient/article/sentence/list/{authorId}/{pageNum}/{pageSize}")
    String listAncientArticleSentenceByAuthorId(
            @PathVariable(name = "authorId", required = false) Integer authorId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping("/ancient/article/sentence/insert")
    String insertAncientArticleSentence(AncientArticleSentence ancientArticleSentence);

    
    @RequestMapping("/ancient/article/sentence/update")
    String updateAncientArticleSentence(AncientArticleSentence ancientArticleSentence);
}
