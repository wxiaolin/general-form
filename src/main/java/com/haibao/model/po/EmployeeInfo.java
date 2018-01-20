package com.haibao.model.po;

import java.util.Date;

public class EmployeeInfo {
    private Integer eid;

    private Integer eciId;

    private Byte sex;

    private Date birthday;

    private Integer crid;

    private Integer nation;

    private String address;

    private String mobile;

    private Byte psId;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public EmployeeInfo(Integer eid, Integer eciId, Byte sex, Date birthday, Integer crid, Integer nation, String address, String mobile, Byte psId, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.eid = eid;
        this.eciId = eciId;
        this.sex = sex;
        this.birthday = birthday;
        this.crid = crid;
        this.nation = nation;
        this.address = address;
        this.mobile = mobile;
        this.psId = psId;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public EmployeeInfo() {
        super();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getEciId() {
        return eciId;
    }

    public void setEciId(Integer eciId) {
        this.eciId = eciId;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getCrid() {
        return crid;
    }

    public void setCrid(Integer crid) {
        this.crid = crid;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getPsId() {
        return psId;
    }

    public void setPsId(Byte psId) {
        this.psId = psId;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdater() {
        return updater;
    }

    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}