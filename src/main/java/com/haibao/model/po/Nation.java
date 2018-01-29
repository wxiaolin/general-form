package com.haibao.model.po;

import java.util.Date;

public class Nation {
    private Integer nid;

    private String nname;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Nation(Integer nid, String nname, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.nid = nid;
        this.nname = nname;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Nation() {
        super();
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname == null ? null : nname.trim();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nation)) return false;

        Nation nation = (Nation) o;

        return nname != null ? nname.equals(nation.nname) : nation.nname == null;
    }

    @Override
    public int hashCode() {
        return nname != null ? nname.hashCode() : 0;
    }
}