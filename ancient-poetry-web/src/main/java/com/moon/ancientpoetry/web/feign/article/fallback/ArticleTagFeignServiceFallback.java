package com.moon.ancientpoetry.web.feign.article.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.ArticleTag;
import com.moon.ancientpoetry.web.feign.article.service.ArticleTagFeignService;
import org.springframework.stereotype.Component;


/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:15
 * @Description:
 */
@Component
@DefaultFallback
public class ArticleTagFeignServiceFallback implements ArticleTagFeignService {
    @Override
    public String listArticleTag() {
        return null;
    }

    @Override
    public String listArticleTagByParentTagId(Integer parentTagId) {
        return null;
    }

    @Override
    public String updateArticleTagByTagId(ArticleTag articleTag) {
        return null;
    }

    @Override
    public String insertArticleTag(ArticleTag articleTag) {
        return null;
    }
}
