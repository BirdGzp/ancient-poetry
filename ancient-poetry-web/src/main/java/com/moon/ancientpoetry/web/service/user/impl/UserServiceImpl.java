package com.moon.ancientpoetry.web.service.user.impl;

import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.po.UserDetail;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.web.dto.UserDto;
import com.moon.ancientpoetry.web.dto.convert.UserDtoConvert;
import com.moon.ancientpoetry.web.feign.user.service.UserBasicFeignService;
import com.moon.ancientpoetry.web.feign.user.service.UserDetailFeignService;
import com.moon.ancientpoetry.web.service.user.UserService;
import com.moon.ancientpoetry.web.util.PrivacyEncrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:44
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserBasicFeignService userBasicFeignService;

    @Autowired
    UserDetailFeignService userDetailFeignService;
    /**
     * 账号登录
     * @param accountId 账号 id  可以使邮箱，也可以是手机号码
     * @param password
     * @param  ip  ip 地址
     * @return
     */
    public Integer login(String accountId, String password, String ip){
        String md5Password = PrivacyEncrypt.md5Encrypt(password);
        BaseDto baseDto = ParseToObject.parseToDto(userBasicFeignService.getPasswordCheckResult(accountId, md5Password, ip));
        if(baseDto.getObjectType() == ObjectType.NULL){
            log.debug("查询对象为null");
            return null;
        }
        return (Integer) baseDto.parseObject();
    }

    /**
     * 根据 用户 id  获得基本信息
     * @param userId
     * @return
     */
    @Override
    public UserBasic getUserBriefBasicByUserId(Integer userId){
        if(userId == null){
            return null;
        }
        return (UserBasic) ParseToObject.parseToDto(userBasicFeignService.getUserBriefBasicByUserId(userId)).parseObject();
    }

    /**
     * 根据用户 id  获得全部的用户基本信息
     * @param userId
     * @return
     */
    @Override
    public UserBasic getUserFullBasicByUserId(Integer userId){
        return (UserBasic) ParseToObject.parseToDto(userBasicFeignService.getUserBasicByUserId(userId)).parseObject();
    }

    /**
     * 根据用户 id  获得用户全部信息+详细信息
     * @param userId
     * @return
     */
    @Override
    public UserDto getUserFullByUserId(Integer userId){
        BaseDto userBasicBaseDto = ParseToObject.parseToDto(userBasicFeignService.getUserBasicByUserId(userId));
        if(userBasicBaseDto.getObjectType() != ObjectType.OBJECT){
            log.info("查询用户信息为 null" + userId);
        }
        BaseDto userDetailBaseDto = ParseToObject.parseToDto(userDetailFeignService.getUserDetailByUserId(userId));
        if(userDetailBaseDto.getObjectType() != ObjectType.OBJECT){
            log.info("查询用户信息为 null" + userId);
        }
        return  UserDtoConvert.buildUserDto((UserBasic) userBasicBaseDto.parseObject(), (UserDetail) userDetailBaseDto.parseObject());



    }

    /**
     * 传入 手机号码 和 笔名，快速创建用户
     * @param telephone
     * @param penName
     * @return
     */
    @Transactional
    public Integer fastInsertUser(String telephone, String penName, String password){
        if(telephone == null){
            return 0;
        }
        if(penName == null){
            return 0;
        }
        UserBasic userBasic = new UserBasic();
        userBasic.setTelephone(telephone);
        userBasic.setPassword(PrivacyEncrypt.md5Encrypt(password));
        BaseDto userBasicBaseDto = ParseToObject.parseToDto(userBasicFeignService.insertUserBasic(userBasic));
        if(userBasicBaseDto.getObjectType() != ObjectType.OBJECT){
            log.error("插入失败");
            throw new RuntimeException("");
        }
        userBasicBaseDto = ParseToObject.parseToDto(userBasicFeignService.getUserBriefBasicByTelephone(telephone));
        if(userBasicBaseDto.getObjectType() != ObjectType.OBJECT){
            log.error("插入后，查询不到插入的数据");
            throw new RuntimeException("");
        }
        UserDetail userDetail = new UserDetail();
        userDetail.setUserId(((UserBasic)userBasicBaseDto.parseObject()).getUserId());
        BaseDto userDetailBaseDto = ParseToObject.parseToDto(userDetailFeignService.insertUserDetail(userDetail));
        if(userDetailBaseDto.getObjectType() == ObjectType.OBJECT){
            return (Integer) userBasicBaseDto.parseObject();
        }
        return 0;
    }

    /**
     * 更新用户详细信息
     * @param userDto
     * @return
     */
    public Integer updateUser(UserDto userDto){
        UserBasic userBasic = UserDtoConvert.buildUserBaiscByUserDto(userDto);
        BaseDto baseDto = ParseToObject.parseToDto(userBasicFeignService.insertUserBasic(userBasic));
        if(baseDto.getObjectType() != ObjectType.OBJECT){

        }
        UserDetail userDetail = UserDtoConvert.buildUserDetailByUserDto(userDto);
        userDetailFeignService.updateUserDetail(userDetail);
        return 1;
    }

}
