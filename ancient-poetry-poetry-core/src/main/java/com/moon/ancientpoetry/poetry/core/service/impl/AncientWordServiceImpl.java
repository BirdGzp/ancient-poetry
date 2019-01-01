package com.moon.ancientpoetry.poetry.core.service.impl;

import com.moon.ancientpoetry.common.po.AncientWord;
import com.moon.ancientpoetry.poetry.core.mapper.AncientWordMapper;
import com.moon.ancientpoetry.poetry.core.service.AncientWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AncientWordServiceImpl implements AncientWordService {

    @Autowired
    AncientWordMapper ancientWordMapper;

    /**
     *  根据 id 查找字词信息
     * @param ancientWordId
     * @return
     */
    @Override
    public AncientWord getAncientWordByAncientWordId(Integer ancientWordId){
        return ancientWordMapper.getAncientWordByAncientWordId(ancientWordId);
    }

    /**
     * 通过字词 得到字词的信息
     * @param ancientWord
     * @return
     */
    @Override
    public AncientWord getAncientWordByAncientWord(String ancientWord){
        return  ancientWordMapper.getAncientWordByAncientWord(ancientWord);
    }

    /**
     * 插入一条古文的字词
     * @param ancientWord
     * @return
     */
    @Override
    public Integer insertAuthorWord(AncientWord ancientWord){
        return  ancientWordMapper.insertAuthorWord(ancientWord);
    }
}
