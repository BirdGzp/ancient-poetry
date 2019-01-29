package com.moon.ancientpoetry.web.feign.article.service;

import com.moon.ancientpoetry.common.po.ArticleFolder;
import com.moon.ancientpoetry.web.feign.article.fallback.ArticleFolderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:13
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-ARTICLE-CORE", fallback = ArticleFolderServiceFallback.class)
public interface ArticleFolderFeignService {
    /**
     * 显示已删除的文件(根据userId 和 一个月前的时间)  这个类似于一个回收站
     * @param userId
     * @param localDateTime 可查询的最早时间
     * @return
     */
    @RequestMapping(value = "/article/folder/list/user-id/{userId}", method = RequestMethod.POST)
     String listDeleteFolderByUserId(@PathVariable("userId") Integer userId, LocalDateTime localDateTime,@PathVariable(name = "pageNum", required = false)  Integer pageSize, @PathVariable(name = "pageSize", required = false) Integer pageNum);

    /**
     * 根据文件夹id 查询子文件夹
     * @param parentFolderId
     * @return
     */
    @RequestMapping(value = "/article/folder/list/parent-folder-id/{parentFolderId}", method = RequestMethod.POST)
     String listArticleFolderByParentFolderId(@PathVariable("parentFolderId")Integer parentFolderId, @RequestParam("pageSize") Integer pageSize, @RequestParam("pageNum") Integer pageNum);

    /**
     *  根据用户id 查询用户的顶层文件夹信息(ParentId 为null)
     * @param userId
     * @return
     */
    @RequestMapping(value = "/article/folder/list/user-id/{userId}", method = RequestMethod.POST)
    String listArticleFolderByUserId(@PathVariable("userId") Integer userId, @RequestParam("pageSize")Integer pageSize, @RequestParam("pageNum") Integer pageNum);

    /**
     * 根据文件夹id 获得文件的详细信息
     * @param articleFolderId
     * @return
     */
    @RequestMapping(value = "/article/folder/get/folder-id/{articleFolderId}", method = RequestMethod.POST)
    String getArticleFolderByFolderId(@PathVariable("articleFolderId")Integer articleFolderId);

    /**
     * 更新文件夹信息
     * @param articleFolder
     * @return
     */
    @RequestMapping(value = "/article/folder/update", method = RequestMethod.POST)
    String updateArticleFolderByArticleFloderId(@RequestBody ArticleFolder articleFolder);

    /**
     * 批量添加文件夹
     * @param articleFolderList
     * @return
     */
    @RequestMapping(value = "/article/folder/batch/insert", method = RequestMethod.POST)
    String insertBatchArticleFolder(@RequestBody List<ArticleFolder> articleFolderList);
    /**
     * 添加文件夹
     * @param articleFolder
     * @return
     */
    @RequestMapping(value = "/article/folder/insert", method = RequestMethod.POST)
    String insertArticleFolder(@RequestBody ArticleFolder articleFolder);
}
