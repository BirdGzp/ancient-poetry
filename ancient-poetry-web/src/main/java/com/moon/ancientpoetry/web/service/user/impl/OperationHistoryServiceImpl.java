package com.moon.ancientpoetry.web.service.user.impl;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.OperationHistory;
import com.moon.ancientpoetry.web.feign.user.service.OperationHistoryFeignService;
import com.moon.ancientpoetry.web.service.user.OperationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:23
 * @Description:
 */
@Service("operationHistoryService")
public class OperationHistoryServiceImpl implements OperationHistoryService {
    @Autowired
    OperationHistoryFeignService operationHistoryFeignService;


    @Override
    public PageInfo<OperationHistory> listOperationHistoryByUserIdAndOperationTypeOrderByTime(Integer articleId, Integer operatorType, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo<OperationHistory> listOperationHistoryByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public int updateBatchOperationHistoryDeleteState(List operationHistoryList) {
        return 0;
    }

    @Override
    public int updateOperationHistoryDeleteState(OperationHistory operationHistory) {
        return 0;
    }

    @Override
    public int insertBatchOperationHistory(List operationHistoryList) {
        return 0;
    }

    @Override
    public int insertOperationHistory(OperationHistory operationHistory) {
        return 0;
    }
}
