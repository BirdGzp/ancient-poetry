package com.moon.ancientpoetry.web.feign.poetry.fallback;

import com.moon.ancientpoetry.common.aop.fallback.DefaultFallback;
import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientAuthorFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:06
 * @Description:
 */
@Component
@DefaultFallback
public class AncientAuthorFeignServiceFallback implements AncientAuthorFeignService {

    @Override
    public String listFullAllAncientAuthor(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String listBriefAncientAuthor(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public String getAncientAuthorByAuthorId(int id) {
        return null;
    }

    @Override
    public String getBriefAncientAuthorByAuthorId(int id) {
        return null;
    }

    @Override
    public String getAncientAuthorByAuthorName(String authorName) {
        return null;
    }

    @Override
    public String getBriefAncientAuthorByAuthorName(String authorName) {
        return null;
    }

    @Override
    public String insertAncientAuthor(AncientAuthor ancientAuthor) {
        return null;
    }

    @Override
    public String updateAncientAuthor(AncientAuthor ancientAuthor) {
        return null;
    }

    @Override
    public String updateAncientAuthorLikesAndVisitCount(Integer authorId, Integer likes, Integer visitCount) {
        return null;
    }
}
