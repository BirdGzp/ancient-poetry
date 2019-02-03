package com.moon.ancientpoetry.web.service.poetry.impl;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientWordTranslate;
import com.moon.ancientpoetry.web.service.poetry.AncientAuthorService;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:17
 * @Description:
 */
@Service("ancientAuthorService")
public class AncientAuthorServiceImpl implements AncientAuthorService {
    @Override
    public PageInfo listFullAncientWordTranslate(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo listAncientWordTranslateByWordFromSentenceId(Integer wordFromSentenceId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo listAncientWordTranslateByWordFromArticleId(Integer wordFromArticleId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo listAncientWordTranslateByWordId(Integer wordId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public AncientWordTranslate getAncientWordTranslateByAncientWordId(Integer ancientWordId) {
        return null;
    }

    @Override
    public Integer updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate) {
        return null;
    }

    @Override
    public Integer insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate) {
        return null;
    }
}
