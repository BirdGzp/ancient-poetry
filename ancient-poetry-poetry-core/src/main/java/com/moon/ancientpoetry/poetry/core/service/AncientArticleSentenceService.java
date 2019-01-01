package com.moon.ancientpoetry.poetry.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientArticleSentence;

import java.util.List;

public interface AncientArticleSentenceService {
    /**
     * 获得全部的句子
     * @return
     */
    PageInfo listFullAncientArticleSentence(Integer pageNum, Integer pageSize);

    /**
     * 根据文章id 去查找句子
     * @param ancientArticleId  文章id
     * @return
     */
    PageInfo listAncientArticleSentenceByAncientArticleId(Integer ancientArticleId, Integer pageNum, Integer pageSize);

    /**
     * 根据作者 id 查找作者的句子
     * @param ancientAuthorId
     * @return
     */
    PageInfo listAncientArticleSentenceByAuthorId(Integer ancientAuthorId, Integer pageNum, Integer pageSize);

    /**
     * 根据 句子的 id 去查找句子
     * @param ancientArticleSentenceId
     * @return
     */
    AncientArticleSentence getAncientArticleSentenceById(Integer ancientArticleSentenceId);

    /**
     * 根据 ArticleSentenceId 去修改表
     * @param ancientArticleSentence  封装修改的数据
     * @return
     */
    Integer updateAncientArticleSentence(AncientArticleSentence ancientArticleSentence);

    /**
     * 插入新的名句
     * @param ancientArticleSentence
     * @return
     */
    Integer insertAncientArticleSentence(AncientArticleSentence ancientArticleSentence);

}
