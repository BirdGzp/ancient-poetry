package com.moon.ancientpoetry.poetry.core.service;

import com.moon.ancientpoetry.common.po.AncientDynasty;

import java.util.List;

public interface AncientDynastyService {
    /**
     * 获得所有详细的朝代信息
     * @return
     */
    List<AncientDynasty> listAllAncientDynasty();

    /**
     * 获得朝代信息
     * @return 只包含朝代id  和 朝代名的 AncientDynasty
     */
    List<AncientDynasty> listAllBriefAncientDynasty();

    /**
     * 插入一个新的朝代
     * @param ancientDynasty
     * @return
     */
    int insertAncientDynasty(AncientDynasty ancientDynasty);
}
