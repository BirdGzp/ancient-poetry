package com.moon.ancientpoetry.common.po;


import java.time.LocalDateTime;

public class ArticleFolder {
    private Integer folderId;

    private String folderName;

    private Integer userId;

    private String userName;

    private String briefIntroduce;

    private Integer parentFolderId;

    private String parentFolderName;

    private String articleCount;

    private Integer likes;

    private Integer readCount;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public ArticleFolder(Integer folderId, String folderName, Integer userId, String userName, String briefIntroduce,
                         Integer parentFolderId, String parentFolderName, String articleCount, Integer likes, Integer readCount,
                         LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.folderId = folderId;
        this.folderName = folderName;
        this.userId = userId;
        this.userName = userName;
        this.briefIntroduce = briefIntroduce;
        this.parentFolderId = parentFolderId;
        this.parentFolderName = parentFolderName;
        this.articleCount = articleCount;
        this.likes = likes;
        this.readCount = readCount;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBriefIntroduce() {
        return briefIntroduce;
    }

    public void setBriefIntroduce(String briefIntroduce) {
        this.briefIntroduce = briefIntroduce;
    }

    public Integer getParentFolderId() {
        return parentFolderId;
    }

    public void setParentFolderId(Integer parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public String getParentFolderName() {
        return parentFolderName;
    }

    public void setParentFolderName(String parentFolderName) {
        this.parentFolderName = parentFolderName;
    }

    public String getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(String articleCount) {
        this.articleCount = articleCount;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
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
        return "ArticleFolder{" +
                "folderId=" + folderId +
                ", folderName='" + folderName + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", briefIntroduce='" + briefIntroduce + '\'' +
                ", parentFolderId=" + parentFolderId +
                ", parentFolderName='" + parentFolderName + '\'' +
                ", articleCount='" + articleCount + '\'' +
                ", likes=" + likes +
                ", readCount=" + readCount +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}