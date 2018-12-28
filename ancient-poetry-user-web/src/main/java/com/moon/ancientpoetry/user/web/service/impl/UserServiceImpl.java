package com.moon.ancientpoetry.user.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.po.UserDetail;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.user.web.dto.UserDto;
import com.moon.ancientpoetry.user.web.feign.service.UserBasicFeignService;
import com.moon.ancientpoetry.user.web.feign.service.UserDetailFeignService;
import com.moon.ancientpoetry.user.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 19:06
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBasicFeignService userBasicFeignService;

    @Autowired
    private UserDetailFeignService userDetailFeignService;

    /**
     * 通过用户 id  获得用户的详细信息
     * @param userId
     * @return
     */
    @Override
    public UserDto getFullUserByUserId(Integer userId){
        if(userId == null){
            return null;
        }
        UserDto userDto = new UserDto();
        BaseDto baseDto = ParseToObject.parseToDto(userBasicFeignService.getUserBasicByUserId(userId));
        if(baseDto.getObjectType() == ObjectType.NULL){
            return null;
        }
        userDto.setUserBasic((UserBasic) baseDto.parseObject());
        baseDto = ParseToObject.parseToDto(userDetailFeignService.getUserDetailByUserId(userId));
        userDto.setUserDetail((UserDetail) baseDto.parseObject());
        return userDto;
    }


    /**
     * 根据用户手机号查询用户校验信息
     * @param telephone
     * @return
     */
    @Override
    public UserBasic getUserCheckInfoByTelephone(String telephone){
        return null;
    }

    /**
     * 根据用户邮箱号码查询用户校验信息
     * @param email
     * @return
     */
    @Override
    public UserBasic getUserCheckInfoByEmail(String email){
        return null;
    }


    /**
     * 根据用户 id 查询用户基本信息
     * @param userId
     * @return
     */
    @Override
    public UserBasic getUserBaiscByUserId(Integer userId){
        return null;
    }
}
