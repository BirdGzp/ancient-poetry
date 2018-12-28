package com.moon.ancientpoetry.common.util;

import com.alibaba.fastjson.JSON;
import com.moon.ancientpoetry.common.dto.BaseDto;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/27 20:22
 * @Description: 传输数据转对象
 */
public class ParseToObject {
    /**
     * 将传输对象主体进行格式转变
     * @param baseDto
     * @return
     */
    public static Object parseObject(BaseDto baseDto){
        Class clazz = null;
        try {
            clazz = Class.forName(baseDto.getClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(clazz == null){
            return null;
        }
        return JSON.parseObject(baseDto.getObject().toString(), clazz);
    }

    /**
     * 将传输对象的主体
     * @param json
     * @return
     */
    public static BaseDto parseToDto(String json){
        return JSON.parseObject(json, BaseDto.class);
    }

}
