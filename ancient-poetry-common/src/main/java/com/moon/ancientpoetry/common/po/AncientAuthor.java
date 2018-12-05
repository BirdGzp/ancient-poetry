package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class AncientAuthor {
    /** 作者id */
    private Integer authorId;
    /** 作者名 */
    private String authorName;
    /** 图片路径 */
    private Integer authorImage;
    /** 作品数量 */
    private Integer authorArticleCount;
    /** 生涯 */
    private String authorLifetime;
    /** 祖籍 */
    private String authorAddress;
    /** 字 */
    private String authorCharacter;
    /** 名 */
    private String authorFame;
    /** 谥号 */
    private String authorCall;
    /** 号 */
    private String authorAlternativeName;
    /** 朝代编号 */
    private Integer authorDynastyId;
    /** 朝代名 */
    private String authorDynastyName;
    /** 介绍  */
    private String authorIntroduce;
    /** 文章url */
    private String articleUrl;
    /** 点赞数 */
    private Integer likes;
    /** 访问数 */
    private Integer visitCount;
    
    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public AncientAuthor(Integer authorId, String authorName, Integer authorImage, Integer authorArticleCount, String authorLifetime, String authorAddress, String authorCharacter, String authorFame, String authorCall, String authorAlternativeName, Integer authorDynastyId, String authorDynastyName, String authorIntroduce, String articleUrl, Integer likes, Integer visitCount, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorImage = authorImage;
        this.authorArticleCount = authorArticleCount;
        this.authorLifetime = authorLifetime;
        this.authorAddress = authorAddress;
        this.authorCharacter = authorCharacter;
        this.authorFame = authorFame;
        this.authorCall = authorCall;
        this.authorAlternativeName = authorAlternativeName;
        this.authorDynastyId = authorDynastyId;
        this.authorDynastyName = authorDynastyName;
        this.authorIntroduce = authorIntroduce;
        this.articleUrl = articleUrl;
        this.likes = likes;
        this.visitCount = visitCount;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public AncientAuthor() {
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

    public Integer getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(Integer authorImage) {
        this.authorImage = authorImage;
    }

    public Integer getAuthorArticleCount() {
        return authorArticleCount;
    }

    public void setAuthorArticleCount(Integer authorArticleCount) {
        this.authorArticleCount = authorArticleCount;
    }

    public String getAuthorLifetime() {
        return authorLifetime;
    }

    public void setAuthorLifetime(String authorLifetime) {
        this.authorLifetime = authorLifetime;
    }

    public String getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }

    public String getAuthorCharacter() {
        return authorCharacter;
    }

    public void setAuthorCharacter(String authorCharacter) {
        this.authorCharacter = authorCharacter;
    }

    public String getAuthorFame() {
        return authorFame;
    }

    public void setAuthorFame(String authorFame) {
        this.authorFame = authorFame;
    }

    public String getAuthorCall() {
        return authorCall;
    }

    public void setAuthorCall(String authorCall) {
        this.authorCall = authorCall;
    }

    public String getAuthorAlternativeName() {
        return authorAlternativeName;
    }

    public void setAuthorAlternativeName(String authorAlternativeName) {
        this.authorAlternativeName = authorAlternativeName;
    }

    public Integer getAuthorDynastyId() {
        return authorDynastyId;
    }

    public void setAuthorDynastyId(Integer authorDynastyId) {
        this.authorDynastyId = authorDynastyId;
    }

    public String getAuthorDynastyName() {
        return authorDynastyName;
    }

    public void setAuthorDynastyName(String authorDynastyName) {
        this.authorDynastyName = authorDynastyName;
    }

    public String getAuthorIntroduce() {
        return authorIntroduce;
    }

    public void setAuthorIntroduce(String authorIntroduce) {
        this.authorIntroduce = authorIntroduce;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
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
        return "AncientAuthor{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorImage=" + authorImage +
                ", authorArticleCount=" + authorArticleCount +
                ", authorLifetime='" + authorLifetime + '\'' +
                ", authorAddress='" + authorAddress + '\'' +
                ", authorCharacter='" + authorCharacter + '\'' +
                ", authorFame='" + authorFame + '\'' +
                ", authorCall='" + authorCall + '\'' +
                ", authorAlternativeName='" + authorAlternativeName + '\'' +
                ", authorDynastyId=" + authorDynastyId +
                ", authorDynastyName='" + authorDynastyName + '\'' +
                ", authorIntroduce='" + authorIntroduce + '\'' +
                ", articleUrl='" + articleUrl + '\'' +
                ", likes=" + likes +
                ", visitCount=" + visitCount +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}

