package com.moon.ancientpoetry.common.mapper;

import com.moon.ancientpoetry.common.po.AncientDynasty;

public interface AncientDynastyMapper {
    int deleteByPrimaryKey(Integer dynastyId);

    int insert(AncientDynasty record);

    int insertSelective(AncientDynasty record);

    AncientDynasty selectByPrimaryKey(Integer dynastyId);

    int updateByPrimaryKeySelective(AncientDynasty record);

    int updateByPrimaryKey(AncientDynasty record);
}