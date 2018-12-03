package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class UserTimeLine {
    private Integer eventId;

    private String eventTitle;

    private Integer userId;

    private String userName;

    private String eventDetail;

    private Byte eventState;

    private LocalDateTime eventHapenTime;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataMidifyTime;

    private Boolean dataIsDeleted;

    public UserTimeLine(Integer eventId, String eventTitle, Integer userId, String userName, String eventDetail, Byte eventState, LocalDateTime eventHapenTime, LocalDateTime dataCreateTime, LocalDateTime dataMidifyTime, Boolean dataIsDeleted) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.userId = userId;
        this.userName = userName;
        this.eventDetail = eventDetail;
        this.eventState = eventState;
        this.eventHapenTime = eventHapenTime;
        this.dataCreateTime = dataCreateTime;
        this.dataMidifyTime = dataMidifyTime;
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

    public LocalDateTime getEventHapenTime() {
        return eventHapenTime;
    }

    public void setEventHapenTime(LocalDateTime eventHapenTime) {
        this.eventHapenTime = eventHapenTime;
    }

    public LocalDateTime getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(LocalDateTime dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }

    public LocalDateTime getDataMidifyTime() {
        return dataMidifyTime;
    }

    public void setDataMidifyTime(LocalDateTime dataMidifyTime) {
        this.dataMidifyTime = dataMidifyTime;
    }

    public Boolean getDataIsDeleted() {
        return dataIsDeleted;
    }

    public void setDataIsDeleted(Boolean dataIsDeleted) {
        this.dataIsDeleted = dataIsDeleted;
    }
}