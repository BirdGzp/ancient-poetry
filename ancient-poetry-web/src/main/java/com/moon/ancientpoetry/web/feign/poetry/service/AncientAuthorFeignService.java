package com.moon.ancientpoetry.web.feign.poetry.service;


import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.web.feign.poetry.fallback.AncientAuthorFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 14:06
 * @Description:
 */
@Component
@FeignClient(value = "ANCIENT-POETRY-POETRY-CORE", fallback = AncientAuthorFeignServiceFallback.class)
public interface AncientAuthorFeignService {

    @RequestMapping(value = "/list/full/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listFullAllAncientAuthor(
            @PathVariable(name = "pageNum", required = false) Integer pageNum,
            @PathVariable(name = "pageSize", required = false) Integer pageSize);


    @RequestMapping(value = "/list/{pageNum}/{pageSize}", method = RequestMethod.POST)
    String listBriefAncientAuthor(
            @PathVariable(name = "pageNum") Integer pageNum,
            @PathVariable(name = "pageSize") Integer pageSize);


    @RequestMapping(value = "/get/id/{id}", method = RequestMethod.POST)
    String getAncientAuthorByAuthorId(
            @PathVariable("id") int id);


    @RequestMapping(value = "/get/brief/id/{id}", method = RequestMethod.POST)
    String getBriefAncientAuthorByAuthorId(
            @PathVariable("id") int id);


    @RequestMapping(value = "get/name/{name}", method = RequestMethod.POST)
    String getAncientAuthorByAuthorName(
            @PathVariable("name") String authorName);


    @RequestMapping(value = "get/brief/name/{name}", method = RequestMethod.POST)
    String getBriefAncientAuthorByAuthorName(
            @PathVariable("name") String authorName);


    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    String insertAncientAuthor(AncientAuthor ancientAuthor);


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    String updateAncientAuthor(AncientAuthor ancientAuthor);


    @RequestMapping(value = "/update/id/{id}/likes/{likes}/visit_count/{visitCount}", method = RequestMethod.POST)
    String updateAncientAuthorLikesAndVisitCount(
            @PathVariable("id") Integer authorId,
            @PathVariable("likes") Integer likes,
            @PathVariable("visitCount") Integer visitCount);
}
