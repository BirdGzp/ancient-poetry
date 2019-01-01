package com.moon.ancientpoetry.poetry.core.service;

import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientAuthor;

public interface AncientAuthorService {
    /**
     * 分页查看作者
     * @param pageNum 第几页
     * @param pageSize  页大小
     * @return
     */
    PageInfo listAllAncientAuthor(int pageNum, int pageSize);

    /**
     * 分页查看作者简短信息
     * @param pageNum 第几页
     * @param pageSize  页大小
     * @return
     */
    PageInfo listAllBriefAncientAuthor(int pageNum, int pageSize);

    /**
     * 根据作者id 查询作者
     * @param ancientAuthorId
     * @return
     */
    AncientAuthor getAncientAuthorByAuthorId(Integer ancientAuthorId);

    /**
     * 根据作者名字查找作者信息
     * @param ancientAuthorName
     * @return
     */
    AncientAuthor getAncientAuthorByAuthorName(String ancientAuthorName);

    /**
     * 根据作者 id 查询作者简述
     * @param ancientAuthorId
     * @return
     */
    AncientAuthor getBriefAncientAuthorByAuthorId(Integer ancientAuthorId);

    /**
     * 根据作者名称查询作者简述
     * @param ancientAuthorName
     * @return
     */
    AncientAuthor getBriefAncientAuthorByAuthorName(String ancientAuthorName);

    /**
     * 插入一个新的作者信息
     * @param ancientAuthor
     * @return
     */
    Integer insertAncientAuthor(AncientAuthor ancientAuthor);

    /**
     * 更新作者信息
     * @param ancientAuthor
     * @return
     */
    Integer updateAncientAuthor(AncientAuthor ancientAuthor);

    /**
     * 更新作者信息中的 likes 字段和 visitCount 字段
     * @param authorId  作者id
     * @param likes   点赞数
     * @param visitCount  访问量
     * @return
     */
    Integer updateAncientAuthorLikesAndVisitCount(Integer authorId, Integer likes, Integer visitCount);
}
