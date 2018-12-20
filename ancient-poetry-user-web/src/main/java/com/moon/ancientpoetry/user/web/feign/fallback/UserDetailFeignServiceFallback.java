package com.moon.ancientpoetry.user.web.feign.fallback;

import com.moon.ancientpoetry.user.web.feign.service.UserDetailFeignService;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 9:50
 * @Description:
 */
public class UserDetailFeignServiceFallback implements UserDetailFeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return null;
    }
}
