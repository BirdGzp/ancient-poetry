package com.moon.ancientpoetry.web.util;

import org.springframework.util.DigestUtils;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/29 18:45
 * @Description:
 */
public class PrivacyEncrypt {

    /**
     * 密码加密方式
     * @param password
     * @return
     */
    public static String passwordEncrypt(String password){
        int count  = password.getBytes()[0] % 10;

        String result = password;
        for (int i = 0; i < count; i++) {
            result = DigestUtils.md5DigestAsHex(result.getBytes());
        }
        return result;
    }


}
