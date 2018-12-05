package com.moon.ancientpoetry.user.core.service;

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
