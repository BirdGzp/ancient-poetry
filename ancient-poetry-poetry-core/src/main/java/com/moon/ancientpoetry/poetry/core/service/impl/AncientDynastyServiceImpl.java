package com.moon.ancientpoetry.poetry.core.service.impl;

import com.moon.ancientpoetry.common.po.AncientDynasty;
import com.moon.ancientpoetry.poetry.core.mapper.AncientDynastyMapper;
import com.moon.ancientpoetry.poetry.core.service.AncientDynastyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ancientDynastyService")
public class AncientDynastyServiceImpl implements AncientDynastyService {

    @Autowired
    AncientDynastyMapper ancientDynastyMapper;

    /**
     * 获得所有详细的朝代信息
     * @return
     */
    @Override
    public List<AncientDynasty> listAllAncientDynasty(){
        return ancientDynastyMapper.listAllAncientDynasty();
    }

    /**
     * 获得朝代信息
     * @return 只包含朝代id  和 朝代名的 AncientDynasty
     */
    @Override
    public List<AncientDynasty> listAllBriefAncientDynasty(){
        return ancientDynastyMapper.listAllBriefAncientDynasty();
    }

    /**
     * 插入一个新的朝代
     * @param ancientDynasty
     * @return
     */
    @Override
    public int insertAncientDynasty(AncientDynasty ancientDynasty){
        return ancientDynastyMapper.insertAncientDynasty(ancientDynasty);
    }
}
