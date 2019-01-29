package com.moon.ancientpoetry.web.vo;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 13:36
 * @Description:  首页视图
 */
public class IndexVo {

    private Integer userId;

    private String penName;

    private List ancientArticleList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List getAncientArticleList() {
        return ancientArticleList;
    }

    public void setAncientArticleList(List ancientArticleList) {
        this.ancientArticleList = ancientArticleList;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    @Override
    public String toString() {
        return "IndexVo{" +
                "userId=" + userId +
                ", penName='" + penName + '\'' +
                ", ancientArticleList=" + ancientArticleList +
                '}';
    }
}
