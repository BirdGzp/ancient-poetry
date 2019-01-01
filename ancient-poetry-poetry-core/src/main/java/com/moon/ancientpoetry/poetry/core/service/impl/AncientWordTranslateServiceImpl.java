package com.moon.ancientpoetry.poetry.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientWordTranslate;
import com.moon.ancientpoetry.poetry.core.mapper.AncientWordTranslateMapper;
import com.moon.ancientpoetry.poetry.core.service.AncientWordTranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AncientWordTranslateServiceImpl implements AncientWordTranslateService {

    @Autowired
    AncientWordTranslateMapper ancientWordTranslateMapper;

    /**
     * 返回全部的 字词翻译
     * @return
     */
    @Override
    public PageInfo listFullAncientWordTranslate(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(ancientWordTranslateMapper.listFullAncientWordTranslate());
    }

    /**
     * 根据句子 id  返回句子中的字词翻译
     * @param wordFromSentenceId
     * @return
     */
    @Override
    public PageInfo listAncientWordTranslateByWordFromSentenceId(Integer wordFromSentenceId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(ancientWordTranslateMapper.listAncientWordTranslateByWordFromSentenceId(wordFromSentenceId));
    }

    /**
     * 根据文章id 返回文章的字词翻译
     * @param wordFromArticleId
     * @return
     */
    @Override
    public PageInfo listAncientWordTranslateByWordFromArticleId(Integer wordFromArticleId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(ancientWordTranslateMapper.listAncientWordTranslateByWordFromArticleId(wordFromArticleId));
    }


    /**
     * 根据字词  获得所有有关的翻译
     * @param wordId
     * @return
     */
    @Override
    public PageInfo listAncientWordTranslateByWordId(Integer wordId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo( ancientWordTranslateMapper.listAncientWordTranslateByWordId(wordId));
    }

    /**
     * 根据 古文字词id 去获得字词信息
     * @param ancientWordId
     * @return
     */
    @Override
    public AncientWordTranslate getAncientWordTranslateByAncientWordId(Integer ancientWordId){
        return ancientWordTranslateMapper.getAncientWordTranslateByAncientWordId(ancientWordId);
    }

    /**
     * 更新记录——字词的翻译
     * @param ancientWordTranslate
     * @return
     */
    @Override
    public Integer updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate){
        return ancientWordTranslateMapper.updateAncientWordTranslate(ancientWordTranslate);
    }

    /**
     * 插入一条新记录 —— 字的翻译
     * @param ancientWordTranslate
     * @return
     */
    @Override
    public Integer insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate){
        return ancientWordTranslateMapper.insertAncientWordTranslate(ancientWordTranslate);
    }
}
