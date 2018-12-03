package com.moon.ancientpoetry.common.po;


import java.time.LocalDateTime;

public class Address {
    private Integer addressId;

    private Integer parentId;

    private String path;

    private Integer level;

    private String name;

    private String nameEn;

    private String nameZh;

    private String code;

    private LocalDateTime dataModifyTime;

    private LocalDateTime dataCreateTime;

    private Boolean dataIsDeleted;

    public Address(Integer addressId, Integer parentId, String path, Integer level, String name, String nameEn, String nameZh, String code, LocalDateTime dataModifyTime, LocalDateTime dataCreateTime, Boolean dataIsDeleted) {
        this.addressId = addressId;
        this.parentId = parentId;
        this.path = path;
        this.level = level;
        this.name = name;
        this.nameEn = nameEn;
        this.nameZh = nameZh;
        this.code = code;
        this.dataModifyTime = dataModifyTime;
        this.dataCreateTime = dataCreateTime;
        this.dataIsDeleted = dataIsDeleted;
    }

    public Address() {
        super();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh == null ? null : nameZh.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public LocalDateTime getDataModifyTime() {
        return dataModifyTime;
    }

    public void setDataModifyTime(LocalDateTime dataModifyTime) {
        this.dataModifyTime = dataModifyTime;
    }

    public LocalDateTime getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(LocalDateTime dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }

    public Boolean getDataIsDeleted() {
        return dataIsDeleted;
    }

    public void setDataIsDeleted(Boolean dataIsDeleted) {
        this.dataIsDeleted = dataIsDeleted;
    }
}