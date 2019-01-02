package com.moon.ancientpoetry.web.service.others;

import com.moon.ancientpoetry.web.vo.IndexVo;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/2 11:26
 * @Description:
 */
public interface IndexService {
    /**
     * 根据 userId 获得首页填充信息
     * @param userId
     * @return
     */
    IndexVo indexByUserId(Integer userId);
}
