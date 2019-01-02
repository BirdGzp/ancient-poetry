package com.moon.ancientpoetry.web.service.poetry;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:13
 * @Description:
 */
public interface AncientArticleService {
    /**
     * 获得推荐的十首古诗词
     * @return
     */
     List listRecommendAncientPoetry();
}
