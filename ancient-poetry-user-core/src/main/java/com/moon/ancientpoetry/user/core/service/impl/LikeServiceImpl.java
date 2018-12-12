package com.moon.ancientpoetry.user.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Like;
import com.moon.ancientpoetry.user.core.mapper.LikeMapper;
import com.moon.ancientpoetry.user.core.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:17
 * @Description:
 */
@Service("likeService")
public class LikeServiceImpl implements LikeService {

    @Autowired
    LikeMapper likeMapper;

    /**
     * 根据类型 和id 得到点赞总数
     * @param fromId
     * @param fromType
     * @return
     */
    @Override
    public int getCountByFromIdAndFromType(Integer fromId, Integer fromType){
        return likeMapper.getCountByFromIdAndFromType(fromId, fromType);
    }

    /**
     * 获得用户的点赞记录(时间排序)
     * @param userId
     * @return
     */
    @Override
    public PageInfo listLikeByUserIdOrderByTime(Integer userId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return  new PageInfo(likeMapper.listLikeByUserIdOrderByTime(userId));
    }

    /**
     * 更新一条记录为删除状态
     * @param like
     * @return
     */
    @Override
    public int updateLikeDeleteState(Like like){
        return likeMapper.updateLikeDeleteState(like);
    }

    /**
     * 批量插入一批点赞记录
     * @param likes
     * @return
     */
    @Override
    public int insertBatchLikes(List likes){
        return likeMapper.insertBatchLikes(likes);
    }

    /**
     * 插入点赞记录
     * @param like
     * @return
     */
    @Override
    public int insertLike(Like like){
        return likeMapper.insertLike(like);
    }
}
