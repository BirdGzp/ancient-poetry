package com.moon.ancientpoetry.web.service.user.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.OperationHistory;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.web.feign.user.service.OperationHistoryFeignService;
import com.moon.ancientpoetry.web.service.user.OperationHistoryService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:23
 * @Description:
 */
@Service("operationHistoryService")
public class OperationHistoryServiceImpl implements OperationHistoryService   {
    @Autowired
    OperationHistoryFeignService operationHistoryFeignService;


    @Override
    public PageInfo<OperationHistory> listOperationHistoryByUserIdAndOperationTypeOrderByTime(Integer articleId, Integer operatorType, Integer pageNum, Integer pageSize) {
        String result = operationHistoryFeignService.listOperationHistoryByUserIdAndOperationTypeOrderByTime(articleId, operatorType, pageNum, pageSize);
        if(StringUtils.isBlank(result)){
            return null;
        }
        BaseDto baseDto = ParseToObject.parseToDto(result);

        PageInfo pageInfo = (PageInfo) baseDto.parseObject();
        return pageInfo;
    }

    @Override
    public PageInfo<OperationHistory> listOperationHistoryByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        String result = operationHistoryFeignService.listOperationHistoryByUserIdOrderByTime(userId, pageNum, pageSize);
        if(StringUtils.isBlank(result)){
            return null;
        }
        BaseDto baseDto = ParseToObject.parseToDto(result);

        PageInfo pageInfo = (PageInfo) baseDto.parseObject();
        return pageInfo;
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
        return Integer.parseInt(operationHistoryFeignService.insertOperationHistory(JSON.toJSONString(operationHistory)));
    }
}
