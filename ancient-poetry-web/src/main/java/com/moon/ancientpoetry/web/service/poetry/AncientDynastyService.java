package com.moon.ancientpoetry.web.service.poetry;

import com.moon.ancientpoetry.common.po.AncientDynasty;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:14
 * @Description:
 */
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
    Integer insertAncientDynasty(AncientDynasty ancientDynasty);
}
