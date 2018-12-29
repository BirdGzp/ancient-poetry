package com.moon.ancientpoetry.user.web.service;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.user.web.dto.UserDto;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 19:05
 * @Description:
 */
public interface UserService {
    /**
     * 通过用户 id  获得用户的详细信息
     * @param userId
     * @return
     */
    UserDto getFullUserByUserId(Integer userId);

    /**
     * 根据用户手机号查询用户校验信息
     * @param telephone
     * @return
     */
    UserBasic getUserCheckInfoByTelephone(String telephone);

    /**
     * 根据用户邮箱号码查询用户校验信息
     * @param email
     * @return
     */
    UserBasic getUserCheckInfoByEmail(String email);

    /**
     * 根据用户 id 查询用户基本信息
     * @param userId
     * @return
     */
    UserBasic getUserBaiscByUserId(Integer userId);

    /**
     *
     * @param accountId 账户 id
     * @param password  加密后的密码
     * @return
     */
    UserBasic getPasswordCheckResult(String accountId, String password);

    /**
     * 插入一个新的用户基本信息
     * @param userDto
     * @return
     */
    Integer insertUser(UserDto userDto);
}
