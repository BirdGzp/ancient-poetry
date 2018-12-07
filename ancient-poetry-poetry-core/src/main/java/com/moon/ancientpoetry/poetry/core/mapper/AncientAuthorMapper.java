package com.moon.ancientpoetry.poetry.core.mapper;


import com.moon.ancientpoetry.common.po.AncientAuthor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AncientAuthorMapper {

    /**
     * 获得一个作者的集合(配合 pagehelper 分页)
     * @return 返回作者全部信息的集合
     */
    List<AncientAuthor> listAllAncientAuthor();

    /**
     * 获得一个作者的集合(配合 pagehelper 分页)
     * @return 返回作者基本的集合
     */
    List<AncientAuthor> listAllBriefAncientAuthor();

    /**
     * 通过作者的id 查找 Author
     * @param authorId  作者id
     * @return 作者的信息
     */
    AncientAuthor getAncientAuthorByAuthorId(Integer authorId);

    /**
     * 通过作者名获取作者信息
     * @param authorName  作者名
     * @return
     */
    AncientAuthor getAncientAuthorByAuthorName(String authorName);

    /**
     * 根据作者id 获得简单的作者信息
     * @param ancientAuthorId 作者信息
     * @return 返回作者信息
     */
    AncientAuthor getBriefAncientAuthorByAuthorId(Integer ancientAuthorId);

    /**
     * 根据作者名返回作者的信息
     * @param ancientAuthorName
     * @return
     */
    AncientAuthor getBriefAncientAuthorByAuthorName(String ancientAuthorName);

    /**
     * 插入一个新的作者信息
     * @param ancientAuthor
     * @return
     */
    int insertAncientAuthor(AncientAuthor ancientAuthor);

    /**
     * 更新作者的详细信息
     * @param ancientAuthor
     * @return
     */
    int updateAncientAuthorByAuthorId(AncientAuthor ancientAuthor);

    /**
     * 只更新作者的 点赞数和 访问量
     * @param ancientAuthor
     * @return
     */
    int updateAncientAuthorLikesAndVisitCountByAuthorId(AncientAuthor ancientAuthor);
}