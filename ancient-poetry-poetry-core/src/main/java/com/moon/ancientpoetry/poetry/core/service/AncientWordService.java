package com.moon.ancientpoetry.poetry.core.service;

import com.moon.ancientpoetry.common.po.AncientWord;

public interface AncientWordService {

    /**
     *  根据 id 查找字词信息
     * @param ancientWordId
     * @return
     */
    AncientWord getAncientWordByAncientWordId(Integer ancientWordId);

    /**
     * 通过字词 得到字词的信息
     * @param ancientWord
     * @return
     */
    AncientWord getAncientWordByAncientWord(String ancientWord);

    /**
     * 插入一条古文的字词
     * @param ancientWord
     * @return
     */
    Integer insertAuthorWord(AncientWord ancientWord);
}
