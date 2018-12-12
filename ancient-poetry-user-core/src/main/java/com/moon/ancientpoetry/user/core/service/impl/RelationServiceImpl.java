package com.moon.ancientpoetry.user.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Relation;
import com.moon.ancientpoetry.user.core.mapper.RelationMapper;
import com.moon.ancientpoetry.user.core.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:20
 * @Description:
 */
@Service("relationService")
public class RelationServiceImpl implements RelationService {

    @Autowired
    RelationMapper relationMapper;

    /**
     * 查询对象被谁关注过
     * @param followId 关注的对象id
     * @return
     */
    @Override
    public PageInfo<Relation> listRelationByFollowId(Integer followId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(relationMapper.listRelationByFollowId(followId));
    }
    /**
     * 根据与用户 id 查询关注的对象
     * @param userId 用户id
     * @return
     */
    @Override
    public PageInfo<Relation> listRelationByUserId(Integer userId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(relationMapper.listRelationByUserId(userId));
    }


    /**
     * 批量更新 一批状态表
     * @return
     */
    @Override
    public int updateBatchRelationDeleteState(List<Relation> listRelations){
        return relationMapper.updateBatchRelationDeleteState(listRelations);
    }


    /**
     * 更新关系记录
     * @return
     */
    @Override
    public int updateRelationDeleteState(Relation relation){
        return relationMapper.updateRelationDeleteState(relation);
    }

    /**
     * 批量插入关系记录
     * @param relationList
     * @return
     */
    @Override
    public int insertBatchRelation(List relationList){
        return relationMapper.insertBatchRelation(relationList);
    }

    /**
     * 插入一条关系记录
     * @param relation
     * @return
     */
    @Override
    public int insertRelation(Relation relation){
        return relationMapper.insertRelation(relation);
    }

}
