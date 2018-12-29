package com.moon.ancientpoetry.web.service.impl;

import com.moon.ancientpoetry.web.feign.service.UserFeignService;
import com.moon.ancientpoetry.web.service.UserService;
import com.moon.ancientpoetry.web.util.RegularPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:44
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserFeignService userFeignService;
    /**
     * 账号登录
     * @param accountId 账号 id  可以使邮箱，也可以是手机号码
     * @param password
     * @param  ip  ip 地址
     * @return
     */
    public boolean login(String accountId, String password, String ip){
        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
        String result = userFeignService.getPasswordCheckResult(accountId, md5Password, ip);
        System.out.println(md5Password);
        System.out.println(result);
        return true;
    }

}
