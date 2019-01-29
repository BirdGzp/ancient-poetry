package com.moon.ancientpoetry.web.controller;

import com.moon.ancientpoetry.web.service.others.IndexService;
import com.moon.ancientpoetry.web.vo.IndexVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/28 17:11
 * @Description:
 */
@RequestMapping
@Controller
public class LoginController {

    @Autowired
    IndexService indexService;

    @GetMapping("/login")
    public String login(HttpServletRequest request){
        if(request.getSession().getAttribute("userId") == null) {
            return "/login";
        }
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(HttpServletRequest request){
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if(userId  != null){
            IndexVo indexVo = indexService.indexByUserId(userId);
            request.getSession().setAttribute("penName", indexVo.getPenName());
            request.setAttribute("index", indexVo);
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
        return "redirect:/index";
    }

    @GetMapping("/exit")
    public String exit(HttpServletRequest request){
        request.getSession().removeAttribute("userId");
        return "/index";
    }

}
