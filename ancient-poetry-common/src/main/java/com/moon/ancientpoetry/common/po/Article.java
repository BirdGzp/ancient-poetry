package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class Article {
    private Integer articleId;

    private String articleName;

    private String articlePath;

    private Byte articleState;

    private Integer folderId;

    private String folderName;

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

    public Article(Integer articleId, String articleName, String articlePath, Byte articleState, Integer folderId,
                   String folderName, Integer authorId, String authorName, Integer articleTypeId, String articleTypeName,
                   String articleTagIds, String articleTags, Integer likes, Integer visitCount, LocalDateTime dataCreateTime,
                   LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articlePath = articlePath;
        this.articleState = articleState;
        this.folderId = folderId;
        this.folderName = folderName;
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
        this.articleName = articleName;
    }

    public String getArticlePath() {
        return articlePath;
    }

    public void setArticlePath(String articlePath) {
        this.articlePath = articlePath;
    }

    public Byte getArticleState() {
        return articleState;
    }

    public void setArticleState(Byte articleState) {
        this.articleState = articleState;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
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
        this.authorName = authorName;
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
        this.articleTypeName = articleTypeName;
    }

    public String getArticleTagIds() {
        return articleTagIds;
    }

    public void setArticleTagIds(String articleTagIds) {
        this.articleTagIds = articleTagIds;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
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
                ", folderId=" + folderId +
                ", folderName='" + folderName + '\'' +
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