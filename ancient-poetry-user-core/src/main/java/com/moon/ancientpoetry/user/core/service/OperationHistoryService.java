package com.moon.ancientpoetry.user.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.OperationHistory;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:15
 * @Description:
 */
public interface OperationHistoryService {
    /**
     * 根据文章 id 和操作类型 查询操作记录
     * @param articleId
     * @return
     */
    PageInfo<OperationHistory> listOperationHistoryByUserIdAndOperationTypeOrderByTime(Integer articleId, Integer operatorType,
                                                                                       Integer pageNum,Integer pageSize);


    /**
     * 根据用户id 查询一批记录(按时间排序)
     * @param userId
     * @return
     */
    PageInfo<OperationHistory> listOperationHistoryByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize);

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
