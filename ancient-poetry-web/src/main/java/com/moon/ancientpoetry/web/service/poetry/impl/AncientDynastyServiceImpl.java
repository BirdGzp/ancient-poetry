package com.moon.ancientpoetry.web.service.poetry.impl;

import com.moon.ancientpoetry.common.po.AncientDynasty;
import com.moon.ancientpoetry.web.service.poetry.AncientDynastyService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:17
 * @Description:
 */
@Service("ancientDynastyService")
public class AncientDynastyServiceImpl implements AncientDynastyService{
    @Override
    public List<AncientDynasty> listAllAncientDynasty() {
        return null;
    }

    @Override
    public List<AncientDynasty> listAllBriefAncientDynasty() {
        return null;
    }

    @Override
    public Integer insertAncientDynasty(AncientDynasty ancientDynasty) {
        return null;
    }
}
