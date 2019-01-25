package com.moon.ancientpoetry.web.service.user.impl;

import com.moon.ancientpoetry.web.feign.user.service.OperationHistoryFeignService;
import com.moon.ancientpoetry.web.service.user.OperationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:23
 * @Description:
 */
@Service("operationHistoryService")
public class OperationHistoryServiceImpl implements OperationHistoryService {
    @Autowired
    OperationHistoryFeignService operationHistoryFeignService;


}
