package com.moon.ancientpoetry.poetry.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientArticle;
import com.moon.ancientpoetry.poetry.core.mapper.AncientArticleMapper;
import com.moon.ancientpoetry.poetry.core.service.AncientArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ancientArticleService")
public class AncientArticleServiceImpl implements AncientArticleService {

    @Autowired
    AncientArticleMapper  ancientArticleMapper;

    /**
     * 获得全部文章
     * @return
     */
    @Override
    public PageInfo listFullAncientArticle(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(ancientArticleMapper.listFullAncientArticle());
    }

    /**
     * 根据作者id 去获得文章列表
     * @param authorId
     * @return
     */
    @Override
    public PageInfo listAncientArticleByAuthorId(Integer authorId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(ancientArticleMapper.listAncientArticleByAuthorId(authorId));
    }

    /**
     * 通过 articleId 获得文章
     * @param articleId
     * @return
     */
    @Override
    public AncientArticle getAncientArticleByArticleId(Integer articleId){
        return ancientArticleMapper.getAncientArticleByArticleId(articleId);
    }

    /**
     *  更新文章信息
     * @param ancientArticle
     * @return
     */
    @Override
    public Integer updateAncientArticle(AncientArticle ancientArticle){
        return ancientArticleMapper.updateAncientArticle(ancientArticle);
    }

    /**
     * 插入古代文章
     * @param ancientArticle
     * @return
     */
    @Override
    public Integer insertAncientArticle(AncientArticle ancientArticle){
        return ancientArticleMapper.insertAncientArticle(ancientArticle);
    }
}
