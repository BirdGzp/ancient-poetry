package com.moon.ancientpoetry.web.service.others.impl;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.web.service.others.IndexService;
import com.moon.ancientpoetry.web.service.poetry.AncientArticleService;
import com.moon.ancientpoetry.web.service.user.UserService;
import com.moon.ancientpoetry.web.vo.IndexVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/2 11:19
 * @Description:
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {

    Logger log = LoggerFactory.getLogger(IndexServiceImpl.class);
    @Autowired
    UserService userService;

    @Autowired
    AncientArticleService ancientArticleService;
    /**
     * 根据用户id  返回首页信息
     * @param userId
     * @return
     */
    public IndexVo indexByUserId(Integer userId){
        IndexVo indexVo = new IndexVo();
        UserBasic userBasic = userService.getUserBriefBasicByUserId(userId);
        if(userBasic == null){
            log.error("查询账户 userId  失败" + userId);
        }
        indexVo.setUserPenName(userBasic.getPenName());
        indexVo.setUserId(userBasic.getUserId());
        indexVo.setAncientArticleList(ancientArticleService.listRecommendAncientPoetry());
        return indexVo;
    }
}
