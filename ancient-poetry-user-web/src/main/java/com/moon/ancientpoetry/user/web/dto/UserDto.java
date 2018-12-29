package com.moon.ancientpoetry.user.web.dto;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.po.UserDetail;

import java.io.Serializable;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/14 19:59
 * @Description:
 */
public class UserDto {
    /** 用户基本信息 */
    private UserBasic userBasic;
    /** 用户详细信息 */
    private UserDetail userDetail;

    public UserDto() {
    }

    public UserDto(UserBasic userBasic, UserDetail userDetail) {
        this.userBasic = userBasic;
        this.userDetail = userDetail;
    }

    public UserBasic getUserBasic() {
        return userBasic;
    }

    public void setUserBasic(UserBasic userBasic) {
        this.userBasic = userBasic;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
