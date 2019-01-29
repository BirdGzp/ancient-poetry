package com.moon.ancientpoetry.web.controller;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.web.service.others.IndexService;
import com.moon.ancientpoetry.web.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/29 15:24
 * @Description:
 */

@RequestMapping("/user")
@Controller
public class UserController {

    Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    IndexService indexService;

    /**
     *
     * @param accountId 账号 id  ，目前可以自动判别手机号登录或者邮箱号登录
     * @param password 密码
     * @return 视图路径
     */
    @PostMapping("/login")
    public String login(@RequestParam(value="accountId",required=false)String accountId, @RequestParam String password, HttpServletRequest request, HttpServletResponse response){
        String ip = request.getRemoteAddr();
        Integer loginErrorCount = request.getSession().getAttribute("loginErrorCount") == null ? 0 : (Integer) request.getSession().getAttribute("loginErrorCount");
        if(loginErrorCount > 5){
            log.info("ip: " + ip + ", 登录账号: " + accountId + "次数过多");
            //request.setAttribute("loginError", "登录账户密码错误次数较多");
        }

        Integer userId = userService.login(accountId, password, ip);
        System.out.println("userId为 " + userId );
        if(userId == null){
            request.getSession().setAttribute("loginErrorCount", loginErrorCount++ );
            request.setAttribute("loginError", "登录账户密码不搭");
            return "/login";
        }

        request.getSession().setAttribute("userId", userId);

        return "redirect:/index";
    }

    @GetMapping("/info/{userId}")
    public String getBasicInfoByUserId(@PathVariable("userId") Integer userId, HttpServletRequest request){
        request.setAttribute("user", userService.getUserBriefBasicByUserId(userId));
        System.out.println(userId);
        return "/index";
    }

}
