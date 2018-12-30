package com.moon.ancientpoetry.web.feign.user.service;

import com.moon.ancientpoetry.web.feign.user.fallback.LikeFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:59
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-USER-CORE", fallback = LikeFeignServiceFallback.class)
public interface OperationHistoryFeignService {
    
    @RequestMapping(value = "/list/user/{userId}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listOperationHistoryByUserIdOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/list/user/{userId}/operation-type/{operationType}/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listOperationHistoryByUserIdAndOperationTypeOrderByTime(
            @PathVariable(name = "userId", required = false) Integer userId,
            @PathVariable(name = "operationType", required = false) Integer operationType,
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);

    
    @RequestMapping(value = "/update/batch/{operationHistoryList}", method = RequestMethod.POST)
    String updateBatchOperationHistoryDeleteState(@PathVariable(name = "operationHistoryList", required = false) String operationHistoryList);

    
    @RequestMapping(value = "/update/{operationHistory}", method = RequestMethod.POST)
    String updateOperationHistoryDeleteState(@PathVariable(name = "operationHistory", required = false) String operationHistory);


    @RequestMapping(value = "/insert/batch/{operationHistoryList}", method = RequestMethod.POST)
    String insertBatchOperationHistory(@PathVariable(name = "operationHistoryList", required = false) String operationHistoryList);


    @RequestMapping(value = "/insert/batch/{operationHistory}", method = RequestMethod.POST)
    String insertOperationHistory(@PathVariable(name = "operationHistory", required = false) String operationHistory);
}
