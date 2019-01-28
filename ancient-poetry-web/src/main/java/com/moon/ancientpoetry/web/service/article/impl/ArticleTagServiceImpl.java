package com.moon.ancientpoetry.web.service.article.impl;

import com.moon.ancientpoetry.common.po.ArticleTag;
import com.moon.ancientpoetry.web.feign.article.service.ArticleTagFeignService;
import com.moon.ancientpoetry.web.service.article.ArticleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/3 15:18
 * @Description:
 */
@Service("articleTagService")
public class ArticleTagServiceImpl implements ArticleTagService {

    @Autowired
    ArticleTagFeignService articleTagFeignService;

    /**
     * 获得全部标签，article_tag_id为null
     * @return
     */
    @Override
    public String listArticleTag(){
        return  articleTagFeignService.listArticleTag();
    }

    /**
     * 根据id查找子标签
     * @param parentTagId
     * @return
     */
    @Override
    public String listArticleTagByParentTagId(Integer parentTagId){
        return  articleTagFeignService.listArticleTagByParentTagId(parentTagId);
    }

    /**
     * 更新标签信息
     * @param articleTag
     * @return
     */
    @Override
    public String updateArticleTagByTagId(ArticleTag articleTag){
        return  articleTagFeignService.updateArticleTagByTagId(articleTag);
    }

    /**
     * 插入新的标签
     * @param articleTag
     * @return
     */
    @Override
    public String insertArticleTag(ArticleTag articleTag){
        return  articleTagFeignService.insertArticleTag(articleTag);
    }
}
