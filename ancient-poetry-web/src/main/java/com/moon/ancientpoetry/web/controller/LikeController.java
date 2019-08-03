package com.moon.ancientpoetry.web.controller;

import com.moon.ancientpoetry.web.service.user.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : Harold
 * @Description
 * @Date : 2019/2/10 14:39
 */
@Controller
@RequestMapping("/like")
public class LikeController {
    @Autowired
    LikeService likeService;

    /**
     *  插入点赞记录
     * @return
     */
    @PostMapping("/insert")
    public String insertLike(@RequestParam Integer fromId, @RequestParam Byte fromType, HttpServletRequest servletRequest){
        Integer userId = (Integer) servletRequest.getSession().getAttribute("userId");
        String userPenName = (String) servletRequest.getSession().getAttribute("userPenName");
        Integer result = likeService.insertLike(fromId, fromType, userId, userPenName);
        if(result == 1){
            return "/";
        }else{
            return "/";
        }
    }

    @GetMapping("/get/all")
    public void getAllLikes(){

    }
}
