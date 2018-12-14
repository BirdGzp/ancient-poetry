package com.moon.ancientpoetry.user.web.controller;

import com.moon.ancientpoetry.user.web.dto.User;
import com.moon.ancientpoetry.user.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/14 20:02
 * @Description:
 */
@RestController
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userId")
    public User getUserId(Long id){
        return userService.getUser(id);
    }


}