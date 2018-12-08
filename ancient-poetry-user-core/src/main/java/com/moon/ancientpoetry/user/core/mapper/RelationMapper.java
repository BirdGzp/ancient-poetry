package com.moon.ancientpoetry.user.core.mapper;

import com.moon.ancientpoetry.common.po.Relation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RelationMapper {

    /**
     * 查询对象被谁关注过
     * @param followId 关注的对象id
     * @return
     */
    List<Relation> listRelationByFollowId(Integer followId);
    /**
     * 根据与用户 id 查询关注的对象
     * @param userId 用户id
     * @return
     */
    List<Relation> listRelationByUserId(Integer userId);


    /**
     * 批量更新 一批状态表
     * @return
     */
    int updateBatchRelationDeleteState(List<Relation> listRelations);

    /**
     * 更新关系记录
     * @return
     */
    int updateRealtionDeleteState(List<Relation> listRelations);

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