package com.moon.ancientpoetry.user.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.user.web.feign.service.UserBasicFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/14 20:02
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserBasicFeignService userBasicFeignService;

    @RequestMapping("/id/{id}")
    public String getUserId(@PathVariable(name = "id")Integer id){
        String result =  userBasicFeignService.getUserBasic(id);
        BaseDto baseDto = ParseToObject.parseToDto(result);
        return result;
    }

    @RequestMapping("/check-pass/{telephone}")
    public String checkPass(@PathVariable(name = "telephone")String telephone){
        String result =  userBasicFeignService.getCheckInfoByTelephone(telephone);
        BaseDto baseDto = ParseToObject.parseToDto(result);
        return result;
    }

}