package com.moon.ancientpoetry.web.feign.poetry.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.AncientArticleSentence;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientArticleSentenceFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:05
 * @Description:
 */
@Component
@DefaultFallback
public class AncientArticleSentenceFeignServiceFallback implements AncientArticleSentenceFeignService {
    @Override
    public String listFullAncientArticleSentence(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientArticleSentenceByAncientArticleId(Integer articleId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientArticleSentenceByAuthorId(Integer authorId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String insertAncientArticleSentence(AncientArticleSentence ancientArticleSentence) {
        return null;
    }

    @Override
    public String updateAncientArticleSentence(AncientArticleSentence ancientArticleSentence) {
        return null;
    }
}
