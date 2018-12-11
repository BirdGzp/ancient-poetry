package com.moon.ancientpoetry.article.core.mapper;


import com.moon.ancientpoetry.common.po.ArticleFolder;

import java.time.LocalDateTime;
import java.util.List;

public interface ArticleFolderMapper {
    /**
     * 显示已删除的文件(根据userId 和 一个月前的时间)
     * @param userId
     * @param localDateTime 可查询的最早时间
     * @return
     */
    List<ArticleFolder> listDeleteFolderByUserId(Integer userId, LocalDateTime localDateTime);

    /**
     * 根据文件夹id 查询子文件夹
     * @param parentFolderId
     * @return
     */
    List<ArticleFolder> listArticleFolderByParentFolderId(Integer parentFolderId);

    /**
     *  根据用户id 查询用户的顶层文件夹信息(ParentId 为null)
     * @param userId
     * @return
     */
    List<ArticleFolder> listArticleFolderByUserId(Integer userId);

    /**
     * 根据文件夹id 获得文件的详细信息
     * @param articleFolderId
     * @return
     */
    ArticleFolder getArticleFolderByFolderId(Integer articleFolderId);

    /**
     * 更新文件夹信息
     * @param articleFolder
     * @return
     */
    int updateArticleFolderByArticleFloderId(ArticleFolder articleFolder);

    /**
     * 批量添加文件夹
     * @param articleFolderList
     * @return
     */
    int insertBatchArticleFolder(List<ArticleFolder> articleFolderList);

    /**
     * 添加文件夹
     * @param articleFolder
     * @return
     */
    int insertArticleFolder(ArticleFolder articleFolder);
}