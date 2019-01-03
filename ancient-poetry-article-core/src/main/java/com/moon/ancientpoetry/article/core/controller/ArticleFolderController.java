package com.moon.ancientpoetry.article.core.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.article.core.service.ArticleFolderService;
import com.moon.ancientpoetry.common.constant.ObjectType;
import com.moon.ancientpoetry.common.dto.BaseDto;
import com.moon.ancientpoetry.common.po.ArticleFolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:31
 * @Description:
 */
@RestController
@RequestMapping("/article/folder")
public class ArticleFolderController {
    @Autowired
    ArticleFolderService articleFolderService;

    /**
     * 显示已删除的文件(根据userId 和 一个月前的时间)  这个类似于一个回收站
     * @param userId
     * @param localDateTime 可查询的最早时间
     * @return
     */
    @PostMapping("/list/user-id/{userId}")
    @ResponseBody
    public String listDeleteFolderByUserId(@PathVariable("userId") Integer userId, LocalDateTime localDateTime, Integer pageSize, Integer pageNum) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleFolderService.listDeleteFolderByUserId(userId, localDateTime, pageSize, pageNum)));
    }

    /**
     * 根据文件夹id 查询子文件夹
     * @param parentFolderId
     * @return
     */
    @PostMapping("/list/parent-folder-id/{parentFolderId}")
    @ResponseBody
    public String listArticleFolderByParentFolderId(@PathVariable("parentFolderId")Integer parentFolderId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT, articleFolderService.listArticleFolderByParentFolderId(parentFolderId, pageSize, pageNum)));
    }

    /**
     *  根据用户id 查询用户的顶层文件夹信息(ParentId 为null)
     * @param userId
     * @return
     */
    @PostMapping("/list/user-id/{userId}")
    @ResponseBody
    public String listArticleFolderByUserId(@PathVariable("userId") Integer userId, Integer pageSize, Integer pageNum) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleFolderService.listArticleFolderByUserId(userId, pageSize, pageNum)));
    }

    /**
     * 根据文件夹id 获得文件的详细信息
     * @param articleFolderId
     * @return
     */
    @PostMapping("/get/folder-id/{articleFolderId}")
    @ResponseBody
    public String getArticleFolderByFolderId(@PathVariable("articleFolderId")Integer articleFolderId) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleFolderService.getArticleFolderByFolderId(articleFolderId)));
    }

    /**
     * 更新文件夹信息
     * @param articleFolder
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public String updateArticleFolderByArticleFloderId(@RequestBody ArticleFolder articleFolder) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleFolderService.updateArticleFolderByArticleFloderId(articleFolder)));
    }

    /**
     * 批量添加文件夹
     * @param articleFolderList
     * @return
     */
    @PostMapping("/batch/insert")
    @ResponseBody
    public String insertBatchArticleFolder(@RequestBody List<ArticleFolder> articleFolderList) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleFolderService.insertBatchArticleFolder(articleFolderList)));
    }

    /**
     * 添加文件夹
     * @param articleFolder
     * @return
     */
    @PostMapping("/insert")
    @ResponseBody
    public String insertArticleFolder(@RequestBody ArticleFolder articleFolder) {
        return JSON.toJSONString(new BaseDto(ObjectType.OBJECT,articleFolderService.insertArticleFolder(articleFolder)));
    }
}
