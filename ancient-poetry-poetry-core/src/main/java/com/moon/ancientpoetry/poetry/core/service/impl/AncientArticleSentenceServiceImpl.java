package com.moon.ancientpoetry.poetry.core.service.impl;

import com.moon.ancientpoetry.common.po.AncientArticleSentence;
import com.moon.ancientpoetry.poetry.core.mapper.AncientArticleSentenceMapper;
import com.moon.ancientpoetry.poetry.core.service.AncientArticleSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ancientArticleSentenceService")
public class AncientArticleSentenceServiceImpl implements AncientArticleSentenceService{

    @Autowired
    AncientArticleSentenceMapper ancientArticleSentenceMapper;

    /**
     * 获得全部的句子
     * @return
     */
    @Override
    public List<AncientArticleSentence> listFullAncientArticleSentence(){
        return ancientArticleSentenceMapper.listFullAncientArticleSentence();
    }

    /**
     * 根据文章id 去查找句子
     * @param ancientArticleId  文章id
     * @return
     */
    @Override
    public List<AncientArticleSentence> listAncientArticleSentenceByAncientArticleId(Integer ancientArticleId){
        return ancientArticleSentenceMapper.listAncientArticleSentenceByAncientArticleId(ancientArticleId);
    }

    /**
     * 根据作者 id 查找作者的句子
     * @param ancientAuthorId
     * @return
     */
    @Override
    public List<AncientArticleSentence> listAncientArticleSentenceByAuthorId(Integer ancientAuthorId){
        return ancientArticleSentenceMapper.listAncientArticleSentenceByAuthorId(ancientAuthorId);
    }

    /**
     * 根据 句子的 id 去查找句子
     * @param ancientArticleSentenceId
     * @return
     */
    @Override
    public AncientArticleSentence getAncientArticleSentenceById(Integer ancientArticleSentenceId){
        return ancientArticleSentenceMapper.getAncientArticleSentenceById(ancientArticleSentenceId);
    }

    /**
     * 根据 ArticleSentenceId 去修改表
     * @param ancientArticleSentence  封装修改的数据
     * @return
     */
    @Override
    public int updateAncientArticleSentenceByAncientArticleSentenceId(AncientArticleSentence ancientArticleSentence){
        return ancientArticleSentenceMapper.updateAncientArticleSentenceByAncientArticleSentenceId(ancientArticleSentence);
    }

    /**
     * 插入新的名句
     * @param ancientArticleSentence
     * @return
     */
    @Override
    public int insertAncientArticleSentence(AncientArticleSentence ancientArticleSentence){
        return ancientArticleSentenceMapper.insertAncientArticleSentence(ancientArticleSentence);
    }
}
