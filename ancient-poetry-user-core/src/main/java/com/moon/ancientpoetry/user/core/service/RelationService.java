package com.moon.ancientpoetry.user.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.Relation;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 10:15
 * @Description:
 */
public interface RelationService {
    /**
     * 查询对象被谁关注过
     * @param followId 关注的对象id
     * @return
     */
    PageInfo<Relation> listRelationByFollowId(Integer followId, Integer pageNum, Integer pageSize);
    /**
     * 根据与用户 id 查询关注的对象
     * @param userId 用户id
     * @return
     */
    PageInfo<Relation> listRelationByUserId(Integer userId, Integer pageNum, Integer pageSize);


    /**
     * 批量更新 一批状态表
     * @return
     */
    int updateBatchRelationDeleteState(List<Relation> listRelations);

    /**
     * 更新关系记录
     * @return
     */
    int updateRelationDeleteState(Relation relation);

    /**
     * 批量插入关系记录
     * @param relationList
     * @return
     */
    int insertBatchRelation(List relationList);

    /**
     * 插入一条关系记录
     * @param relation
     * @return
     */
    int insertRelation(Relation relation);
}

