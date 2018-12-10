package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class UserTimeLine {
    private Integer eventId;

    private String eventTitle;

    private Integer userId;

    private String userName;

    private String eventDetail;

    private Byte eventState;

    private LocalDateTime eventHappenTime;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public UserTimeLine(Integer eventId, String eventTitle, Integer userId, String userName, String eventDetail, Byte eventState, LocalDateTime eventHappenTime, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.userId = userId;
        this.userName = userName;
        this.eventDetail = eventDetail;
        this.eventState = eventState;
        this.eventHappenTime = eventHappenTime;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public UserTimeLine() {
        super();
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle == null ? null : eventTitle.trim();
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

    public String getEventDetail() {
        return eventDetail;
    }

    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail == null ? null : eventDetail.trim();
    }

    public Byte getEventState() {
        return eventState;
    }

    public void setEventState(Byte eventState) {
        this.eventState = eventState;
    }

    public LocalDateTime getEventHappenTime() {
        return eventHappenTime;
    }

    public void setEventHappenTime(LocalDateTime eventHapenTime) {
        this.eventHappenTime = eventHappenTime;
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
        return "UserTimeLine{" +
                "eventId=" + eventId +
                ", eventTitle='" + eventTitle + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", eventDetail='" + eventDetail + '\'' +
                ", eventState=" + eventState +
                ", eventHappenTime=" + eventHappenTime +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}