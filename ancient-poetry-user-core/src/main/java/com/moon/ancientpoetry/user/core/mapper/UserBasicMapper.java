package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.UserBasic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserBasicMapper {

    /**
     * 获取全部的用户信息
     * @return
     */
    List<UserBasic> listFullUserBasic();

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
     * @param userTelephone
     * @return
     */
    UserBasic getUserBriefBasicByUserTelephone(String userTelephone);

    /**
     * 根据用户邮箱 获得用户密码等信息，用来校验
     * @param userEmail
     * @return
     */
    UserBasic getCheckInfoByUserEmail(String userEmail);

    /**
     * 根据用户手机号码 获得用户密码等信息，用来校验
     * @param userTelephone
     * @return
     */
    UserBasic getCheckInfoByUserTelephone(String userTelephone);


    /**
     * 批量更新 用户基本信息
     * @param listUserBasic
     * @return
     */
    int updateBatchUserBasic(List<UserBasic> listUserBasic);

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
}