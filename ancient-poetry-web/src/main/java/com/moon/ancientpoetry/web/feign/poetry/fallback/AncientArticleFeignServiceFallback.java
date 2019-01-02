package com.moon.ancientpoetry.web.feign.poetry.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.AncientArticle;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientArticleFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:05
 * @Description:
 */
@Component
@DefaultFallback
public class AncientArticleFeignServiceFallback implements AncientArticleFeignService {


    @Override
    public String listAllAncientArticle(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listFullAllAncientArticle(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientArticleByAuthorId(Integer authorId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String getBriefAncientArticleByAuthorName(Integer articleId) {
        return null;
    }

    @Override
    public String insertAncientArticle(AncientArticle ancientArticle) {
        return null;
    }

    @Override
    public String updateAncientArticle(AncientArticle ancientArticle) {
        return null;
    }
}
