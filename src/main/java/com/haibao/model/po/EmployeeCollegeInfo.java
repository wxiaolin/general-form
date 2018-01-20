package com.haibao.model.po;

import java.util.Date;

public class EmployeeCollegeInfo {
    private Integer eid;

    private String empName;

    private String empNo;

    private Byte estatus;

    private Integer deptId;

    private Integer jobId;

    private Date entryDate;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public EmployeeCollegeInfo(Integer eid, String empName, String empNo, Byte estatus, Integer deptId, Integer jobId, Date entryDate, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.eid = eid;
        this.empName = empName;
        this.empNo = empNo;
        this.estatus = estatus;
        this.deptId = deptId;
        this.jobId = jobId;
        this.entryDate = entryDate;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public EmployeeCollegeInfo() {
        super();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public Byte getEstatus() {
        return estatus;
    }

    public void setEstatus(Byte estatus) {
        this.estatus = estatus;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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