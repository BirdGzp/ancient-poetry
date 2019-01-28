package com.moon.ancientpoetry.web.service.user.impl;

import com.moon.ancientpoetry.web.feign.user.service.RelationFeignService;
import com.moon.ancientpoetry.web.service.user.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:24
 * @Description:
 */
@Service("relationService")
public class RelationServiceImpl implements RelationService {
    @Autowired
    RelationFeignService relationFeignService;
}
