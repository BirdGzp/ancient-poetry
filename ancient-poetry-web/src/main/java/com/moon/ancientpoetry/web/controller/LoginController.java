package com.moon.ancientpoetry.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:11
 * @Description:
 */
@RequestMapping
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(HttpServletRequest request){
        if(request.getSession().getAttribute("userId") == null) {
            return "/login";
        }
        return "/index";
    }

    @GetMapping("/index")
    public String index(HttpServletRequest request){
        if(request.getSession().getAttribute("userId") != null) {

        }
        return "/index";
    }

    @GetMapping("/register")
    public String register(){
        return "/register";
    }

    @GetMapping("/find-password")
    public String findPassword(){
        return "/find-password";
    }

    @GetMapping("/")
    public String defaultIndex(HttpServletRequest request){
        if(request.getSession().getAttribute("userId") != null) {

        }
        return "/index";
    }
}
