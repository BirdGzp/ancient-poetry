package com.moon.ancientpoetry.poetry.core.mapper;

import com.moon.ancientpoetry.common.po.AncientArticle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AncientArticleMapper {

    /**
     * 获得全部文章
     * @return
     */
    List<AncientArticle> listFullAncientArticle();

    /**
     * 根据作者id 去获得文章列表
     * @param authorId
     * @return
     */
    List<AncientArticle> listAncientArticleByAuthorId(Integer authorId);

    /**
     * 通过 articleId 获得文章
     * @param articleId
     * @return
     */
    AncientArticle getAncientArticleByArticleId(Integer articleId);

    /**
     *  更新文章信息
     * @param ancientArticle
     * @return
     */
    int updateAncientArticle(AncientArticle ancientArticle);

    /**
     * 插入古代文章
     * @param ancientArticle
     * @return
     */
    int insertAncientArticle(AncientArticle ancientArticle);
}
