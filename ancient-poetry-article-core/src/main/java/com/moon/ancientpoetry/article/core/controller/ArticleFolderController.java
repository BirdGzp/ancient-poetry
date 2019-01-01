package com.moon.ancientpoetry.article.core.controller;

import com.moon.ancientpoetry.article.core.service.ArticleFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:31
 * @Description:
 */
@RestController
@RequestMapping("/article/folder")
public class ArticleFolderController {
    @Autowired
    ArticleFolderService articleFolderService;
}
