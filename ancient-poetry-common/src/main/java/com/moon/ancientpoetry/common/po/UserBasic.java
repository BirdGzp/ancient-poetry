package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class UserBasic {
    private Integer userId;

    private String userName;

    private String penName;

    private String userCharacter;

    private Boolean sex;

    private LocalDateTime birthDate;

    private String telephone;

    private String email;

    private String password;

    private String ip;

    private String userImage;

    private Integer likes;

    private Integer readCount;

    private String briefIntroduce;

    private Integer addressId;

    private String detailAddress;

    private LocalDateTime lastLoginTime;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public UserBasic(Integer userId, String userName, String penName, String userCharacter, Boolean sex, LocalDateTime birthDate, String telephone, String email, String password, String ip, String userImage, Integer likes, Integer readCount, String briefIntroduce, Integer addressId, String detailAddress, LocalDateTime lastLoginTime, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.userId = userId;
        this.userName = userName;
        this.penName = penName;
        this.userCharacter = userCharacter;
        this.sex = sex;
        this.birthDate = birthDate;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.ip = ip;
        this.userImage = userImage;
        this.likes = likes;
        this.readCount = readCount;
        this.briefIntroduce = briefIntroduce;
        this.addressId = addressId;
        this.detailAddress = detailAddress;
        this.lastLoginTime = lastLoginTime;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public UserBasic() {
        super();
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

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName == null ? null : penName.trim();
    }

    public String getUserCharacter() {
        return userCharacter;
    }

    public void setUserCharacter(String userCharacter) {
        this.userCharacter = userCharacter == null ? null : userCharacter.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
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
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
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

    public String getBriefIntroduce() {
        return briefIntroduce;
    }

    public void setBriefIntroduce(String briefIntroduce) {
        this.briefIntroduce = briefIntroduce == null ? null : briefIntroduce.trim();
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
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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