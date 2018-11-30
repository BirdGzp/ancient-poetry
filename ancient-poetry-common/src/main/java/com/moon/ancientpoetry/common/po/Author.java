package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

/**
 * 文章的 作者表
 */
public class Author {
    /** 主键标识符 */
    private Integer authorId;
    /** 作者名称 */
    private String authorName;
    /** 作者图片 */
    private String authorImage;
    /** 文章数量 */
    private Integer authorAritcleCount;
    /** 作者生涯 */
    private String authorLifetime;
    /** 作者祖籍 */
    private String authorAddress;
    /** 作者的字 */
    private String authorCharacter;
    /** 作者的名 */
    private String authorFame;
    /** 作者的谥号 */
    private String authorCall;
    /** 作者的号 */
    private String authorAlternativeName;
    /** 朝代主键*/
    private Integer authorDynastyId;
    /** 朝代*/
    private String authorDynstyName;
    /** 作者的详细介绍 */
    private String authorIntroduce;
    /** */
    private String articleUrl;

    private LocalDateTime dataCreateTime;
    private LocalDateTime dataModifyTime;
    private Byte dataIsDeleted;

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

    public String getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage;
    }

    public Integer getAuthorAritcleCount() {
        return authorAritcleCount;
    }

    public void setAuthorAritcleCount(Integer authorAritcleCount) {
        this.authorAritcleCount = authorAritcleCount;
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

    public String getAuthorDynstyName() {
        return authorDynstyName;
    }

    public void setAuthorDynstyName(String authorDynstyName) {
        this.authorDynstyName = authorDynstyName;
    }

    public String getAuthorIntroduce() {
        return authorIntroduce;
    }

    public void setAuthorIntroduce(String authorIntroduce) {
        this.authorIntroduce = authorIntroduce;
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

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorImage='" + authorImage + '\'' +
                ", authorAritcleCount=" + authorAritcleCount +
                ", authorLifetime='" + authorLifetime + '\'' +
                ", authorAddress='" + authorAddress + '\'' +
                ", authorCharacter='" + authorCharacter + '\'' +
                ", authorFame='" + authorFame + '\'' +
                ", authorCall='" + authorCall + '\'' +
                ", authorAlternativeName='" + authorAlternativeName + '\'' +
                ", authorDynastyId=" + authorDynastyId +
                ", authorDynstyName='" + authorDynstyName + '\'' +
                ", authorIntroduce='" + authorIntroduce + '\'' +
                ", articleUrl='" + articleUrl + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}