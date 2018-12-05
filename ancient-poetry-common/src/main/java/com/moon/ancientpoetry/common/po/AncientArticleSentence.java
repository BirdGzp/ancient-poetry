package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class AncientArticleSentence {
    /** 句子主键 */
    private Integer ancientArticleSentenceId;
    
    /** 句子主体 */
    private String ancientArticleSentence;
    
    /** 句子翻译后的内容 */
    private String ancientArticleSentenceTranslate;
    
    /** 句子在文中的行号 */
    private Integer ancientArticleSentenceLine;
    
    /** 文章id  */
    private Integer ancientArticleId;
    
    /** 文章名 */
    private String ancientArticleName;

    /** 作者id  */
    private Integer ancientAuthorId;

    /** 作者名 */
    private Integer ancientAuthorName;
    
    /** 阅读量 */
    private Integer visitCount;

    /** 点赞数 */
    private Integer likes;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public AncientArticleSentence(Integer ancientArticleSentenceId, String ancientArticleSentence, String ancientArticleSentenceTranslate, Integer ancientArticleSentenceLine, Integer ancientArticleId, String ancientArticleName, Integer ancientAuthorId, Integer ancientAuthorName, Integer visitCount, Integer likes, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.ancientArticleSentenceId = ancientArticleSentenceId;
        this.ancientArticleSentence = ancientArticleSentence;
        this.ancientArticleSentenceTranslate = ancientArticleSentenceTranslate;
        this.ancientArticleSentenceLine = ancientArticleSentenceLine;
        this.ancientArticleId = ancientArticleId;
        this.ancientArticleName = ancientArticleName;
        this.ancientAuthorId = ancientAuthorId;
        this.ancientAuthorName = ancientAuthorName;
        this.visitCount = visitCount;
        this.likes = likes;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public Integer getAncientArticleSentenceId() {
        return ancientArticleSentenceId;
    }

    public void setAncientArticleSentenceId(Integer ancientArticleSentenceId) {
        this.ancientArticleSentenceId = ancientArticleSentenceId;
    }

    public String getAncientArticleSentence() {
        return ancientArticleSentence;
    }

    public void setAncientArticleSentence(String ancientArticleSentence) {
        this.ancientArticleSentence = ancientArticleSentence;
    }

    public String getAncientArticleSentenceTranslate() {
        return ancientArticleSentenceTranslate;
    }

    public void setAncientArticleSentenceTranslate(String ancientArticleSentenceTranslate) {
        this.ancientArticleSentenceTranslate = ancientArticleSentenceTranslate;
    }

    public Integer getAncientArticleSentenceLine() {
        return ancientArticleSentenceLine;
    }

    public void setAncientArticleSentenceLine(Integer ancientArticleSentenceLine) {
        this.ancientArticleSentenceLine = ancientArticleSentenceLine;
    }

    public Integer getAncientArticleId() {
        return ancientArticleId;
    }

    public void setAncientArticleId(Integer ancientArticleId) {
        this.ancientArticleId = ancientArticleId;
    }

    public String getAncientArticleName() {
        return ancientArticleName;
    }

    public void setAncientArticleName(String ancientArticleName) {
        this.ancientArticleName = ancientArticleName;
    }

    public Integer getAncientAuthorId() {
        return ancientAuthorId;
    }

    public void setAncientAuthorId(Integer ancientAuthorId) {
        this.ancientAuthorId = ancientAuthorId;
    }

    public Integer getAncientAuthorName() {
        return ancientAuthorName;
    }

    public void setAncientAuthorName(Integer ancientAuthorName) {
        this.ancientAuthorName = ancientAuthorName;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
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
        return "AncientArticleSentence{" +
                "ancientArticleSentenceId=" + ancientArticleSentenceId +
                ", ancientArticleSentence='" + ancientArticleSentence + '\'' +
                ", ancientArticleSentenceTranslate='" + ancientArticleSentenceTranslate + '\'' +
                ", ancientArticleSentenceLine=" + ancientArticleSentenceLine +
                ", ancientArticleId=" + ancientArticleId +
                ", ancientArticleName='" + ancientArticleName + '\'' +
                ", ancientAuthorId=" + ancientAuthorId +
                ", ancientAuthorName=" + ancientAuthorName +
                ", visitCount=" + visitCount +
                ", likes=" + likes +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}
