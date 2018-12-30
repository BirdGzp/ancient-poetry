package com.moon.ancientpoetry.user.core.util;

import com.moon.ancientpoetry.user.core.constant.Regular;

import java.util.regex.Pattern;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:54
 * @Description:
 */
public class RegularPattern {
    /**
     * 邮箱正则匹配
     * @param email
     * @return
     */
    public static boolean emailCheck(String email){
        return Pattern.matches(Regular.EMAIL_REGULAR, email);
    }

    /**
     * 手机正则匹配
     * @param telephone
     * @return
     */
    public static boolean telephoneCheck(String telephone){
        Pattern pattern = Pattern.compile(Regular.TELEPHONE_REGULAR, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(telephone).matches();
    }
}
