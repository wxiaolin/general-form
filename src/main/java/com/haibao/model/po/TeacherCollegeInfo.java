package com.haibao.model.po;

import java.util.Date;

public class TeacherCollegeInfo {
    private Integer tid;

    private String tname;

    private String tno;

    private Date entryDate;

    private Byte tstatus;

    private Integer deptId;

    private Byte touter;

    private Byte title;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public TeacherCollegeInfo(Integer tid, String tname, String tno, Date entryDate, Byte tstatus, Integer deptId, Byte touter, Byte title, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.tid = tid;
        this.tname = tname;
        this.tno = tno;
        this.entryDate = entryDate;
        this.tstatus = tstatus;
        this.deptId = deptId;
        this.touter = touter;
        this.title = title;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public TeacherCollegeInfo() {
        super();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Byte getTstatus() {
        return tstatus;
    }

    public void setTstatus(Byte tstatus) {
        this.tstatus = tstatus;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Byte getTouter() {
        return touter;
    }

    public void setTouter(Byte touter) {
        this.touter = touter;
    }

    public Byte getTitle() {
        return title;
    }

    public void setTitle(Byte title) {
        this.title = title;
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