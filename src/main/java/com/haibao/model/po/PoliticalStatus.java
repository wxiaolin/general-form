package com.haibao.model.po;

import java.util.Date;

public class PoliticalStatus {
    private Integer psId;

    private String psName;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public PoliticalStatus(Integer psId, String psName, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.psId = psId;
        this.psName = psName;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public PoliticalStatus() {
        super();
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName == null ? null : psName.trim();
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