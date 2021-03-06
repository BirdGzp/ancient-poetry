package com.moon.ancientpoetry.user.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.UserBasic;

import java.util.List;

public interface UserBasicService {
    /**
     * 获取全部的用户信息
     * @return
     */
    PageInfo<UserBasic> listFullUserBasic(Integer pageNum, Integer pageSize);

    /**
     * 根据用户主键 获得用户密码
     * @param userId
     * @return
     */
    UserBasic getUserFullBasicByUserId(Integer userId);

    /**
     * 根据用户 id  获得用户的基本信息
     * @param userId
     * @return
     */
    UserBasic getUserBriefBasicByUserId(Integer userId);

    /**
     * 根据用户手机号码 来查询用户
     * @param telephone
     * @return
     */
    UserBasic getUserBriefBasicByTelephone(String telephone);

    /**
     * 根据用户邮箱 获得用户密码等信息，用来校验
     * @param email
     * @return
     */
    UserBasic getCheckInfoByEmail(String email);

    /**
     * 根据用户手机号码 获得用户密码等信息，用来校验
     * @param userTelephone
     * @return
     */
    UserBasic getCheckInfoByTelephone(String userTelephone);



    /**
     * 更新用户基本信息
     * @param userBasic
     * @return
     */
    int updateUserBasic(UserBasic userBasic);

    /**
     * 插入一条用户基本信息
     * @param userBasic
     * @return
     */
    int insertUserBasic(UserBasic userBasic);

    /**
     * 校验密码是否正确
     * @param accountId  账号
     * @param password   密码
     * @return
     */
    Integer getPasswordCheckResult(String accountId, String password);
}
