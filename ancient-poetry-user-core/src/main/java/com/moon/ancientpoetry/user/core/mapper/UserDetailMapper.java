package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.UserDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDetailMapper {


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
    int updateUserDetail(List<UserDetail> listUserDetail);

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