package com.moon.ancientpoetry.user.core.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.cache.RedisService;
import com.moon.ancientpoetry.common.cache.RedisSet;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.user.core.mapper.UserBasicMapper;
import com.moon.ancientpoetry.user.core.service.UserBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service("userBasicService")
public class UserBasicServiceImpl implements UserBasicService {

    @Autowired
    UserBasicMapper userBasicMapper;
    @Autowired
    RedisService redisService;


    /**
     * 获取全部的用户信息
     * @return
     */
    @Override
    public PageInfo<UserBasic> listFullUserBasic(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<UserBasic>(userBasicMapper.listFullUserBasic());
    }

    /**
     * 根据用户主键 获得用户密码
     * @param userId
     * @return
     */
    @Override
    @RedisSet
    @Cacheable( value = "UserBasic" , sync = true)
    public UserBasic getUserFullBasicByUserId(Integer userId){
        UserBasic userBasic =  userBasicMapper.getUserFullBasicByUserId(userId);
        if(userBasic == null){
            userBasic = new UserBasic();
            userBasic.setPenName(123 + "123");
        }

        return userBasic;

    }

    /**
     * 根据用户 id  获得用户的基本信息
     * @param userId
     * @return
     */
    @Override
    @RedisSet
    @Cacheable( value = "UserBasic" , sync = true)
    public UserBasic getUserBriefBasicByUserId(Integer userId){
        UserBasic userBasic =  userBasicMapper.getUserBriefBasicByUserId(userId);
        if(userBasic == null){
            userBasic = new UserBasic();
            userBasic.setPenName(123 + "1");
        }
        return userBasic;
    }

    /**
     * 根据用户手机号码 来查询用户
     * @param userTelephone
     * @return
     */
    @Override
    public UserBasic getUserBriefBasicByTelephone(String userTelephone){
        return userBasicMapper.getUserBriefBasicByTelephone(userTelephone);
    }

    /**
     * 根据用户邮箱 获得用户密码等信息，用来校验
     * @param email
     * @return
     */
    @Override
    public UserBasic getCheckInfoByEmail(String email){
        return userBasicMapper.getCheckInfoByEmail(email);
    }

    /**
     * 根据用户手机号码 获得用户密码等信息，用来校验
     * @param telephone
     * @return
     */
    @Override
    public UserBasic getCheckInfoByTelephone(String telephone){
        return userBasicMapper.getCheckInfoByTelephone(telephone);
    }



    /**
     * 更新用户基本信息
     * @param userBasic
     * @return
     */
    @Override
    @CacheEvict(value = "UserBasic")
    public int updateUserBasic(UserBasic userBasic){
        return userBasicMapper.updateUserBasic(userBasic);
    }

    /**
     * 插入一条用户基本信息
     * @param userBasic
     * @return
     */
    @Override
    public int insertUserBasic(UserBasic userBasic){
        return userBasicMapper.insertUserBasic(userBasic);
    }
}