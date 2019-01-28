package com.moon.ancientpoetry.web.service.article;

import com.moon.ancientpoetry.common.po.ArticleFolder;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/3 14:52
 * @Description:
 */
public interface ArticleFolderService {
    /**
     * 显示已删除的文件(根据userId 和 一个月前的时间)  这个类似于一个回收站
     * @param userId
     * @param localDateTime 可查询的最早时间
     * @return
     */
    String listDeleteFolderByUserId(Integer userId, LocalDateTime localDateTime, Integer pageSize, Integer pageNum);

    /**
     * 根据文件夹id 查询子文件夹
     * @param parentFolderId
     * @return
     */
    String listArticleFolderByParentFolderId(Integer parentFolderId, Integer pageSize, Integer pageNum);

    /**
     *  根据用户id 查询用户的顶层文件夹信息(ParentId 为null)
     * @param userId
     * @return
     */
    String listArticleFolderByUserId(Integer userId, Integer pageSize, Integer pageNum);

    /**
     * 根据文件夹id 获得文件的详细信息
     * @param articleFolderId
     * @return
     */
    String getArticleFolderByFolderId(Integer articleFolderId);

    /**
     * 更新文件夹信息
     * @param articleFolder
     * @return
     */
    String updateArticleFolderByArticleFloderId(ArticleFolder articleFolder);

    /**
     * 批量添加文件夹
     * @param articleFolderList
     * @return
     */
    String insertBatchArticleFolder(List<ArticleFolder> articleFolderList);
    /**
     * 添加文件夹
     * @param articleFolder
     * @return
     */
    String insertArticleFolder(ArticleFolder articleFolder);
}
