package com.moon.ancientpoetry.web.controller;

import com.moon.ancientpoetry.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger log = LoggerFactory.getLogger(UserController.class);

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
        Integer loginErrorCount = request.getSession().getAttribute("loginErrorCount") == null ? 0 : (Integer) request.getSession().getAttribute("loginErrorCount");
        if(loginErrorCount > 5){
            log.info("ip: " + ip + ", 登录账号: " + accountId + "次数过多");
            //request.setAttribute("loginError", "登录账户密码错误次数较多");
        }

        Integer userId = userService.login(accountId, password, ip);
        if(userId == null){
            request.getSession().setAttribute("loginErrorCount", loginErrorCount++ );
            request.setAttribute("loginError", "登录账户密码不搭");
            return "/login";
        }
        request.getSession().setAttribute("userId", userId);
        request.setAttribute("userId", userId);

        return "/index";
    }

    /**
     * 返回主页调用方法给主页添加数据
     * @param request
     * @return
     */
    private String redictToIndex(HttpServletRequest request){
        if(request.getSession().getAttribute("userId") == null){
            return "index";
        }
        //userService;
        return  "/index";
    }

}
