package com.haibao.model.po;

import java.util.Date;

public class Glory {
    private Integer gid;

    private String awardee;

    private String gname;

    private Byte glevel;

    private Byte gtype;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Glory(Integer gid, String awardee, String gname, Byte glevel, Byte gtype, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.gid = gid;
        this.awardee = awardee;
        this.gname = gname;
        this.glevel = glevel;
        this.gtype = gtype;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Glory() {
        super();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getAwardee() {
        return awardee;
    }

    public void setAwardee(String awardee) {
        this.awardee = awardee == null ? null : awardee.trim();
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Byte getGlevel() {
        return glevel;
    }

    public void setGlevel(Byte glevel) {
        this.glevel = glevel;
    }

    public Byte getGtype() {
        return gtype;
    }

    public void setGtype(Byte gtype) {
        this.gtype = gtype;
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