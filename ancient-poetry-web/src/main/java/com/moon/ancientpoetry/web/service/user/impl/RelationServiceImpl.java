package com.moon.ancientpoetry.web.service.user.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.Relation;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.web.feign.user.service.RelationFeignService;
import com.moon.ancientpoetry.web.service.user.RelationService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:24
 * @Description:
 */
@Service("relationService")
public class RelationServiceImpl implements RelationService {
    @Autowired
    RelationFeignService relationFeignService;

    @Override
    public PageInfo<Relation> listRelationByFollowId(Integer followId, Integer pageNum, Integer pageSize) {
        String result = relationFeignService.listRelationByFollowId(followId, pageNum, pageSize);
        if(StringUtils.isBlank(result)){
            return null;
        }
        BaseDto baseDto = ParseToObject.parseToDto(result);

        PageInfo pageInfo = (PageInfo) baseDto.parseObject();
        return pageInfo;
    }

    @Override
    public PageInfo<Relation> listRelationByUserId(Integer userId, Integer pageNum, Integer pageSize) {
        String result = relationFeignService.listRelationByUserId(userId, pageNum, pageSize);
        if(StringUtils.isBlank(result)){
            return null;
        }
        BaseDto baseDto = ParseToObject.parseToDto(result);

        PageInfo pageInfo = (PageInfo) baseDto.parseObject();
        return pageInfo;
    }

    @Override
    public int updateBatchRelationDeleteState(List<Relation> listRelations) {
        return 0;
    }

    @Override
    public int updateRelationDeleteState(Relation relation) {
        return 0;
    }

    @Override
    public int insertBatchRelation(List relationList) {
        return 0;
    }

    @Override
    public String insertRelation(Relation relation) {
        return relationFeignService.insertRelation(JSON.toJSONString(relation));
    }
}
