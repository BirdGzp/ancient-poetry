package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.OperationHistory;

public interface OperationHistoryMapper {
    int deleteByPrimaryKey(Integer operationId);

    int insert(OperationHistory record);

    int insertSelective(OperationHistory record);

    OperationHistory selectByPrimaryKey(Integer operationId);

    int updateByPrimaryKeySelective(OperationHistory record);

    int updateByPrimaryKey(OperationHistory record);
}