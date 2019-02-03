package com.moon.ancientpoetry.web.service.poetry;

import com.moon.ancientpoetry.common.po.AncientWord;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 15:14
 * @Description:
 */
public interface AncientWordService {
    String getAncientWordByAncientWordId(Integer ancientWordId);

    String getAncientWordByAncientWord(String ancientWord);
    String insertAuthorWord(AncientWord ancientWord);
}
