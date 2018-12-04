package com.moon.ancientpoetry.user.core.service;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.user.core.mapper.UserBasicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSeriveImpl {
    @Autowired
    private UserBasicMapper userBasicMapper;

    public UserBasic insertUser() {
        UserBasic userBasic = new UserBasic();
        userBasic.setPenName("巨子");
        userBasic.setTelephone("15797631630");
        userBasic.setIp("192.168.1.1");
        userBasicMapper.insert(userBasic);
        return userBasic;
    }
}
