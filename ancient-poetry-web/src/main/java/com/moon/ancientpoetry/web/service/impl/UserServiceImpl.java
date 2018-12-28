package com.moon.ancientpoetry.web.service.impl;

import com.moon.ancientpoetry.web.service.UserService;
import com.moon.ancientpoetry.web.util.RegularPattern;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:44
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    /**
     * 账号登录
     * @param accountId 账号 id  可以使邮箱，也可以是手机号码
     * @param password
     * @return
     */
    public boolean login(String accountId, String password){
        if(accountId.contains("@")){
            if(!RegularPattern.emailCheck(accountId)){
                return false;
            }

        }else {
            if(!RegularPattern.telephoneCheck(accountId)){
                return false;
            }

        }
        return true;
    }

}
