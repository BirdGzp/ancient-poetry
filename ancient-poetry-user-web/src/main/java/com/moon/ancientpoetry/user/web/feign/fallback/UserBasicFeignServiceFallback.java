package com.moon.ancientpoetry.user.web.feign.fallback;

import com.alibaba.fastjson.JSON;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.user.web.feign.service.UserBasicFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/20 10:03
 * @Description:
 */

@Component
@DefaultFallback
public class UserBasicFeignServiceFallback implements UserBasicFeignService {

    @Override
    public String getUserBasicByUserId(Integer name) {
        System.out.println("in method");
        return JSON.toJSONString(new BaseDto(ObjectType.ERROR, "null"));
    }

    @Override
    public String listFullUserBasic(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String getUserFullBasicByUserId(Integer userId) {
        return null;
    }

    @Override
    public String getUserBriefBasicByUserId(Integer userId) {
        return null;
    }

    @Override
    public String getUserBriefBasicByTelephone(String telephone) {
        return null;
    }

    @Override
    public String getCheckInfoByTelephone(String telephone) {
        return null;
    }

    @Override
    public String getCheckInfoByEmail(String email) {
        return null;
    }

    @Override
    public String updateUserBasic(UserBasic userBasic) {
        return null;
    }

    @Override
    public String insertUserBasic(UserBasic userBasic) {
        return null;
    }
}
