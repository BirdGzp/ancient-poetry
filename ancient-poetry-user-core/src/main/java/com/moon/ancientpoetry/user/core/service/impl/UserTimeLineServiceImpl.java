package com.moon.ancientpoetry.user.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.UserTimeLine;
import com.moon.ancientpoetry.user.core.mapper.UserTimeLineMapper;
import com.moon.ancientpoetry.user.core.service.UserTimeLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:22
 * @Description:
 */
@Service("userTimeLineService")
public class UserTimeLineServiceImpl implements UserTimeLineService {

    @Autowired
    UserTimeLineMapper userTimeLineMapper;

    /**
     * 根据用户id 和 时间状态查询用户时间线信息，并通过时间排序(状态限定)
     * @param userId
     * @return
     */
    @Override
    public PageInfo<UserTimeLine> listUserTimeLineByUserIdAndEventStateOrderByTime(Integer userId, Byte eventState,
                                                                                   Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(userTimeLineMapper.listUserTimeLineByUserIdAndEventStateOrderByTime(userId, eventState));
    }

    /**
     * 根据用户id查询用户时间线信息，并通过时间排序
     * @param userId
     * @return
     */
    @Override
    public PageInfo<UserTimeLine> listUserTimeLineByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(userTimeLineMapper.listUserTimeLineByUserIdOrderByTime(userId));
    }


    /**
     * 根据时间id 查询时间详细信息
     * @param evnetId
     * @return
     */
    @Override
    public UserTimeLine getUserTimeLineByEventId(Integer evnetId){
        return userTimeLineMapper.getUserTimeLineByEventId(evnetId);
    }

    /**
     * 批量 更新时间线信息
     * @param listUserTimeLines
     * @return
     */
    @Override
    public int updateBatchUserTimeLine(List<UserTimeLine> listUserTimeLines){
        return userTimeLineMapper.updateBatchUserTimeLine(listUserTimeLines);
    }

    /**
     * 更新时间线信息
     * @param userTimeLine
     * @return
     */
    @Override
    public int updateUserTimeLine(UserTimeLine userTimeLine){
        return userTimeLineMapper.updateUserTimeLine(userTimeLine);
    }

    /**
     * 批量 插入用户的时间线信息
     * @param listUserTimeLines
     * @return
     */
    @Override
    public int insertBatchUserTimeLine(List<UserTimeLine> listUserTimeLines){
        return userTimeLineMapper.insertBatchUserTimeLine(listUserTimeLines);
    }

    /**
     * 插入一条用户的时间线信息
     * @param userTimeLine
     * @return
     */
    @Override
    public int insertUserTimeLine(UserTimeLine userTimeLine){
        return userTimeLineMapper.insertUserTimeLine(userTimeLine);
    }
}
