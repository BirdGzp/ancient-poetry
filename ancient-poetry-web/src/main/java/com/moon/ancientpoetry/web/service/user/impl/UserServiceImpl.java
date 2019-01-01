package com.moon.ancientpoetry.web.service.user.impl;

import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.web.dto.UserDto;
import com.moon.ancientpoetry.web.feign.user.service.UserBasicFeignService;
import com.moon.ancientpoetry.web.service.user.UserService;
import com.moon.ancientpoetry.web.util.PrivacyEncrypt;
import com.moon.ancientpoetry.web.vo.IndexVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        System.out.println(md5Password);
        if(baseDto.getObjectType() == ObjectType.NULL){
            log.debug("查询对象为null");
            return null;
        }
        System.out.println(baseDto.parseObject());
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
        return null;
    }

    /**
     * 根据用户 id  获得全部的用户基本信息
     * @param userId
     * @return
     */
    @Override
    public UserBasic getUserFullBasicByUserId(Integer userId){
        return null;
    }

    /**
     * 根据用户 id  获得用户全部信息+详细信息
     * @param userId
     * @return
     */
    @Override
    public UserDto getUserFullByUserId(Integer userId){
        return null;
    }


    /**
     * 根据用户id  返回首页信息
     * @param userId
     * @return
     */
    public IndexVo index(String userId){
        IndexVo indexVo = new IndexVo();

        return indexVo;
    }

}
