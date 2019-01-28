package com.moon.ancientpoetry.web.service.user;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.OperationHistory;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:23
 * @Description:
 */
public interface OperationHistoryService {
    PageInfo listOperationHistoryByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize);

    PageInfo listOperationHistoryByUserIdAndOperationTypeOrderByTime(Integer userId, Integer pageNum, Integer pageSize);

    Integer updateBatchOperationHistoryDeleteState(OperationHistory operationHistory);

    Integer updateOperationHistoryDeleteState(OperationHistory operationHistory);

    Integer insertBatchOperationHistory(List<OperationHistory> operationHistoryList);

    Integer insertOperationHistory(OperationHistory operationHistory);
}
