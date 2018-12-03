package com.moon.ancientpoetry.common.po;


import java.time.LocalDateTime;

public class Relation {
    private Integer relationId;

    private Integer userId;

    private String userName;

    private Integer followId;

    private String followName;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public Relation(Integer relationId, Integer userId, String userName, Integer followId, String followName, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.relationId = relationId;
        this.userId = userId;
        this.userName = userName;
        this.followId = followId;
        this.followName = followName;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public Relation() {
        super();
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
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

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public String getFollowName() {
        return followName;
    }

    public void setFollowName(String followName) {
        this.followName = followName == null ? null : followName.trim();
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