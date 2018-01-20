package com.haibao.model.po;

import java.util.Date;

public class Discipline {
    private Integer did;

    private Byte identity;

    private Integer fkId;

    private Byte dlevel;

    private String ddesc;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Discipline(Integer did, Byte identity, Integer fkId, Byte dlevel, String ddesc, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.did = did;
        this.identity = identity;
        this.fkId = fkId;
        this.dlevel = dlevel;
        this.ddesc = ddesc;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Discipline() {
        super();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
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

    public Byte getDlevel() {
        return dlevel;
    }

    public void setDlevel(Byte dlevel) {
        this.dlevel = dlevel;
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc == null ? null : ddesc.trim();
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