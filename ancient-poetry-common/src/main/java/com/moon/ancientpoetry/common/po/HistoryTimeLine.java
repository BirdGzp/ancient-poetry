package com.moon.ancientpoetry.common.po;

import java.time.LocalDateTime;

public class HistoryTimeLine {
    private Integer eventId;

    private String eventTitle;

    private Byte eventOfType;

    private Integer eventOfId;

    private String eventOfName;

    private Boolean showName;

    private Integer uploadUserId;

    private String uploadUserName;

    private String eventContent;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public HistoryTimeLine(Integer eventId, String eventTitle, Byte eventOfType, Integer eventOfId, String eventOfName, Boolean showName, Integer uploadUserId, String uploadUserName, String eventContent, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.eventOfType = eventOfType;
        this.eventOfId = eventOfId;
        this.eventOfName = eventOfName;
        this.showName = showName;
        this.uploadUserId = uploadUserId;
        this.uploadUserName = uploadUserName;
        this.eventContent = eventContent;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public HistoryTimeLine() {
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

    public Byte getEventOfType() {
        return eventOfType;
    }

    public void setEventOfType(Byte eventOfType) {
        this.eventOfType = eventOfType;
    }

    public Integer getEventOfId() {
        return eventOfId;
    }

    public void setEventOfId(Integer eventOfId) {
        this.eventOfId = eventOfId;
    }

    public String getEventOfName() {
        return eventOfName;
    }

    public void setEventOfName(String eventOfName) {
        this.eventOfName = eventOfName == null ? null : eventOfName.trim();
    }

    public Boolean getShowName() {
        return showName;
    }

    public void setShowName(Boolean showName) {
        this.showName = showName;
    }

    public Integer getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(Integer uploadUserId) {
        this.uploadUserId = uploadUserId;
    }

    public String getUploadUserName() {
        return uploadUserName;
    }

    public void setUploadUserName(String uploadUserName) {
        this.uploadUserName = uploadUserName == null ? null : uploadUserName.trim();
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent == null ? null : eventContent.trim();
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
        return "HistoryTimeLine{" +
                "eventId=" + eventId +
                ", eventTitle='" + eventTitle + '\'' +
                ", eventOfType=" + eventOfType +
                ", eventOfId=" + eventOfId +
                ", eventOfName='" + eventOfName + '\'' +
                ", showName=" + showName +
                ", uploadUserId=" + uploadUserId +
                ", uploadUserName='" + uploadUserName + '\'' +
                ", eventContent='" + eventContent + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}