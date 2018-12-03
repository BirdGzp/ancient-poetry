package com.moon.ancientpoetry.common.mapper;

import com.moon.ancientpoetry.common.po.HistoryTimeLine;

public interface HistoryTimeLineMapper {
    int deleteByPrimaryKey(Integer eventId);

    int insert(HistoryTimeLine record);

    int insertSelective(HistoryTimeLine record);

    HistoryTimeLine selectByPrimaryKey(Integer eventId);

    int updateByPrimaryKeySelective(HistoryTimeLine record);

    int updateByPrimaryKey(HistoryTimeLine record);
}