package com.haibao.pojo.entity;

import java.util.Date;

public class Dept {
    private Integer did;

    private String dname;

    private Integer belong;

    private String ddesc;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Dept(Integer did, String dname, Integer belong, String ddesc, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.did = did;
        this.dname = dname;
        this.belong = belong;
        this.ddesc = ddesc;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Dept() {
        super();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dept)) return false;

        Dept dept = (Dept) o;

        if (dname != null ? !dname.equals(dept.dname) : dept.dname != null) return false;
        return belong != null ? belong.equals(dept.belong) : dept.belong == null;
    }

    @Override
    public int hashCode() {
        int result = dname != null ? dname.hashCode() : 0;
        result = 31 * result + (belong != null ? belong.hashCode() : 0);
        return result;
    }
}