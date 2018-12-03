package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class UserDetail {
    private Integer userId;

    private Integer writingCount;

    private Integer followCount;

    private Integer followerCount;

    private String userFame;

    private String userCall;

    private String userAlternativeName;

    private Integer favoriteAuthorId;

    private String favoriteAuthorName;

    private Integer favoriteArticleId;

    private String favoriteArticleName;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public UserDetail(Integer userId, Integer writingCount, Integer followCount, Integer followerCount, String userFame, String userCall, String userAlternativeName, Integer favoriteAuthorId, String favoriteAuthorName, Integer favoriteArticleId, String favoriteArticleName, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.userId = userId;
        this.writingCount = writingCount;
        this.followCount = followCount;
        this.followerCount = followerCount;
        this.userFame = userFame;
        this.userCall = userCall;
        this.userAlternativeName = userAlternativeName;
        this.favoriteAuthorId = favoriteAuthorId;
        this.favoriteAuthorName = favoriteAuthorName;
        this.favoriteArticleId = favoriteArticleId;
        this.favoriteArticleName = favoriteArticleName;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public UserDetail() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWritingCount() {
        return writingCount;
    }

    public void setWritingCount(Integer writingCount) {
        this.writingCount = writingCount;
    }

    public Integer getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public String getUserFame() {
        return userFame;
    }

    public void setUserFame(String userFame) {
        this.userFame = userFame == null ? null : userFame.trim();
    }

    public String getUserCall() {
        return userCall;
    }

    public void setUserCall(String userCall) {
        this.userCall = userCall == null ? null : userCall.trim();
    }

    public String getUserAlternativeName() {
        return userAlternativeName;
    }

    public void setUserAlternativeName(String userAlternativeName) {
        this.userAlternativeName = userAlternativeName == null ? null : userAlternativeName.trim();
    }

    public Integer getFavoriteAuthorId() {
        return favoriteAuthorId;
    }

    public void setFavoriteAuthorId(Integer favoriteAuthorId) {
        this.favoriteAuthorId = favoriteAuthorId;
    }

    public String getFavoriteAuthorName() {
        return favoriteAuthorName;
    }

    public void setFavoriteAuthorName(String favoriteAuthorName) {
        this.favoriteAuthorName = favoriteAuthorName == null ? null : favoriteAuthorName.trim();
    }

    public Integer getFavoriteArticleId() {
        return favoriteArticleId;
    }

    public void setFavoriteArticleId(Integer favoriteArticleId) {
        this.favoriteArticleId = favoriteArticleId;
    }

    public String getFavoriteArticleName() {
        return favoriteArticleName;
    }

    public void setFavoriteArticleName(String favoriteArticleName) {
        this.favoriteArticleName = favoriteArticleName == null ? null : favoriteArticleName.trim();
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