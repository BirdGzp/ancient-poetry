package com.moon.ancientpoetry.web.service.poetry;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientWordTranslate;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:14
 * @Description:
 */
public interface AncientAuthorService{
    /**
     * 返回全部的 字词翻译
     * @return
     */
    PageInfo listFullAncientWordTranslate(Integer pageNum, Integer pageSize);

    /**
     * 根据句子 id  返回句子中的字词翻译
     * @param wordFromSentenceId
     * @return
     */
    PageInfo listAncientWordTranslateByWordFromSentenceId(Integer wordFromSentenceId, Integer pageNum, Integer pageSize);

    /**
     * 根据文章id 返回文章的字词翻译
     * @param wordFromArticleId
     * @return
     */
    PageInfo listAncientWordTranslateByWordFromArticleId(Integer wordFromArticleId, Integer pageNum, Integer pageSize);

    /**
     * 根据字词  获得所有有关的翻译
     * @param wordId
     * @return
     */
    PageInfo listAncientWordTranslateByWordId(Integer wordId, Integer pageNum, Integer pageSize);

    /**
     * 根据 古文字词id 去获得字词信息
     * @param ancientWordId
     * @return
     */
    AncientWordTranslate getAncientWordTranslateByAncientWordId(Integer ancientWordId);

    /**
     * 更新记录——字词的翻译
     * @param ancientWordTranslate
     * @return
     */
    Integer updateAncientWordTranslate(AncientWordTranslate ancientWordTranslate);

    /**
     * 插入一条新记录 —— 字的翻译
     * @param ancientWordTranslate
     * @return
     */
    Integer insertAncientWordTranslate(AncientWordTranslate ancientWordTranslate);
}
