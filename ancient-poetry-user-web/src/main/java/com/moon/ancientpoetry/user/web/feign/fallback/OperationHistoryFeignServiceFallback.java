package com.moon.ancientpoetry.user.web.feign.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.user.web.feign.service.OperationHistoryFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 10:02
 * @Description:
 */
@Component
@DefaultFallback
public class OperationHistoryFeignServiceFallback implements OperationHistoryFeignService {
    @Override
    public String listOperationHistoryByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listOperationHistoryByUserIdAndOperationTypeOrderByTime(Integer userId, Integer operationType, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String updateBatchOperationHistoryDeleteState(String operationHistoryList) {
        return null;
    }

    @Override
    public String updateOperationHistoryDeleteState(String operationHistory) {
        return null;
    }

    @Override
    public String insertBatchOperationHistory(String operationHistoryList) {
        return null;
    }

    @Override
    public String insertOperationHistory(String operationHistory) {
        return null;
    }
}
