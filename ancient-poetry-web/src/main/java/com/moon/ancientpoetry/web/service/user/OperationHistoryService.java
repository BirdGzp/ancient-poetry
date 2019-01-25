package com.moon.ancientpoetry.web.service.user;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.OperationHistory;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:23
 * @Description:
 */
public interface OperationHistoryService {
    PageInfo listOperationHistoryByUserIdOrderByTime(Integer pageNum, Integer pageSize);

    PageInfo listOperationHistoryByUserIdAndOperationTypeOrderByTime(Integer userId, Integer pageNum, Integer pageSize);

    Integer updateBatchOperationHistoryDeleteState(OperationHistory operationHistory);

    updateOperationHistoryDeleteState;

    insertBatchOperationHistory;

    insertOperationHistory;
}
