package com.moon.ancientpoetry.web.service.poetry.impl;

import com.moon.ancientpoetry.web.feign.poetry.service.AncientArticleSentenceFeignService;
import com.moon.ancientpoetry.web.service.poetry.AncientArticleSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:17
 * @Description:
 */
@Service("ancientArticleSentenceService")
public class AncientArticleSentenceServiceImpl implements AncientArticleSentenceService {
    @Autowired
    AncientArticleSentenceFeignService ancientArticleSentenceFeignService;
}
