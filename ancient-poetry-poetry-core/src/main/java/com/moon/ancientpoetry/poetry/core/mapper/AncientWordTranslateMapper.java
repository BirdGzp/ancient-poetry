package com.moon.ancientpoetry.poetry.core.mapper;

import com.moon.ancientpoetry.common.po.AncientWordTranslate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AncientWordTranslateMapper {

    /**
     * 返回全部的 字词翻译
     * @return
     */
    List<AncientWordTranslate> listFullAncientWordTranslate();

    /**
     * 根据句子 id  返回句子中的字词翻译
     * @param wordFromSentenceId
     * @return
     */
    List<AncientWordTranslate> listAncientWordTranslateByWordFromSentenceId(Integer wordFromSentenceId);

    /**
     * 根据文章id 返回文章的字词翻译
     * @param wordFromArticleId
     * @return
     */
    List<AncientWordTranslate> listAncientWordTranslateByWordFromArticleId(Integer wordFromArticleId);

    /**
     * 根据字词  获得所有有关的翻译
     * @param wordId
     * @return
     */
    List<AncientWordTranslate> listAncientWordTranslateByWordId(Integer wordId);

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