package com.moon.ancientpoetry.web.feign.article.service;

import com.moon.ancientpoetry.common.po.ArticleTag;
import com.moon.ancientpoetry.web.feign.article.fallback.ArticleTagFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:14
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-ARTICLE-CORE", fallback = ArticleTagFeignServiceFallback.class)
public interface ArticleTagFeignService {
    /**
     * 获得全部标签，article_tag_id为null
     * @return
     */
    @RequestMapping(value = "/article/tag/list", method = RequestMethod.POST)
    String listArticleTag();

    /**
     * 根据id查找子标签
     * @param parentTagId
     * @return
     */
    @RequestMapping(value = "/article/tag/list/parent-tag-id/{parentTagId}", method = RequestMethod.POST)
    String listArticleTagByParentTagId(@PathVariable("parentTagId") Integer parentTagId);

    /**
     * 更新标签信息
     * @param articleTag
     * @return
     */
    @RequestMapping(value = "/article/tag/update", method = RequestMethod.POST)
    String updateArticleTagByTagId(@RequestBody ArticleTag articleTag);

    /**
     * 插入新的标签
     * @param articleTag
     * @return
     */
    @RequestMapping(value = "/article/tag/insert", method = RequestMethod.POST)
    String insertArticleTag(@RequestBody ArticleTag articleTag);
}
