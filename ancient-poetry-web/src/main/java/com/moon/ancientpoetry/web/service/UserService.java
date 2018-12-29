package com.moon.ancientpoetry.web.service;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:20
 * @Description:
 */
public interface UserService {
    /**
     * 账号登录
     * @param accountId 账号 id  可以使邮箱，也可以是手机号码
     * @param password
     * @param ip 用户 ip 地址
     * @return
     */
    boolean login(String accountId, String password, String ip);
}
