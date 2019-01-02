package com.moon.ancientpoetry.web.feign.poetry.service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:07
 * @Description:
 */

import com.moon.ancientpoetry.common.po.AncientWordTranslate;
import com.moon.ancientpoetry.web.feign.poetry.fallback.AncientWordServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "ANCIENT-POETRY-POETRY-CORE", fallback = AncientWordServiceFallback.class)
public interface AncientWordTranslateFeignService {
    
    @RequestMapping(value = "/ancient/word/translate/list/full/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listFullAllAncientAuthor(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/ancient/word/translate/list/article_id/{articleId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listAncientWordTranslateByWordFromArticleId(
            @PathVariable(name = "articleId", required = false) Integer articleId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/ancient/word/translate/list/sentence/{sentenceId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listAncientWordTranslateByWordFromSentenceId(
            @PathVariable(name = "sentenceId", required = false) Integer sentenceId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/ancient/word/translate/list/word/{wordId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listAncientWordTranslateByWordId(
            @PathVariable(name = "wordId", required = false) Integer wordId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/ancient/word/translate/get/{translateByWordId}", method = RequestMethod.POST)
    String listAncientWordTranslateByWordId(
            @PathVariable(name = "translateByWordId", required = false) Integer translateByWordId);

    
    @RequestMapping(value = "/ancient/word/translate/update", method = RequestMethod.POST)
    String updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate);

    
    @RequestMapping(value = "/ancient/word/translate/insert", method = RequestMethod.POST)
    String insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate);
}
