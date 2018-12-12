package com.moon.ancientpoetry.user.core.service;

import com.moon.ancientpoetry.common.po.UserDetail;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:17
 * @Description:
 */
public interface UserDetailService {
    /**
     * 根据用户 id  获得用户的全部详细信息
     * @param userId
     * @return
     */
    UserDetail getUserFullDetailByUserId(Integer userId);


    /**
     * 根据用户 id  获得用户的详细信息
     * @param userId
     * @return
     */
    UserDetail getUserDetailByUserId(Integer userId);

    /**
     * 批量更新 用户详细信息
     * @param listUserDetail
     * @return
     */
    int updateBatchUserDetail(List<UserDetail> listUserDetail);

    /**
     * 更新用户详细信息
     * @param userDetail
     * @return
     */
    int updateUserDetail(UserDetail userDetail);

    /**
     * 插入一条用户详细信息
     * @param userDetail
     * @return
     */
    int insertUserDetail(UserDetail userDetail);
}
