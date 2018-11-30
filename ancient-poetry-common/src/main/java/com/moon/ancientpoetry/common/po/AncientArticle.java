package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class AncientArticle {
    /** 古文id */
    private Integer articleId;
    
    /** 古文名称 */
    private String articleName;
    
    /** 作者 id */
    private Integer authorId;

    /** 作者名称 */
    private String authorName;

    /** 朝代id */
    private Integer dynastyId;

    /** 朝代名称 */
    private String dyanstyName;

    /** 文章内容 */
    private String articleContent;

    /** 文章标签id */
    private Integer articleTagIds;

    /** 文章标签 */
    private String articleTags;

    /** 文章的URL */
    private String articleUrl;

    private LocalDateTime dataCreateTime;
    private LocalDateTime dataModifyTime;
    private Byte dataIsDeleted;

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

    public Integer getDynastyId() {
        return dynastyId;
    }

    public void setDynastyId(Integer dynastyId) {
        this.dynastyId = dynastyId;
    }

    public String getDyanstyName() {
        return dyanstyName;
    }

    public void setDyanstyName(String dyanstyName) {
        this.dyanstyName = dyanstyName;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleTagIds() {
        return articleTagIds;
    }

    public void setArticleTagIds(Integer articleTagIds) {
        this.articleTagIds = articleTagIds;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
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

    public Byte getDataIsDeleted() {
        return dataIsDeleted;
    }

    public void setDataIsDeleted(Byte dataIsDeleted) {
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
                ", dyanstyName='" + dyanstyName + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleTagIds=" + articleTagIds +
                ", articleTags='" + articleTags + '\'' +
                ", articleUrl='" + articleUrl + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}
