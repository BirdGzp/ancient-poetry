package com.moon.history.line.core.mapper;

import com.moon.ancientpoetry.common.po.HistoryTimeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HistoryTimeLineMapper {


    /**
     * 根据上传用户查询用户上传的事件
     * @param eventId
     * @return
     */
    List<HistoryTimeLine> listHistoryTimeLineByUploadUserId(Integer eventId);

    /**
     * 根据事件有关的id 进行查找
     * @param eventOfType
     * @param eventOfId
     * @return
     */
    List<HistoryTimeLine> listHistoryTimeLineByEventOfId(Integer eventOfType,Integer eventOfId);

    /**
     * 通过事件id 获取事件详细信息
     * @param eventId
     * @return
     */
    HistoryTimeLine getHistoryTimeLineByEventId(Integer eventId);

    /**
     * 更新一条历史时间线记录
     * @param historyTimeLine
     * @return
     */
    int updateHistoryTimeLineByEventId(HistoryTimeLine historyTimeLine);

    /**
     * 插入一批历史时间记录
     * @param historyTimeLineList
     * @return
     */
    int insertBatchHistoryTimeLine(List<HistoryTimeLine> historyTimeLineList);

    /**
     * 插入一条历史的时间线
     * @param historyTimeLine  时间线记录
     * @return
     */
    int insertHistoryTimeLine(HistoryTimeLine historyTimeLine);
}