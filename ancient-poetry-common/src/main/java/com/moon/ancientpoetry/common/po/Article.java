package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class Article {
    private Integer articleId;

    private String articleName;

    private String articlePath;

    private Byte articleState;

    private Integer floderId;

    private String floderName;

    private Integer authorId;

    private String authorName;

    private Integer articleTypeId;

    private String articleTypeName;

    private String articleTagIds;

    private String articleTags;

    private Integer likes;

    private Integer visitCount;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public Article(Integer articleId, String articleName, String articlePath, Byte articleState, Integer floderId, String floderName, Integer authorId, String authorName, Integer articleTypeId, String articleTypeName, String articleTagIds, String articleTags, Integer likes, Integer visitCount, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articlePath = articlePath;
        this.articleState = articleState;
        this.floderId = floderId;
        this.floderName = floderName;
        this.authorId = authorId;
        this.authorName = authorName;
        this.articleTypeId = articleTypeId;
        this.articleTypeName = articleTypeName;
        this.articleTagIds = articleTagIds;
        this.articleTags = articleTags;
        this.likes = likes;
        this.visitCount = visitCount;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public Article() {
        super();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName == null ? null : articleName.trim();
    }

    public String getArticlePath() {
        return articlePath;
    }

    public void setArticlePath(String articlePath) {
        this.articlePath = articlePath == null ? null : articlePath.trim();
    }

    public Byte getArticleState() {
        return articleState;
    }

    public void setArticleState(Byte articleState) {
        this.articleState = articleState;
    }

    public Integer getFloderId() {
        return floderId;
    }

    public void setFloderId(Integer floderId) {
        this.floderId = floderId;
    }

    public String getFloderName() {
        return floderName;
    }

    public void setFloderName(String floderName) {
        this.floderName = floderName == null ? null : floderName.trim();
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName == null ? null : articleTypeName.trim();
    }

    public String getArticleTagIds() {
        return articleTagIds;
    }

    public void setArticleTagIds(String articleTagIds) {
        this.articleTagIds = articleTagIds == null ? null : articleTagIds.trim();
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags == null ? null : articleTags.trim();
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
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
        return "Article{" +
                "articleId=" + articleId +
                ", articleName='" + articleName + '\'' +
                ", articlePath='" + articlePath + '\'' +
                ", articleState=" + articleState +
                ", floderId=" + floderId +
                ", floderName='" + floderName + '\'' +
                ", authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", articleTypeId=" + articleTypeId +
                ", articleTypeName='" + articleTypeName + '\'' +
                ", articleTagIds='" + articleTagIds + '\'' +
                ", articleTags='" + articleTags + '\'' +
                ", likes=" + likes +
                ", visitCount=" + visitCount +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}