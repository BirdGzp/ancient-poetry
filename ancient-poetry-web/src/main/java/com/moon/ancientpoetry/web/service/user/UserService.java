package com.moon.ancientpoetry.web.service.user;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.web.dto.UserDto;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:20
 * @Description:
 */
public interface UserService {
    /**
     * 账号登录
     * @param accountId 账号 id  可以使邮箱，也可以是手机号码
     * @param password
     * @param ip 用户 ip 地址
     * @return
     */
    Integer login(String accountId, String password, String ip);


    /**
     * 根据 用户 id  获得基本信息
     * @param userId
     * @return
     */
    UserBasic getUserBriefBasicByUserId(Integer userId);

    /**
     * 根据用户 id  获得全部的用户基本信息
     * @param userId
     * @return
     */
    UserBasic getUserFullBasicByUserId(Integer userId);

    /**
     * 根据用户 id  获得用户全部信息+详细信息
     * @param userId
     * @return
     */
    UserDto getUserFullByUserId(Integer userId);

}
