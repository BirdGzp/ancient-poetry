package com.moon.ancientpoetry.web.vo;

import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/1 13:36
 * @Description:  首页视图
 */
public class IndexVo {

    private Integer userId;

    private String userPenName;

    private List ancientArticleList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPenName() {
        return userPenName;
    }

    public void setUserPenName(String userPenName) {
        this.userPenName = userPenName;
    }

    public List getAncientArticleList() {
        return ancientArticleList;
    }

    public void setAncientArticleList(List ancientArticleList) {
        this.ancientArticleList = ancientArticleList;
    }

    @Override
    public String toString() {
        return "IndexVo{" +
                "userId=" + userId +
                ", userPenName='" + userPenName + '\'' +
                ", ancientArticleList=" + ancientArticleList +
                '}';
    }
}
