package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.UserTimeLine;

public interface UserTimeLineMapper {
    int deleteByPrimaryKey(Integer eventId);

    int insert(UserTimeLine record);

    int insertSelective(UserTimeLine record);

    UserTimeLine selectByPrimaryKey(Integer eventId);

    int updateByPrimaryKeySelective(UserTimeLine record);

    int updateByPrimaryKey(UserTimeLine record);
}