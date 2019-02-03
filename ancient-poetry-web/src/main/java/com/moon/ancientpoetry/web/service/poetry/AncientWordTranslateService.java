package com.moon.ancientpoetry.web.service.poetry;

import com.moon.ancientpoetry.common.po.AncientWordTranslate;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:15
 * @Description:
 */
public interface AncientWordTranslateService {

    String listFullAllAncientAuthor(Integer pageNum, Integer pageSize);

    String listAncientWordTranslateByWordFromArticleId(Integer articleId, Integer pageNum,Integer pageSize);

    String listAncientWordTranslateByWordFromSentenceId(Integer sentenceId, Integer pageNum, Integer pageSize);

    String listAncientWordTranslateByWordId(Integer wordId, Integer pageNum, Integer pageSize);

    String listAncientWordTranslateByWordId(Integer translateByWordId);

    String updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate);

    String insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate);
}
