package com.moon.ancientpoetry.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/18 17:09
 * @Description:
 */
@Controller
public class LoginController {


    @GetMapping("/login-page")
    public String helloHtml(){
        return "/_login";
    }

    @PostMapping("/login")
    public String loginHtml(String userId, String password){
        System.out.println(userId);

        System.out.println(password);
        return "/_login";
    }
}
