package com.moon.ancientpoetry.web.feign.user.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.web.feign.user.service.RelationFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 10:02
 * @Description:
 */
@Component
@DefaultFallback
public class RelationFeignServiceFallback implements RelationFeignService {
    @Override
    public String listRelationByUserId(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listRelationByFollowId(Integer followId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String updateBatchRelationDeleteState(String relationList) {
        return null;
    }

    @Override
    public String updateRelationDeleteState(String relation) {
        return null;
    }

    @Override
    public String insertBatchRelation(String relationList) {
        return null;
    }

    @Override
    public String insertRelation(String relation) {
        return null;
    }
}
