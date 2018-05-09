package com.haibao.business.domain.entity;

import java.util.Date;

public class Form {
    private Integer id;

    private String name;

    private String define;

    private Integer fstatus;

    private String fdesc;

    private Integer deptId;

    private Integer type;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Form(Integer id, String name, String define, Integer fstatus, String fdesc, Integer deptId, Integer type, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.id = id;
        this.name = name;
        this.define = define;
        this.fstatus = fstatus;
        this.fdesc = fdesc;
        this.deptId = deptId;
        this.type = type;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Form() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefine() {
        return define;
    }

    public void setDefine(String define) {
        this.define = define;
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        return "Form{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fstatus=" + fstatus +
                ", fdesc='" + fdesc + '\'' +
                ", deptId=" + deptId +
                ", type=" + type +
                ", creator=" + creator +
                ", createTime=" + createTime +
                ", updater=" + updater +
                ", updateTime=" + updateTime +
                ", define='" + define + '\'' +
                '}';
    }
}