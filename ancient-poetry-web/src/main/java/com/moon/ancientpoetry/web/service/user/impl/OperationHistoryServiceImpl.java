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
    public PageInfo listOperationHistoryByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo listOperationHistoryByUserIdAndOperationTypeOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public Integer updateBatchOperationHistoryDeleteState(OperationHistory operationHistory) {
        return null;
    }

    @Override
    public Integer updateOperationHistoryDeleteState(OperationHistory operationHistory) {
        return null;
    }

    @Override
    public Integer insertBatchOperationHistory(List<OperationHistory> operationHistoryList) {
        return null;
    }

    @Override
    public Integer insertOperationHistory(OperationHistory operationHistory) {
        return null;
    }
}
