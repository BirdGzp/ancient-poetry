package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.OperationHistory;
import com.moon.ancientpoetry.user.core.service.OperationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:13
 * @Description:
 */
@RestController
@RequestMapping("/operation-history")
public class OperationHistoryController {
    @Autowired
    OperationHistoryService operationHistoryService;

    @ResponseBody
    @PostMapping("/list/user/{userId}/{pageNum}/{pageSize}")
    public BaseDto listOperationHistoryByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, operationHistoryService.listOperationHistoryByUserIdOrderByTime(userId, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/list/user/{userId}/operation-type/{operationType}/{pageNum}/{pageSize}")
    public BaseDto listOperationHistoryByUserIdAndOperationTypeOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "operationType", required = false) Integer operationType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return new BaseDto(ObjectType.OBJECT, operationHistoryService.listOperationHistoryByUserIdAndOperationTypeOrderByTime(userId, operationType, pageNum, pageSize));
    }

    @ResponseBody
    @PostMapping("/update/batch/{operationHistoryList}")
    public BaseDto updateBatchOperationHistoryDeleteState(@PathVariable(name = "operationHistoryList", required = false) String operationHistoryList){
        return new BaseDto(ObjectType.OBJECT, operationHistoryService.updateBatchOperationHistoryDeleteState(
                JSON.parseObject(operationHistoryList, new TypeReference<List<OperationHistory>>(){})));
    }

    @ResponseBody
    @PostMapping("/update/{operationHistory}")
    public BaseDto updateOperationHistoryDeleteState(@PathVariable(name = "operationHistory", required = false) String  operationHistory){
        return new BaseDto(ObjectType.OBJECT, operationHistoryService.updateOperationHistoryDeleteState(
                JSON.parseObject(operationHistory, OperationHistory.class)));
    }

    @ResponseBody
    @PostMapping("/insert/batch/{operationHistoryList}")
    public BaseDto insertBatchOperationHistory(@PathVariable(name = "operationHistoryList", required = false) String  operationHistoryList){
        return new BaseDto(ObjectType.OBJECT, operationHistoryService.insertBatchOperationHistory(
                JSON.parseObject(operationHistoryList, new TypeReference<List<OperationHistory>>(){})));
    }

    @ResponseBody
    @PostMapping("/insert/batch/{operationHistory}")
    public BaseDto insertOperationHistory(@PathVariable(name = "operationHistory", required = false) String  operationHistory){
        return new BaseDto(ObjectType.OBJECT, operationHistoryService.insertOperationHistory(
                JSON.parseObject(operationHistory, OperationHistory.class)));
    }
}
