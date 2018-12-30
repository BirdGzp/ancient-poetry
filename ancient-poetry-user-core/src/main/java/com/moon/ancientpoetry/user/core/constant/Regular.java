package com.moon.ancientpoetry.user.core.constant;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:49
 * @Description:
 */
public interface Regular {
    /** 邮箱正则 */
    String EMAIL_REGULAR = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";

    /** 手机正则 */
    String TELEPHONE_REGULAR = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";

    /** 姓名正则 */
    String NAME_REGULAR = "/^[\\da-zA-Z\\u4E00-\\u9FA5]{1,10}$/";
}
