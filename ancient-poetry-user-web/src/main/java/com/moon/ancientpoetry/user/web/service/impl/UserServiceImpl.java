package com.moon.ancientpoetry.user.web.service.impl;

import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.po.UserDetail;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.user.web.dto.UserDto;
import com.moon.ancientpoetry.user.web.feign.service.UserBasicFeignService;
import com.moon.ancientpoetry.user.web.feign.service.UserDetailFeignService;
import com.moon.ancientpoetry.user.web.service.UserService;
import com.moon.ancientpoetry.user.web.util.RegularPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 19:06
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    Logger log = LoggerFactory.getLogger(UserService.class);

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

    /**
     *
     * @param accountId 账户 id
     * @param password  密码
     * @return
     */
    @Override
    public UserBasic getPasswordCheckResult(String accountId, String password){

        BaseDto baseDto = null;
        if(accountId.contains("@")){
            if(!RegularPattern.emailCheck(accountId)){
                return null;
            }
            baseDto = ParseToObject.parseToDto(userBasicFeignService.getCheckInfoByEmail(accountId));

        }else {
            if(!RegularPattern.telephoneCheck(accountId)){
                return null;
            }
            baseDto = ParseToObject.parseToDto(userBasicFeignService.getCheckInfoByTelephone(accountId));
        }


        if(baseDto == null || baseDto.getObjectType() != ObjectType.OBJECT){
            log.info("查询失败，请检查 com/moon/ancientpoetry/user/web/service/impl/UserServiceImpl.java:116");
            return null;
        }
        UserBasic userBasic = (UserBasic) baseDto.parseObject();
        if(password.equals(userBasic.getPassword())){
            userBasic.setPassword(null);
            return userBasic;
        }
        return null;
    }

    /**
     * 插入一个新的用户基本信息
     * @param userDto
     * @return
     */
    @Override
    @Transactional
    public Integer insertUser(UserDto userDto){
        BaseDto baseDto = null;
        if(userDto == null){
            return 0;
        }
        if(userDto.getUserBasic().getPassword() != null &&
                (userDto.getUserBasic().getTelephone() != null || userDto.getUserBasic().getEmail() != null)){
            baseDto = ParseToObject.parseToDto(userBasicFeignService.insertUserBasic(userDto.getUserBasic()));
            if((Integer)baseDto.parseObject() == 1){
                return 0;
            }
            baseDto = ParseToObject.parseToDto(userDetailFeignService.insertUserDetail(userDto.getUserDetail()));
            if((Integer)baseDto.parseObject() == 0){
                return 0;
            }
            return 1;
        }else {
            return 0;
        }
    }

}

