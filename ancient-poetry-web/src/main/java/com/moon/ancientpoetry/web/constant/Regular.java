package com.moon.ancientpoetry.web.constant;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:49
 * @Description:
 */
public interface Regular {
    /** 邮箱正则 */
    String EMAIL_REGULAR = "/\\w+([-+.]\\w+)@\\w+([-.]\\w+).\\w+([-.]\\w+)*/";

    /** 手机正则 */
    String TELEPHONE_REGULAR = "/^0?(1[345678][0-9])[0-9]{8}$/";

    /** 姓名正则 */
    String NAME_REGULAR = "/^[\\da-zA-Z\\u4E00-\\u9FA5]{1,10}$/";
}
