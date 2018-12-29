package com.moon.ancientpoetry.web.feign.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.web.dto.UserDto;
import com.moon.ancientpoetry.web.feign.service.UserFeignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 18:42
 * @Description:
 */
@Component
@DefaultFallback
public class UserFeignServiceFallback implements UserFeignService {
    @Override
    public String getUserId(Integer id) {
        return null;
    }

    @Override
    public String getPasswordCheckResult(String accountId, String password, String ip) {
        return null;
    }

    @Override
    public String getCheckInfoByEmail(String email) {
        return null;
    }

    @Override
    public Integer insertUser(UserDto userDto) {
        return null;
    }
}
