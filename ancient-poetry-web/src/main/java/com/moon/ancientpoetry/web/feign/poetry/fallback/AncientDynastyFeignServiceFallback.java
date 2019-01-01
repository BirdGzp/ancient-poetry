package com.moon.ancientpoetry.web.feign.poetry.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.AncientDynasty;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientDynastyFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:06
 * @Description:
 */
@Component
@DefaultFallback
public class AncientDynastyFeignServiceFallback implements AncientDynastyFeignService {

    @Override
    public String listAllAncientDynasty() {
        return null;
    }

    @Override
    public String listAllBriefAncientDynasty() {
        return null;
    }

    @Override
    public String insertAncientAuthor(AncientDynasty ancientDynasty) {
        return null;
    }
}
