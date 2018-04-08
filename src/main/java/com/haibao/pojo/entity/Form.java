package com.haibao.pojo.entity;

import java.util.Arrays;
import java.util.Date;

public class Form {
    private Integer fid;
    private String fname;
    private Byte fstatus;
    private String fdesc;
    private Integer deptId;
    private Byte ftype;
    private Integer creator;
    private Date createTime;
    private Integer updater;
    private Date updateTime;
    private byte[] fdefine;

    public Form(Integer fid, String fname, Byte fstatus, String fdesc, Integer deptId, Byte ftype, Integer creator, Date createTime, Integer updater, Date updateTime, byte[] fdefine) {
        this.fid = fid;
        this.fname = fname;
        this.fstatus = fstatus;
        this.fdesc = fdesc;
        this.deptId = deptId;
        this.ftype = ftype;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
        this.fdefine = fdefine;
    }

    public Form() {
        super();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
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

    public Byte getFtype() {
        return ftype;
    }

    public void setFtype(Byte ftype) {
        this.ftype = ftype;
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

    public byte[] getFdefine() {
        return fdefine;
    }

    public void setFdefine(byte[] fdefine) {
        this.fdefine = fdefine;
    }

    @Override
    public String toString() {
        return "Form{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", fstatus=" + fstatus +
                ", fdesc='" + fdesc + '\'' +
                ", deptId=" + deptId +
                ", ftype=" + ftype +
                ", creator=" + creator +
                ", createTime=" + createTime +
                ", updater=" + updater +
                ", updateTime=" + updateTime +
                ", fdefine=" + Arrays.toString(fdefine) +
                '}';
    }
}