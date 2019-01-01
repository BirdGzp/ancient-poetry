package com.moon.ancientpoetry.web.feign.poetry.service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:06
 * @Description:
 */

import com.moon.ancientpoetry.common.po.AncientWord;
import com.moon.ancientpoetry.web.feign.poetry.fallback.AncientWordServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "ANCIENT-POETRY-POETRY-CORE", fallback = AncientWordServiceFallback.class)
public interface AncientWordFeignService {
    
    @RequestMapping(value = "/get/id/{ancientWordId}", method = RequestMethod.POST)
    String getAncientWordByAncientWordId(
            @PathVariable(name = "ancientWordId") Integer ancientWordId);
    
    @RequestMapping(value = "/get/word/{ancientWord}", method = RequestMethod.POST)
    String getAncientWordByAncientWord(
            @PathVariable(name = "ancientWord") String ancientWord);

    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    String insertAuthorWord(AncientWord ancientWord);
}
