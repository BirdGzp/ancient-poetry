package com.moon.ancientpoetry.user.web.feign.fallback;

import com.moon.ancientpoetry.common.fallback.DefaultFallback;
import com.moon.ancientpoetry.user.web.feign.service.UserDetailFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:50
 * @Description:
 */
@Component
@DefaultFallback
public class UserDetailFeignServiceFallback implements UserDetailFeignService {

    @Override
    public String getUserFullDetailByUserId(Integer userId) {
        return null;
    }

    @Override
    public String getUserDetailByUserId(Integer userId) {
        return null;
    }

    @Override
    public String updateBatchUserDetail(String listUserDetail) {
        return null;
    }

    @Override
    public String updateUserDetail(String userDetail) {
        return null;
    }

    @Override
    public String insertUserDetail(String userDetail) {
        return null;
    }
}
