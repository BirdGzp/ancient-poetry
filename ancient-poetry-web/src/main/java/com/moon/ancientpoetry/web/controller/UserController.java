package com.moon.ancientpoetry.web.controller;

import com.moon.ancientpoetry.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/29 15:24
 * @Description:
 */

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;

    /**
     *
     * @param accountId 账号 id  ，目前可以自动判别手机号登录或者邮箱号登录
     * @param password 密码
     * @return 视图路径
     */
    @PostMapping("/login")
    public String login(@RequestParam(value="accountId",required=false)String accountId, @RequestParam String password, HttpServletRequest request){
        String ip = request.getRemoteAddr();
        userService.login(accountId, password, ip);
        return "/index";
    }
}
