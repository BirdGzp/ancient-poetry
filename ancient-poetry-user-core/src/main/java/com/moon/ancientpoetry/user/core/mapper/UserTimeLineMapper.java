package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.UserTimeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserTimeLineMapper {

    /**
     * 查询用户时间线信息，并通过时间排序
     * @param userId
     * @return
     */
    List<UserTimeLine> listUserTimeLineOrderByTime(Integer userId);


    /**
     * 批量 更新时间线信息
     * @param listUserTimeLines
     * @return
     */
    int updateBatchTimeLine(List<UserTimeLine> listUserTimeLines);

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