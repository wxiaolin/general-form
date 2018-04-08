package com.haibao.pojo.entity;

import java.util.Date;

public class Penalty {
    private Integer pid;

    private Byte identity;

    private Integer fkId;

    private Byte plevel;

    private String pdesc;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Penalty(Integer pid, Byte identity, Integer fkId, Byte plevel, String pdesc, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.pid = pid;
        this.identity = identity;
        this.fkId = fkId;
        this.plevel = plevel;
        this.pdesc = pdesc;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Penalty() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getIdentity() {
        return identity;
    }

    public void setIdentity(Byte identity) {
        this.identity = identity;
    }

    public Integer getFkId() {
        return fkId;
    }

    public void setFkId(Integer fkId) {
        this.fkId = fkId;
    }

    public Byte getPlevel() {
        return plevel;
    }

    public void setPlevel(Byte plevel) {
        this.plevel = plevel;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
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