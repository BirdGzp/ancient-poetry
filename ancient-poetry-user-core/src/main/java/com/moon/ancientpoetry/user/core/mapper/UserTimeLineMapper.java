package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.UserTimeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserTimeLineMapper {

    /**
     * 根据用户id 和 时间状态查询用户时间线信息，并通过时间排序(状态限定)
     * @param userId
     * @return
     */
    List<UserTimeLine> listUserTimeLineByUserIdAndEventStateOrderByTime(Integer userId, Byte eventState);

    /**
     * 根据用户id查询用户时间线信息，并通过时间排序
     * @param userId
     * @return
     */
    List<UserTimeLine> listUserTimeLineByUserIdOrderByTime(Integer userId);


    /**
     * 根据时间id 查询时间详细信息
     * @param evnetId
     * @return
     */
    UserTimeLine getUserTimeLineByEventId(Integer evnetId);

    /**
     * 批量 更新时间线信息
     * @param listUserTimeLines
     * @return
     */
    int updateBatchUserTimeLine(List<UserTimeLine> listUserTimeLines);

    /**
     * 更新时间线信息
     * @param userTimeLine
     * @return
     */
    int updateUserTimeLine(UserTimeLine userTimeLine);

    /**
     * 批量 插入用户的时间线信息
     * @param listUserTimeLines
     * @return
     */
    int insertBatchUserTimeLine(List<UserTimeLine> listUserTimeLines);

    /**
     * 插入一条用户的时间线信息
     * @param userTimeLine
     * @return
     */
    int insertUserTimeLine(UserTimeLine userTimeLine);
}