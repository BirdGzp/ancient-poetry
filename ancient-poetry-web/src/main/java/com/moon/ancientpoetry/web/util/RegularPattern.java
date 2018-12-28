package com.moon.ancientpoetry.web.util;

import com.moon.ancientpoetry.web.constant.Regular;

import java.util.regex.Pattern;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:54
 * @Description:
 */
public class RegularPattern {
    public static boolean emailCheck(String email){
        return Pattern.matches(Regular.EMAIL_REGULAR, email);
    }

    public static boolean telephoneCheck(String telephone){
        return Pattern.matches(Regular.TELEPHONE_REGULAR, telephone);
    }
}
