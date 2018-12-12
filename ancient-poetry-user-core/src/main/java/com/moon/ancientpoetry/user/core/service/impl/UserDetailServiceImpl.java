package com.moon.ancientpoetry.user.core.service.impl;

import com.moon.ancientpoetry.common.po.UserDetail;
import com.moon.ancientpoetry.user.core.mapper.UserDetailMapper;
import com.moon.ancientpoetry.user.core.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:21
 * @Description:
 */
@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    UserDetailMapper userDetailMapper;

    /**
     * 根据用户 id  获得用户的全部详细信息
     * @param userId
     * @return
     */
    @Override
    public UserDetail getUserFullDetailByUserId(Integer userId){
        return userDetailMapper.getUserFullDetailByUserId(userId);
    }


    /**
     * 根据用户 id  获得用户的详细信息
     * @param userId
     * @return
     */
    @Override
    public UserDetail getUserDetailByUserId(Integer userId){
        return userDetailMapper.getUserDetailByUserId(userId);
    }

    /**
     * 批量更新 用户详细信息
     * @param listUserDetail
     * @return
     */
    @Override
    public int updateBatchUserDetail(List<UserDetail> listUserDetail){
        return userDetailMapper.updateBatchUserDetail(listUserDetail);
    }

    /**
     * 更新用户详细信息
     * @param userDetail
     * @return
     */
    @Override
    public int updateUserDetail(UserDetail userDetail){
        return userDetailMapper.updateUserDetail(userDetail);
    }

    /**
     * 插入一条用户详细信息
     * @param userDetail
     * @return
     */
    @Override
    public int insertUserDetail(UserDetail userDetail){
        return userDetailMapper.insertUserDetail(userDetail);
    }
}
