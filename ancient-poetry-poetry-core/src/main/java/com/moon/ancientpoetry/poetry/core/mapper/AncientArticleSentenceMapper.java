package com.moon.ancientpoetry.poetry.core.mapper;

import com.moon.ancientpoetry.common.po.AncientArticleSentence;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AncientArticleSentenceMapper {

    /**
     * 获得全部的句子
     * @return
     */
    List<AncientArticleSentence> listFullAncientArticleSentence();

    /**
     * 根据文章id 去查找句子
     * @param ancientArticleId  文章id
     * @return
     */
    List<AncientArticleSentence> listAncientArticleSentenceByAncientArticleId(Integer ancientArticleId);

    /**
     * 根据作者 id 查找作者的句子
     * @param ancientAuthorId
     * @return
     */
    List<AncientArticleSentence> listAncientArticleSentenceByAuthorId(Integer ancientAuthorId);

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
    Integer updateAncientArticleSentenceByAncientArticleSentenceId(AncientArticleSentence ancientArticleSentence);

    /**
     * 插入新的名句
     * @param ancientArticleSentence
     * @return
     */
    Integer insertAncientArticleSentence(AncientArticleSentence ancientArticleSentence);


}