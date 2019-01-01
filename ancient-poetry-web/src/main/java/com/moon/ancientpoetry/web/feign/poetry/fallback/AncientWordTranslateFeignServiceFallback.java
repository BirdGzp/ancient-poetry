package com.moon.ancientpoetry.web.feign.poetry.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.AncientWordTranslate;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientWordTranslateFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:07
 * @Description:
 */
@Component
@DefaultFallback
public class AncientWordTranslateFeignServiceFallback implements AncientWordTranslateFeignService {
    @Override
    public String listFullAllAncientAuthor(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientWordTranslateByWordFromArticleId(Integer articleId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientWordTranslateByWordFromSentenceId(Integer sentenceId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientWordTranslateByWordId(Integer wordId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientWordTranslateByWordId(Integer translateByWordId) {
        return null;
    }

    @Override
    public String updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate) {
        return null;
    }

    @Override
    public String insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate) {
        return null;
    }
}
