package com.moon.ancientpoetry.web.service.article;

import com.moon.ancientpoetry.common.po.ArticleTag;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/3 15:18
 * @Description:
 */
public interface ArticleTagService {
    public String listArticleTag();

    /**
     * 根据id查找子标签
     * @param parentTagId
     * @return
     */
    String listArticleTagByParentTagId(Integer parentTagId);

    /**
     * 更新标签信息
     * @param articleTag
     * @return
     */
    String updateArticleTagByTagId(ArticleTag articleTag);

    /**
     * 插入新的标签
     * @param articleTag
     * @return
     */
    String insertArticleTag(ArticleTag articleTag);
}
