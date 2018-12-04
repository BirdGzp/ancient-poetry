package com.moon.ancientpoetry.user.core.service;

import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.user.core.mapper.AncientAuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ancientAuthorService")
public class AncientAuthorServiceImpl {

    @Autowired
    AncientAuthorMapper ancientAuthorMapper;

    public AncientAuthor getAncientAuthor(Integer ancientAuthorId){
        return ancientAuthorMapper.selectByPrimaryKey(ancientAuthorId);
    }
}
