package com.moon.ancientpoetry.web.service.user.impl;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.UserTimeLine;
import com.moon.ancientpoetry.web.feign.user.service.UserTimeLineFeignService;
import com.moon.ancientpoetry.web.service.user.UserTimeLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:23
 * @Description:
 */
@Service("userTimeLineService")
public class UserTimeLineServiceImpl implements UserTimeLineService{
    @Autowired
    UserTimeLineFeignService userTimeLineFeignService;

    @Override
    public PageInfo<UserTimeLine> listUserTimeLineByUserIdAndEventStateOrderByTime(Integer userId, Byte eventState, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo<UserTimeLine> listUserTimeLineByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public UserTimeLine getUserTimeLineByEventId(Integer evnetId) {
        return null;
    }

    @Override
    public int updateBatchUserTimeLine(List<UserTimeLine> listUserTimeLines) {
        return 0;
    }

    @Override
    public int updateUserTimeLine(UserTimeLine userTimeLine) {
        return 0;
    }

    @Override
    public int insertBatchUserTimeLine(List<UserTimeLine> listUserTimeLines) {
        return 0;
    }

    @Override
    public int insertUserTimeLine(UserTimeLine userTimeLine) {
        return 0;
    }
}
