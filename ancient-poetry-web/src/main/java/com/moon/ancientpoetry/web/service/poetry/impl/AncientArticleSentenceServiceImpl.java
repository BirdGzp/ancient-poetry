package com.moon.ancientpoetry.web.service.poetry.impl;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientArticleSentence;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientArticleSentenceFeignService;
import com.moon.ancientpoetry.web.service.poetry.AncientArticleSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:17
 * @Description:
 */
@Service("ancientArticleSentenceService")
public class AncientArticleSentenceServiceImpl implements AncientArticleSentenceService {
    @Autowired
    AncientArticleSentenceFeignService ancientArticleSentenceFeignService;

    @Override
    public PageInfo listFullAncientArticleSentence(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo listAncientArticleSentenceByAncientArticleId(Integer ancientArticleId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo listAncientArticleSentenceByAuthorId(Integer ancientAuthorId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public AncientArticleSentence getAncientArticleSentenceById(Integer ancientArticleSentenceId) {
        return null;
    }

    @Override
    public Integer updateAncientArticleSentence(AncientArticleSentence ancientArticleSentence) {
        return null;
    }

    @Override
    public Integer insertAncientArticleSentence(AncientArticleSentence ancientArticleSentence) {
        return null;
    }
}
