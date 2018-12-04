package com.moon.ancientpoetry.common.po;


import java.time.LocalDateTime;

public class AncientArticle {
    private Integer articleId;

    private String articleName;

    private Integer authorId;

    private String authorName;

    private Integer dynastyId;

    private String dynastyName;

    private String articleContent;

    private String articleTagIds;

    private String articleTags;

    private String articleUrl;

    private Integer likes;

    private Integer visitCount;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public AncientArticle(Integer articleId, String articleName, Integer authorId, String authorName, Integer dynastyId, String dynastyName, String articleContent, String articleTagIds, String articleTags, String articleUrl, Integer likes, Integer visitCount, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.authorId = authorId;
        this.authorName = authorName;
        this.dynastyId = dynastyId;
        this.dynastyName = dynastyName;
        this.articleContent = articleContent;
        this.articleTagIds = articleTagIds;
        this.articleTags = articleTags;
        this.articleUrl = articleUrl;
        this.likes = likes;
        this.visitCount = visitCount;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public AncientArticle() {
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

    public Integer getDynastyId() {
        return dynastyId;
    }

    public void setDynastyId(Integer dynastyId) {
        this.dynastyId = dynastyId;
    }

    public String getDynastyName() {
        return dynastyName;
    }

    public void setDynastyName(String dynastyName) {
        this.dynastyName = dynastyName == null ? null : dynastyName.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
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

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
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
        return "AncientArticle{" +
                "articleId=" + articleId +
                ", articleName='" + articleName + '\'' +
                ", authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", dynastyId=" + dynastyId +
                ", dynastyName='" + dynastyName + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleTagIds='" + articleTagIds + '\'' +
                ", articleTags='" + articleTags + '\'' +
                ", articleUrl='" + articleUrl + '\'' +
                ", likes=" + likes +
                ", visitCount=" + visitCount +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}