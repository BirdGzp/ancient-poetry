package com.moon.ancientpoetry.web.dto;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.po.UserDetail;

import java.time.LocalDateTime;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/14 19:59
 * @Description:
 */
public class UserDto {
    private Integer userId;

    private String userName;

    private String penName;

    private String userCharacter;

    private String sex;

    private LocalDateTime birthDate;

    private String telephone;

    private String email;

    private String password;

    private String ip;

    private String userImage;

    private Integer likes;

    private Integer readCount;

    private Integer writeCount;

    private Integer followCount;

    private Integer followerCount;

    private String briefIntroduce;

    private Integer addressId;

    private String detailAddress;

    private LocalDateTime lastLoginTime;

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

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public String getUserCharacter() {
        return userCharacter;
    }

    public void setUserCharacter(String userCharacter) {
        this.userCharacter = userCharacter;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
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

    public Integer getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(Integer writeCount) {
        this.writeCount = writeCount;
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

    public String getBriefIntroduce() {
        return briefIntroduce;
    }

    public void setBriefIntroduce(String briefIntroduce) {
        this.briefIntroduce = briefIntroduce;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getUserFame() {
        return userFame;
    }

    public void setUserFame(String userFame) {
        this.userFame = userFame;
    }

    public String getUserCall() {
        return userCall;
    }

    public void setUserCall(String userCall) {
        this.userCall = userCall;
    }

    public String getUserAlternativeName() {
        return userAlternativeName;
    }

    public void setUserAlternativeName(String userAlternativeName) {
        this.userAlternativeName = userAlternativeName;
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
        this.favoriteAuthorName = favoriteAuthorName;
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
        this.favoriteArticleName = favoriteArticleName;
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
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", penName='" + penName + '\'' +
                ", userCharacter='" + userCharacter + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", ip='" + ip + '\'' +
                ", userImage='" + userImage + '\'' +
                ", likes=" + likes +
                ", readCount=" + readCount +
                ", writeCount=" + writeCount +
                ", followCount=" + followCount +
                ", followerCount=" + followerCount +
                ", briefIntroduce='" + briefIntroduce + '\'' +
                ", addressId=" + addressId +
                ", detailAddress='" + detailAddress + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", userFame='" + userFame + '\'' +
                ", userCall='" + userCall + '\'' +
                ", userAlternativeName='" + userAlternativeName + '\'' +
                ", favoriteAuthorId=" + favoriteAuthorId +
                ", favoriteAuthorName='" + favoriteAuthorName + '\'' +
                ", favoriteArticleId=" + favoriteArticleId +
                ", favoriteArticleName='" + favoriteArticleName + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}
