package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class ArticleTag {
    private Integer articleTagId;

    private String articleTagName;

    private Integer articleParentTagId;

    private String articleParentTag;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public ArticleTag(Integer articleTagId, String articleTagName, Integer articleParentTagId, String articleParentTag, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.articleTagId = articleTagId;
        this.articleTagName = articleTagName;
        this.articleParentTagId = articleParentTagId;
        this.articleParentTag = articleParentTag;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public ArticleTag() {
        super();
    }

    public Integer getArticleTagId() {
        return articleTagId;
    }

    public void setArticleTagId(Integer articleTagId) {
        this.articleTagId = articleTagId;
    }

    public String getArticleTagName() {
        return articleTagName;
    }

    public void setArticleTagName(String articleTagName) {
        this.articleTagName = articleTagName == null ? null : articleTagName.trim();
    }

    public Integer getArticleParentTagId() {
        return articleParentTagId;
    }

    public void setArticleParentTagId(Integer articleParentTagId) {
        this.articleParentTagId = articleParentTagId;
    }

    public String getArticleParentTag() {
        return articleParentTag;
    }

    public void setArticleParentTag(String articleParentTag) {
        this.articleParentTag = articleParentTag == null ? null : articleParentTag.trim();
    }

    public LocalDateTime getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(LocalDateTime dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }

    public LocalDateTime getDataModifyTime() {
        return dataModifyTime;
    }

    public void setDataModifyTime(LocalDateTime dataModifyTime) {
        this.dataModifyTime = dataModifyTime;
    }

    public Boolean getDataIsDeleted() {
        return dataIsDeleted;
    }

    public void setDataIsDeleted(Boolean dataIsDeleted) {
        this.dataIsDeleted = dataIsDeleted;
    }

    @Override
    public String toString() {
        return "ArticleTag{" +
                "articleTagId=" + articleTagId +
                ", articleTagName='" + articleTagName + '\'' +
                ", articleParentTagId=" + articleParentTagId +
                ", articleParentTag='" + articleParentTag + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}