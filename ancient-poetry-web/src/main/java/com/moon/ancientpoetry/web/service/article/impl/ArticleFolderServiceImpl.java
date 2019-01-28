package com.moon.ancientpoetry.web.service.article.impl;

import com.moon.ancientpoetry.common.po.ArticleFolder;
import com.moon.ancientpoetry.web.feign.article.service.ArticleFolderFeignService;
import com.moon.ancientpoetry.web.service.article.ArticleFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/3 14:53
 * @Description:
 */
@Service("articleFolderService")
public class ArticleFolderServiceImpl implements ArticleFolderService {
    @Autowired
    ArticleFolderFeignService articleFolderFeignService;

    /**
     * 显示已删除的文件(根据userId 和 一个月前的时间)  这个类似于一个回收站
     * @param userId
     * @param localDateTime 可查询的最早时间
     * @return
     */
    @Override
    public String listDeleteFolderByUserId(Integer userId, LocalDateTime localDateTime, Integer pageSize, Integer pageNum){
        return articleFolderFeignService.listDeleteFolderByUserId(userId, localDateTime, pageSize, pageNum);
    }

    /**
     * 根据文件夹id 查询子文件夹
     * @param parentFolderId
     * @return
     */
    @Override
    public String listArticleFolderByParentFolderId(Integer parentFolderId, Integer pageSize, Integer pageNum){
        return articleFolderFeignService.listArticleFolderByParentFolderId(parentFolderId, pageSize, pageNum);
    }

    /**
     *  根据用户id 查询用户的顶层文件夹信息(ParentId 为null)
     * @param userId
     * @return
     */
    @Override
    public String listArticleFolderByUserId(Integer userId, Integer pageSize, Integer pageNum){
        return articleFolderFeignService.listArticleFolderByUserId(userId, pageSize, pageNum);
    }

    /**
     * 根据文件夹id 获得文件的详细信息
     * @param articleFolderId
     * @return
     */
    @Override
    public String getArticleFolderByFolderId(Integer articleFolderId){
        return articleFolderFeignService.getArticleFolderByFolderId(articleFolderId);
    }

    /**
     * 更新文件夹信息
     * @param articleFolder
     * @return
     */
    @Override
    public String updateArticleFolderByArticleFloderId(ArticleFolder articleFolder){
        return articleFolderFeignService.updateArticleFolderByArticleFloderId(articleFolder);
    }

    /**
     * 批量添加文件夹
     * @param articleFolderList
     * @return
     */
    @Override
    public String insertBatchArticleFolder(List<ArticleFolder> articleFolderList){
        return articleFolderFeignService.insertBatchArticleFolder(articleFolderList);
    }
    /**
     * 添加文件夹
     * @param articleFolder
     * @return
     */
    @Override
    public String insertArticleFolder(ArticleFolder articleFolder){
        return articleFolderFeignService.insertArticleFolder(articleFolder);
    }
}
