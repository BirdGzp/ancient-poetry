package com.moon.ancientpoetry.web.feign.user.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.web.feign.user.service.LikeFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 10:02
 * @Description:
 */
@DefaultFallback
@Component
public class LikeFeignServiceFallback implements LikeFeignService {
    @Override
    public String listLikeByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String getCountByFromIdAndFromType(Integer fromId, Integer fromType) {
        return null;
    }

    @Override
    public String updateLikeDeleteState(String like) {
        return null;
    }

    @Override
    public String insertBatchLikes(String likeList) {
        return null;
    }

    @Override
    public String insertLike(String like) {
        return null;
    }
}
