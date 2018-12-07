package com.moon.ancientpoetry.poetry.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.poetry.core.mapper.AncientAuthorMapper;
import com.moon.ancientpoetry.poetry.core.service.AncientAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ancientAuthorService")
public class AncientAuthorServiceImpl implements AncientAuthorService {
    @Autowired
    AncientAuthorMapper ancientAuthorMapper;

    /**
     * 分页查看作者全部信息
     * @param pageNum 第几页
     * @param pageSize  页大小
     * @return
     */
    @Override
    public PageInfo listAllAncientAuthor(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AncientAuthor> ancientAuthors = ancientAuthorMapper.listAllAncientAuthor();
        PageInfo result = new PageInfo(ancientAuthors);
        return result;
    }

    /**
     * 分页查看作者简单信息
     * @param pageNum 第几页
     * @param pageSize  页大小
     * @return
     */
    @Override
    public PageInfo listAllBriefAncientAuthor(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AncientAuthor> ancientAuthors = ancientAuthorMapper.listAllBriefAncientAuthor();
        PageInfo result = new PageInfo(ancientAuthors);
        return result;
    }

    /**
     * 根据作者id 查询作者
     * @param ancientAuthorId
     * @return
     */
    @Override
    public AncientAuthor getAncientAuthorByAuthorId(Integer ancientAuthorId) {
        if(ancientAuthorId == null){
            return null;
        }
        System.out.println(ancientAuthorId);
        return ancientAuthorMapper.getAncientAuthorByAuthorId(ancientAuthorId);
    }

    /**
     * 根据作者名字查找作者信息
     * @param ancientAuthorName
     * @return
     */
    @Override
    public AncientAuthor getAncientAuthorByAuthorName(String ancientAuthorName) {
        if(ancientAuthorName == null){
            return null;
        }
        return ancientAuthorMapper.getAncientAuthorByAuthorName(ancientAuthorName);
    }

    /**
     * 根据作者 id 查询作者简述
     * @param ancientAuthorId
     * @return
     */
    @Override
    public AncientAuthor getBriefAncientAuthorByAuthorId(Integer ancientAuthorId) {
        if(ancientAuthorId == null){
            return null;
        }
        return ancientAuthorMapper.getBriefAncientAuthorByAuthorId(ancientAuthorId);
    }

    /**
     * 根据作者名称查询作者简述
     * @param ancientAuthorName
     * @return
     */
    @Override
    public AncientAuthor getBriefAncientAuthorByAuthorName(String ancientAuthorName) {
        if(ancientAuthorName == null){
            return null;
        }
        return ancientAuthorMapper.getBriefAncientAuthorByAuthorName(ancientAuthorName);
    }

    /**
     * 插入一个新的作者信息
     * @param ancientAuthor
     * @return
     */
    @Override
    public int insertAncientAuthor(AncientAuthor ancientAuthor) {
        ancientAuthor.setAuthorName("龚志鹏");
        ancientAuthor.setAuthorArticleCount(0);

        return ancientAuthorMapper.insertAncientAuthor(ancientAuthor);
    }

    /**
     * 更新作者信息
     * @param ancientAuthor
     * @return
     */
    @Override
    public int updateAncientAuthorByAuthorId(AncientAuthor ancientAuthor) {
        return ancientAuthorMapper.updateAncientAuthorByAuthorId(ancientAuthor);
    }

    /**
     * 更新作者信息中的 likes 字段和 visitCount 字段
     * @param authorId  作者id
     * @param likes   点赞数
     * @param visitCount  访问量
     * @return
     */
    @Override
    public int updateAncientAuthorLikesAndVisitCountByAuthorId(Integer authorId, Integer likes, Integer visitCount) {
        AncientAuthor ancientAuthor = new AncientAuthor();
        ancientAuthor.setAuthorId(authorId);
        ancientAuthor.setLikes(likes);
        ancientAuthor.setVisitCount(visitCount);
        return ancientAuthorMapper.updateAncientAuthorLikesAndVisitCountByAuthorId(ancientAuthor);
    }


}
