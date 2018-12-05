package com.moon.ancientpoetry.poetry.core.service.impl;

import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.poetry.core.mapper.AncientAuthorMapper;
import com.moon.ancientpoetry.poetry.core.service.AncientAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ancientAuthorService")
public class AncientAuthorServiceImpl implements AncientAuthorService {
    @Autowired
    AncientAuthorMapper ancientAuthorMapper;

    public AncientAuthor getAncientAuthor(Integer ancientAuthorId){
        return ancientAuthorMapper.selectByPrimaryKey(ancientAuthorId);
    }
}
