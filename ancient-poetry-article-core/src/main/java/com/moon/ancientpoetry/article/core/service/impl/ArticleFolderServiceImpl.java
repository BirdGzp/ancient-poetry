package com.moon.ancientpoetry.article.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.article.core.mapper.ArticleFolderMapper;
import com.moon.ancientpoetry.article.core.service.ArticleFolderService;
import com.moon.ancientpoetry.common.po.ArticleFolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:31
 * @Description:
 */
@Service("articleFolderService")
public class ArticleFolderServiceImpl implements ArticleFolderService {
    @Autowired
    ArticleFolderMapper articleFolderMapper;

    /**
     * 显示已删除的文件(根据userId 和 一个月前的时间)
     * @param userId
     * @param localDateTime 可查询的最早时间
     * @return
     */
    @Override
    public PageInfo listDeleteFolderByUserId(Integer userId, LocalDateTime localDateTime, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(articleFolderMapper.listDeleteFolderByUserId(userId, localDateTime));
    }

    /**
     * 根据文件夹id 查询子文件夹
     * @param parentFolderId
     * @return
     */
    @Override
    public PageInfo listArticleFolderByParentFolderId(Integer parentFolderId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(articleFolderMapper.listArticleFolderByParentFolderId(parentFolderId));
    }

    /**
     *  根据用户id 查询用户的顶层文件夹信息(ParentId 为null)
     * @param userId
     * @return
     */
    @Override
    public PageInfo listArticleFolderByUserId(Integer userId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(articleFolderMapper.listArticleFolderByUserId(userId));
    }

    /**
     * 根据文件夹id 获得文件的详细信息
     * @param articleFolderId
     * @return
     */
    @Override
    public ArticleFolder getArticleFolderByFolderId(Integer articleFolderId) {
        return articleFolderMapper.getArticleFolderByFolderId(articleFolderId);
    }

    /**
     * 更新文件夹信息
     * @param articleFolder
     * @return
     */
    @Override
    public Integer updateArticleFolderByArticleFloderId(ArticleFolder articleFolder) {
        return articleFolderMapper.updateArticleFolderByArticleFloderId(articleFolder);
    }

    /**
     * 批量添加文件夹
     * @param articleFolderList
     * @return
     */
    @Override
    public Integer insertBatchArticleFolder(List<ArticleFolder> articleFolderList) {
        return articleFolderMapper.insertBatchArticleFolder(articleFolderList);
    }

    /**
     * 添加文件夹
     * @param articleFolder
     * @return
     */
    @Override
    public Integer insertArticleFolder(ArticleFolder articleFolder) {
        return articleFolderMapper.insertArticleFolder(articleFolder);
    }
}
