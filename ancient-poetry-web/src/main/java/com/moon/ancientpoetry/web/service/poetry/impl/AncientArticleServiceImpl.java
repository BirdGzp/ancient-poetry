package com.moon.ancientpoetry.web.service.poetry.impl;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.AncientArticle;
import com.moon.ancientpoetry.common.util.ParseToObject;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientArticleFeignService;
import com.moon.ancientpoetry.web.feign.poetry.service.AncientArticleSentenceFeignService;
import com.moon.ancientpoetry.web.service.poetry.AncientArticleService;
import com.moon.ancientpoetry.web.service.poetry.AncientWordService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:17
 * @Description:
 */
@Service("ancientArticleService")
public class AncientArticleServiceImpl implements AncientArticleService {

    @Autowired
    AncientArticleFeignService ancientArticleFeignService;

    @Autowired
    AncientArticleSentenceFeignService ancientArticleSentenceFeignService;
    @Autowired
    AncientWordService ancientWordService;

    /**
     * 获得推荐的十首古诗词
     * @return
     */
    @Override
    public List listRecommendAncientPoetry(){
        int i = (int) (Math.random() * 1000);
        int j = (int)(Math.random() * 10) + 5;
        String text = ancientArticleFeignService.listAllAncientArticle(i, j);
        BaseDto baseDto = ParseToObject.parseToDto(text);
        if(baseDto == null){
            return null;
        }
        if(((PageInfo) baseDto.parseObject()).getList().size() >= 5){
            return ((PageInfo) baseDto.parseObject()).getList().subList(0,4);
        }else{
            return ((PageInfo) baseDto.parseObject()).getList();
        }

    }

    /**
     * 通过文章 id 获得文章记录
     * @param articleId
     * @return
     */
    @Override
    public AncientArticle getAncientArticleByArticleId(Integer articleId){
        String result = ancientArticleFeignService.getAncientArticleByArticleId(articleId);
        if(StringUtils.isBlank(result)){
            return null;
        }
        BaseDto baseDto = ParseToObject.parseToDto(result);
        if(baseDto.getObjectType() == ObjectType.NULL){
            return null;
        }
        return (AncientArticle) baseDto.parseObject();
    }

    @Override
    public PageInfo listAncientArticle(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo listFullAncientArticle(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo listAncientArticleByAuthorId(Integer authorId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public Integer updateAncientArticle(AncientArticle ancientArticle) {
        return null;
    }

    @Override
    public Integer insertAncientArticle(AncientArticle ancientArticle) {
        return null;
    }
}
