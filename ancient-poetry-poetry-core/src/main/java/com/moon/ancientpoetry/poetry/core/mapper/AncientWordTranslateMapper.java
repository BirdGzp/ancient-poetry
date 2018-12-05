package com.moon.ancientpoetry.poetry.core.mapper;

import com.moon.ancientpoetry.common.po.AncientWordTranslate;

public interface AncientWordTranslateMapper {
    int deleteByPrimaryKey(Integer articleWordId);

    int insert(AncientWordTranslate record);

    int insertSelective(AncientWordTranslate record);

    AncientWordTranslate selectByPrimaryKey(Integer articleWordId);

    int updateByPrimaryKeySelective(AncientWordTranslate record);

    int updateByPrimaryKey(AncientWordTranslate record);
}