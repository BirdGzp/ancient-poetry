package com.moon.ancientpoetry.common.po;


import java.time.LocalDateTime;

public class AncientWordTranslate {
    private Integer articleWordId;

    private Integer wordId;

    private String word;

    private String wordTranslate;

    private Integer wordFromArticleId;

    private String wordFromArticleName;

    private Integer wordFromSentenceId;

    private String wordFromSentence;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public AncientWordTranslate(Integer articleWordId, Integer wordId, String word, String wordTranslate, Integer wordFromArticleId, String wordFromArticleName, Integer wordFromSentenceId, String wordFromSentence, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.articleWordId = articleWordId;
        this.wordId = wordId;
        this.word = word;
        this.wordTranslate = wordTranslate;
        this.wordFromArticleId = wordFromArticleId;
        this.wordFromArticleName = wordFromArticleName;
        this.wordFromSentenceId = wordFromSentenceId;
        this.wordFromSentence = wordFromSentence;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public AncientWordTranslate() {
        super();
    }

    public Integer getArticleWordId() {
        return articleWordId;
    }

    public void setArticleWordId(Integer articleWordId) {
        this.articleWordId = articleWordId;
    }

    public Integer getWordId() {
        return wordId;
    }

    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public String getWordTranslate() {
        return wordTranslate;
    }

    public void setWordTranslate(String wordTranslate) {
        this.wordTranslate = wordTranslate == null ? null : wordTranslate.trim();
    }

    public Integer getWordFromArticleId() {
        return wordFromArticleId;
    }

    public void setWordFromArticleId(Integer wordFromArticleId) {
        this.wordFromArticleId = wordFromArticleId;
    }

    public String getWordFromArticleName() {
        return wordFromArticleName;
    }

    public void setWordFromArticleName(String wordFromArticleName) {
        this.wordFromArticleName = wordFromArticleName == null ? null : wordFromArticleName.trim();
    }

    public Integer getWordFromSentenceId() {
        return wordFromSentenceId;
    }

    public void setWordFromSentenceId(Integer wordFromSentenceId) {
        this.wordFromSentenceId = wordFromSentenceId;
    }

    public String getWordFromSentence() {
        return wordFromSentence;
    }

    public void setWordFromSentence(String wordFromSentence) {
        this.wordFromSentence = wordFromSentence == null ? null : wordFromSentence.trim();
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
        return "AncientWordTranslate{" +
                "articleWordId=" + articleWordId +
                ", wordId=" + wordId +
                ", word='" + word + '\'' +
                ", wordTranslate='" + wordTranslate + '\'' +
                ", wordFromArticleId=" + wordFromArticleId +
                ", wordFromArticleName='" + wordFromArticleName + '\'' +
                ", wordFromSentenceId=" + wordFromSentenceId +
                ", wordFromSentence='" + wordFromSentence + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}