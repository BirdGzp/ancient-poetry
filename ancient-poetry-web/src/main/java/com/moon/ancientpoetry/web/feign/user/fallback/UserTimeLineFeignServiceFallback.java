package com.moon.ancientpoetry.web.feign.user.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.web.feign.user.service.UserTimeLineFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 10:03
 * @Description:
 */
@Component
@DefaultFallback
public class UserTimeLineFeignServiceFallback implements UserTimeLineFeignService {
    @Override
    public String listUserTimeLineByUserIdAndEventStateOrderByTime(Integer userId, Byte eventType, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listUserTimeLineByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listUserTimeLineByUserIdOrderByTime(Integer eventId) {
        return null;
    }

    @Override
    public String updateBatchUserTimeLine(String listUserTimeLine) {
        return null;
    }

    @Override
    public String updateUserTimeLine(String userTimeLine) {
        return null;
    }

    @Override
    public String insertBatchUserTimeLine(String listUserTimeLine) {
        return null;
    }

    @Override
    public String insertUserTimeLine(String userTimeLine) {
        return null;
    }
}
