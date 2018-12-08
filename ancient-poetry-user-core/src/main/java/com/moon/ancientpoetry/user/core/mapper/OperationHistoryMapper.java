package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.HistoryTimeLine;
import com.moon.ancientpoetry.common.po.OperationHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperationHistoryMapper {

    /**
     * 根据文章 id 和操作类型 查询操作记录
     * @param articleId
     * @return
     */
    List<OperationHistory> listOperationHistoryByUserIdAndOperationType(Integer articleId);


    /**
     * 根据用户id 查询一批记录(按时间排序)
     * @param UserId
     * @return
     */
    List<OperationHistory> listOperationHistoryByUserIdOrderByTime(Integer UserId);

    /**
     * 批量修改一批记录的删除状态
     * @param operationHistoryList
     * @return
     */
    int updateBatchOperationHistoryDeleteState(List operationHistoryList);

    /**
     * 更新一条记录的删除状态
     * @param operationHistory
     * @return
     */
    int updateOperationHistoryDeleteState(OperationHistory operationHistory);

    /**
     * 批量插入 一批 操作记录
     * @param operationHistoryList
     * @return
     */
    int insertBatchOperationHistory(List operationHistoryList);

    /**
     * 插入操作记录
     * @param operationHistory
     * @return
     */
    int insertOperationHistory(OperationHistory operationHistory);



}