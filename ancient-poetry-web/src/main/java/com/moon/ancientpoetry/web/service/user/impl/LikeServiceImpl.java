package com.moon.ancientpoetry.web.service.user.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.enums.LikeFromType;
import com.moon.ancientpoetry.common.po.Like;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.web.feign.user.service.LikeFeignService;
import com.moon.ancientpoetry.web.service.user.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:22
 * @Description:
 */
@Service("likeService")
public class LikeServiceImpl implements LikeService {
    @Autowired
    LikeFeignService likeFeignService;

    /**
     * 通过用户 Id  拿到用户的点赞信息记录
     * @param userId
     * @return
     */
    @Override
    public PageInfo listLikeByUserIdOrderByTime(Integer userId,Integer pageNum, Integer pageSize){
        BaseDto baseDto = ParseToObject.parseToDto(likeFeignService.listLikeByUserIdOrderByTime(userId, pageNum, pageSize));
        return (PageInfo) ParseToObject.parseObject(baseDto);
    }

    /**
     * 通过来源的数据 id 和 来源类型
     * @param fromId
     * @param fromType
     * @return
     */
    @Override
    public Integer getCountByFromIdAndFromType(Integer fromId, Integer fromType){
        return  null;
    }

    /**
     * 更新点赞记录信息
     * @param like
     * @return
     */
    @Override
    public String updateLikeDeleteState(String like){
        return  null;
    }

    /**
     * 插入一批点赞记录信息
     * @param like
     * @return
     */
    @Override
    public Integer insertBatchLikes(String like){
        return  null;
    }

    /**
     * 插入一条点赞记录信息
     * @return
     */
    @Override
    public Integer insertLike(Integer fromId, Byte fromType, Integer userId, String userPenName){
        Like likeObject = new Like();
        likeObject.setFromId(fromId);
        likeObject.setFromType(fromType);
        likeObject.setUserId(userId);
        likeObject.setUserName(userPenName);
        return Integer.valueOf(likeFeignService.insertLike(JSON.toJSONString(likeObject)));
    }
}
