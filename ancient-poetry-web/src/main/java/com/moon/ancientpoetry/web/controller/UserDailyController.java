package com.moon.ancientpoetry.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:11
 * @Description:
 */
@RequestMapping("/user")
@RestController
public class UserDailyController {


    /**
     *
     * @param accountId 账号 id  ，目前可以自动判别手机号登录或者邮箱号登录
     * @param password 密码
     * @return 视图路径
     */
    public String login(@RequestParam String accountId, @RequestParam String password){

        return "/_login";
    }
}
