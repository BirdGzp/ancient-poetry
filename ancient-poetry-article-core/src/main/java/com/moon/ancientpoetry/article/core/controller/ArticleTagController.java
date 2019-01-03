package com.moon.ancientpoetry.article.core.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.article.core.service.ArticleTagService;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.ArticleTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:31
 * @Description:
 */
@RestController
@RequestMapping("/article/tag")
public class ArticleTagController {
    @Autowired
    ArticleTagService articleTagService;

    /**
     * 获得全部标签，article_tag_id为null
     * @return
     */
    @PostMapping("/list")
    @ResponseBody
    public String listArticleTag() {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT, articleTagService.listArticleTag()));
    }

    /**
     * 根据id查找子标签
     * @param parentTagId
     * @return
     */
    @PostMapping("/list/parent-tag-id/{parentTagId}")
    @ResponseBody
    public String listArticleTagByParentTagId(@PathVariable("parentTagId") Integer parentTagId) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT, articleTagService.listArticleTagByParentTagId(parentTagId)));
    }

    /**
     * 更新标签信息
     * @param articleTag
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public String updateArticleTagByTagId(@RequestBody ArticleTag articleTag) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleTagService.updateArticleTagByTagId(articleTag)));
    }

    /**
     * 插入新的标签
     * @param articleTag
     * @return
     */
    @PostMapping("/insert")
    @ResponseBody
    public String insertArticleTag(@RequestBody ArticleTag articleTag) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleTagService.insertArticleTag(articleTag)));
    }
}
