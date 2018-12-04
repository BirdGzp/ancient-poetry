package com.moon.ancientpoetry.common.po;


import java.time.LocalDateTime;

public class ArticleFloder {
    private Integer floderId;

    private String floderName;

    private Integer userId;

    private String userName;

    private String briefIntroduce;

    private Integer parentFloaderId;

    private String parentFloderName;

    private String articleCount;

    private Integer likes;

    private Integer readCount;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public ArticleFloder(Integer floderId, String floderName, Integer userId, String userName, String briefIntroduce, Integer parentFloaderId, String parentFloderName, String articleCount, Integer likes, Integer readCount, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.floderId = floderId;
        this.floderName = floderName;
        this.userId = userId;
        this.userName = userName;
        this.briefIntroduce = briefIntroduce;
        this.parentFloaderId = parentFloaderId;
        this.parentFloderName = parentFloderName;
        this.articleCount = articleCount;
        this.likes = likes;
        this.readCount = readCount;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public ArticleFloder() {
        super();
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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getBriefIntroduce() {
        return briefIntroduce;
    }

    public void setBriefIntroduce(String briefIntroduce) {
        this.briefIntroduce = briefIntroduce == null ? null : briefIntroduce.trim();
    }

    public Integer getParentFloaderId() {
        return parentFloaderId;
    }

    public void setParentFloaderId(Integer parentFloaderId) {
        this.parentFloaderId = parentFloaderId;
    }

    public String getParentFloderName() {
        return parentFloderName;
    }

    public void setParentFloderName(String parentFloderName) {
        this.parentFloderName = parentFloderName == null ? null : parentFloderName.trim();
    }

    public String getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(String articleCount) {
        this.articleCount = articleCount == null ? null : articleCount.trim();
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
        return "ArticleFloder{" +
                "floderId=" + floderId +
                ", floderName='" + floderName + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", briefIntroduce='" + briefIntroduce + '\'' +
                ", parentFloaderId=" + parentFloaderId +
                ", parentFloderName='" + parentFloderName + '\'' +
                ", articleCount='" + articleCount + '\'' +
                ", likes=" + likes +
                ", readCount=" + readCount +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}