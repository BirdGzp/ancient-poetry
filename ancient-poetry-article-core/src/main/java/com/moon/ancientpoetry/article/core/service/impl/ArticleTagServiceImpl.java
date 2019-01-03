package com.moon.ancientpoetry.article.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.article.core.mapper.ArticleTagMapper;
import com.moon.ancientpoetry.article.core.service.ArticleTagService;
import com.moon.ancientpoetry.common.po.ArticleTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:31
 * @Description:
 */
@Service("articleTagService")
public class ArticleTagServiceImpl implements ArticleTagService {

    @Autowired
    ArticleTagMapper articleTagMapper;

    /**
     * 获得全部标签，article_tag_id为null
     * @return
     */
    @Override
    public List listArticleTag() {
        return articleTagMapper.listArticleTag();
    }

    /**
     * 根据id查找子标签
     * @param parentTagId
     * @return
     */
    @Override
    public List<ArticleTag> listArticleTagByParentTagId(Integer parentTagId) {
        return articleTagMapper.listArticleTagByParentTagId(parentTagId);
    }

    /**
     * 更新标签信息
     * @param articleTag
     * @return
     */
    @Override
    public Integer updateArticleTagByTagId(ArticleTag articleTag) {
        return articleTagMapper.updateArticleTagByTagId(articleTag);
    }

    /**
     * 插入新的标签
     * @param articleTag
     * @return
     */
    @Override
    public Integer insertArticleTag(ArticleTag articleTag) {
        return articleTagMapper.insertArticleTag(articleTag);
    }
}
