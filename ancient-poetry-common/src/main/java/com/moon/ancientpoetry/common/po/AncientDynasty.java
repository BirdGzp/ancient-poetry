package com.moon.ancientpoetry.common.po;


import java.time.LocalDateTime;

public class AncientDynasty {
    private Integer dynastyId;

    private String dynastyEn;

    private String dynastyZh;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataModifyTime;

    private Boolean dataIsDeleted;

    public AncientDynasty(Integer dynastyId, String dynastyEn, String dynastyZh, LocalDateTime dataCreateTime, LocalDateTime dataModifyTime, Boolean dataIsDeleted) {
        this.dynastyId = dynastyId;
        this.dynastyEn = dynastyEn;
        this.dynastyZh = dynastyZh;
        this.dataCreateTime = dataCreateTime;
        this.dataModifyTime = dataModifyTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public AncientDynasty() {
        super();
    }

    public Integer getDynastyId() {
        return dynastyId;
    }

    public void setDynastyId(Integer dynastyId) {
        this.dynastyId = dynastyId;
    }

    public String getDynastyEn() {
        return dynastyEn;
    }

    public void setDynastyEn(String dynastyEn) {
        this.dynastyEn = dynastyEn == null ? null : dynastyEn.trim();
    }

    public String getDynastyZh() {
        return dynastyZh;
    }

    public void setDynastyZh(String dynastyZh) {
        this.dynastyZh = dynastyZh == null ? null : dynastyZh.trim();
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
        return "AncientDynasty{" +
                "dynastyId=" + dynastyId +
                ", dynastyEn='" + dynastyEn + '\'' +
                ", dynastyZh='" + dynastyZh + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }
}