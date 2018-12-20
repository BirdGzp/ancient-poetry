package com.moon.ancientpoetry.user.web.feign.fallback;

import com.moon.ancientpoetry.user.web.feign.service.UserBasicFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 10:03
 * @Description:
 */

@Component
public class UserBasicFeignServiceFallback implements UserBasicFeignService {

    @Override
    public String getUserBasic(Integer name) {
        return "error";
    }
}
