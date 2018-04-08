package com.haibao.pojo.entity;

import java.util.Date;

public class District {
    private Integer did;

    private String dname;

    private Byte drank;

    private Integer belong;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public District(Integer did, String dname, Byte drank, Integer belong, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.did = did;
        this.dname = dname;
        this.drank = drank;
        this.belong = belong;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public District() {
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

    public Byte getDrank() {
        return drank;
    }

    public void setDrank(Byte drank) {
        this.drank = drank;
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
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
    public String toString() {
        return "District{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", belong=" + belong +
                '}';
    }
}