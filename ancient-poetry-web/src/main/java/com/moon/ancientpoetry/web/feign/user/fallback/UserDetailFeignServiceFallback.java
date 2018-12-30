package com.moon.ancientpoetry.web.feign.user.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.UserDetail;
import com.moon.ancientpoetry.web.feign.user.service.UserDetailFeignService;
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
    public String updateUserDetail(UserDetail  userDetail) {
        return null;
    }

    @Override
    public String insertUserDetail(UserDetail userDetail) {
        return null;
    }
}
