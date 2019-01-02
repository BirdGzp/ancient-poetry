package com.moon.ancientpoetry.user.core.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.cache.RedisService;
import com.moon.ancientpoetry.common.cache.RedisSet;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.user.core.mapper.UserBasicMapper;
import com.moon.ancientpoetry.user.core.service.UserBasicService;
import com.moon.ancientpoetry.user.core.util.RegularPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service("userBasicService")
public class UserBasicServiceImpl implements UserBasicService {

    Logger log = LoggerFactory.getLogger(UserBasic.class);

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
        log.info(email);
        return userBasicMapper.getCheckInfoByEmail(email);
    }

    /**
     * 根据用户手机号码 获得用户密码等信息，用来校验
     * @param telephone
     * @return
     */
    @Override
    public UserBasic getCheckInfoByTelephone(String telephone){
        log.info(telephone);
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

    /**
     * 校验密码是否正确
     * @param accountId  账号
     * @param password   密码
     * @return
     */
    @Override
    public Integer getPasswordCheckResult(String accountId, String password){

        UserBasic userBasic = null;
        if(accountId.contains("@")){
            if(!RegularPattern.emailCheck(accountId)){
                return null;
            }
            userBasic = getCheckInfoByEmail(accountId);

        }else {
            if(!RegularPattern.telephoneCheck(accountId)){
                return null;
            }
            userBasic = getCheckInfoByTelephone(accountId);
        }


        if(userBasic == null ){
            log.info("查询失败，请检查 com/moon/ancientpoetry/user/web/service/impl/UserServiceImpl.java:116");
            return null;
        }
        if(password.equals(userBasic.getPassword())){
            userBasic.setPassword(null);
            return userBasic.getUserId();
        }
        return null;
    }
}
