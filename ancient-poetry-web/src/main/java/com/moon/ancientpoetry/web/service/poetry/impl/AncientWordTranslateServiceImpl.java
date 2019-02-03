package com.moon.ancientpoetry.web.service.poetry.impl;

import com.moon.ancientpoetry.common.po.AncientWordTranslate;
import com.moon.ancientpoetry.web.service.poetry.AncientWordTranslateService;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:17
 * @Description:
 */
@Service("ancientWordTranslateService")
public class AncientWordTranslateServiceImpl implements AncientWordTranslateService {
    @Override
    public String listFullAllAncientAuthor(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientWordTranslateByWordFromArticleId(Integer articleId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientWordTranslateByWordFromSentenceId(Integer sentenceId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientWordTranslateByWordId(Integer wordId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listAncientWordTranslateByWordId(Integer translateByWordId) {
        return null;
    }

    @Override
    public String updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate) {
        return null;
    }

    @Override
    public String insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate) {
        return null;
    }
}
