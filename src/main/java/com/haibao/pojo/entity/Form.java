package com.haibao.pojo.entity;

import java.util.Date;

public class Form {
    private Integer id;

    private String name;

    private Byte fstatus;

    private String fdesc;

    private Integer deptId;

    private Byte type;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    private byte[] define;

    public Form(Integer id, String name, Byte fstatus, String fdesc, Integer deptId, Byte type, Integer creator, Date createTime, Integer updater, Date updateTime, byte[] define) {
        this.id = id;
        this.name = name;
        this.fstatus = fstatus;
        this.fdesc = fdesc;
        this.deptId = deptId;
        this.type = type;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
        this.define = define;
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
        this.name = name == null ? null : name.trim();
    }

    public Byte getFstatus() {
        return fstatus;
    }

    public void setFstatus(Byte fstatus) {
        this.fstatus = fstatus;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc == null ? null : fdesc.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
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

    public byte[] getDefine() {
        return define;
    }

    public void setDefine(byte[] define) {
        this.define = define;
    }
}