package com.moon.ancientpoetry.web.feign.poetry.service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:06
 * @Description:
 */

import com.moon.ancientpoetry.common.po.AncientDynasty;
import com.moon.ancientpoetry.web.feign.poetry.fallback.AncientDynastyFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "ANCIENT-POETRY-POETRY-CORE", fallback = AncientDynastyFeignServiceFallback.class)
public interface AncientDynastyFeignService {
    
    @RequestMapping(value = "/list/full", method = RequestMethod.POST)
    String listAllAncientDynasty();

    
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    String listAllBriefAncientDynasty();

    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    String insertAncientAuthor(AncientDynasty ancientDynasty);
}
