package com.moon.ancientpoetry.user.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.OperationHistory;
import com.moon.ancientpoetry.user.core.mapper.OperationHistoryMapper;
import com.moon.ancientpoetry.user.core.service.OperationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:18
 * @Description:
 */
@Service("operationHistoryService")
public class OperationHistoryServiceImpl implements OperationHistoryService {

    @Autowired
    OperationHistoryMapper operationHistoryMapper;

    /**
     * 根据文章 id 和操作类型 查询操作记录
     * @param articleId
     * @return
     */
    @Override
    public PageInfo<OperationHistory> listOperationHistoryByUserIdAndOperationTypeOrderByTime(Integer articleId, Integer operatorType,
                                                                                              Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(operationHistoryMapper.listOperationHistoryByUserIdAndOperationTypeOrderByTime(articleId, operatorType));
    }


    /**
     * 根据用户id 查询一批记录(按时间排序)
     * @param userId
     * @return
     */
    @Override
    public PageInfo<OperationHistory> listOperationHistoryByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(operationHistoryMapper.listOperationHistoryByUserIdOrderByTime(userId));
    }

    /**
     * 批量修改一批记录的删除状态
     * @param operationHistoryList
     * @return
     */
    @Override
    public int updateBatchOperationHistoryDeleteState(List operationHistoryList){
        return operationHistoryMapper.updateBatchOperationHistoryDeleteState(operationHistoryList);
    }

    /**
     * 更新一条记录的删除状态
     * @param operationHistory
     * @return
     */
    @Override
    public int updateOperationHistoryDeleteState(OperationHistory operationHistory){
        return operationHistoryMapper.updateOperationHistoryDeleteState(operationHistory);
    }

    /**
     * 批量插入 一批 操作记录
     * @param operationHistoryList
     * @return
     */
    @Override
    public int insertBatchOperationHistory(List operationHistoryList){
        return operationHistoryMapper.insertBatchOperationHistory(operationHistoryList);
    }

    /**
     * 插入操作记录
     * @param operationHistory
     * @return
     */
    @Override
    public int insertOperationHistory(OperationHistory operationHistory){
        return operationHistoryMapper.insertOperationHistory(operationHistory);
    }
}
