package com.moon.ancientpoetry.user.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
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
    @GetMapping("/list/user/{userId}/{pageNum}/{pageSize}")
    public PageInfo listOperationHistoryByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return operationHistoryService.listOperationHistoryByUserIdOrderByTime(userId, pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/list/user/{userId}/operation-type/{operationType}/{pageNum}/{pageSize}")
    public PageInfo listOperationHistoryByUserIdAndOperationTypeOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "operationType", required = false) Integer operationType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize){
        return operationHistoryService.listOperationHistoryByUserIdAndOperationTypeOrderByTime(userId, operationType, pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("/update/batch/{operationHistoryList}")
    public int updateBatchOperationHistoryDeleteState(@PathVariable(name = "operationHistoryList", required = false) String operationHistoryList){
        return operationHistoryService.updateBatchOperationHistoryDeleteState(JSON.parseObject(operationHistoryList, new TypeReference<List<OperationHistory>>(){}));
    }

    @ResponseBody
    @GetMapping("/update/{operationHistory}")
    public int updateOperationHistoryDeleteState(@PathVariable(name = "operationHistory", required = false) String  operationHistory){
        return operationHistoryService.updateOperationHistoryDeleteState(JSON.parseObject(operationHistory, OperationHistory.class));
    }

    @ResponseBody
    @GetMapping("/insert/batch/{operationHistoryList}")
    public int insertBatchOperationHistory(@PathVariable(name = "operationHistoryList", required = false) String  operationHistoryList){
        return operationHistoryService.insertBatchOperationHistory(JSON.parseObject(operationHistoryList, new TypeReference<List<OperationHistory>>(){}));
    }

    @ResponseBody
    @GetMapping("/insert/batch/{operationHistory}")
    public int insertOperationHistory(@PathVariable(name = "operationHistory", required = false) String  operationHistory){
        return operationHistoryService.insertOperationHistory(JSON.parseObject(operationHistory, OperationHistory.class));
    }
}
