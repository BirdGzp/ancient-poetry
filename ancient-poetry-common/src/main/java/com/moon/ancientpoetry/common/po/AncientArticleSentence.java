package com.moon.ancientpoetry.common.po;


import java.time.LocalDateTime;

public class AncientArticleSentence {
    private Integer ancientArticleSentennceId;

    private String ancientArticleSentence;

    private String ancientArticleSentenceTranslate;

    private Integer ancientArticleSentenceLine;

    private Integer ancientArticleId;

    private String ancientArticleName;

    private Integer authorId;

    private String authorName;

    private Integer readCount;

    private Integer likes;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public AncientArticleSentence(Integer ancientArticleSentennceId, String ancientArticleSentence, String ancientArticleSentenceTranslate, Integer ancientArticleSentenceLine, Integer ancientArticleId, String ancientArticleName, Integer authorId, String authorName, Integer readCount, Integer likes, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.ancientArticleSentennceId = ancientArticleSentennceId;
        this.ancientArticleSentence = ancientArticleSentence;
        this.ancientArticleSentenceTranslate = ancientArticleSentenceTranslate;
        this.ancientArticleSentenceLine = ancientArticleSentenceLine;
        this.ancientArticleId = ancientArticleId;
        this.ancientArticleName = ancientArticleName;
        this.authorId = authorId;
        this.authorName = authorName;
        this.readCount = readCount;
        this.likes = likes;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public AncientArticleSentence() {
        super();
    }

    public Integer getAncientArticleSentennceId() {
        return ancientArticleSentennceId;
    }

    public void setAncientArticleSentennceId(Integer ancientArticleSentennceId) {
        this.ancientArticleSentennceId = ancientArticleSentennceId;
    }

    public String getAncientArticleSentence() {
        return ancientArticleSentence;
    }

    public void setAncientArticleSentence(String ancientArticleSentence) {
        this.ancientArticleSentence = ancientArticleSentence == null ? null : ancientArticleSentence.trim();
    }

    public String getAncientArticleSentenceTranslate() {
        return ancientArticleSentenceTranslate;
    }

    public void setAncientArticleSentenceTranslate(String ancientArticleSentenceTranslate) {
        this.ancientArticleSentenceTranslate = ancientArticleSentenceTranslate == null ? null : ancientArticleSentenceTranslate.trim();
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
        this.ancientArticleName = ancientArticleName == null ? null : ancientArticleName.trim();
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

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
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
}