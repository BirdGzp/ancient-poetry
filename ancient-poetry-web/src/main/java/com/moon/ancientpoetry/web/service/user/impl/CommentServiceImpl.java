package com.moon.ancientpoetry.web.service.user.impl;

import com.moon.ancientpoetry.web.feign.user.service.CommentFeignService;
import com.moon.ancientpoetry.web.service.user.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/12 16:21
 * @Description:
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentFeignService commentFeignService;
}
