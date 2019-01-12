package com.moon.ancientpoetry.web.service.user.impl;

import com.moon.ancientpoetry.web.feign.user.service.LikeFeignService;
import com.moon.ancientpoetry.web.service.user.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:22
 * @Description:
 */
@Service("likeService")
public class LikeServiceImpl implements LikeService {
    @Autowired
    LikeFeignService likeFeignService;


}
