package com.moon.ancientpoetry.common.mapper;

import com.moon.ancientpoetry.common.po.AncientWord;

public interface AncientWordMapper {
    int deleteByPrimaryKey(Integer wordId);

    int insert(AncientWord record);

    int insertSelective(AncientWord record);

    AncientWord selectByPrimaryKey(Integer wordId);

    int updateByPrimaryKeySelective(AncientWord record);

    int updateByPrimaryKey(AncientWord record);
}