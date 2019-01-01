package com.moon.ancientpoetry.web.feign.poetry.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.AncientWord;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientWordFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:06
 * @Description:
 */
@Component
@DefaultFallback
public class AncientWordServiceFallback implements AncientWordFeignService {
    @Override
    public String getAncientWordByAncientWordId(Integer ancientWordId) {
        return null;
    }

    @Override
    public String getAncientWordByAncientWord(String ancientWord) {
        return null;
    }

    @Override
    public String insertAuthorWord(AncientWord ancientWord) {
        return null;
    }
}
