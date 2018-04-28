package com.haibao.domain.entity;

import java.util.Date;

public class ClassTable {
    private Integer id;

    private Integer deptId;

    private Date grade;

    private Integer majorId;

    private Byte classNo;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public ClassTable(Integer id, Integer deptId, Date grade, Integer majorId, Byte classNo, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.id = id;
        this.deptId = deptId;
        this.grade = grade;
        this.majorId = majorId;
        this.classNo = classNo;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public ClassTable() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Date getGrade() {
        return grade;
    }

    public void setGrade(Date grade) {
        this.grade = grade;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Byte getClassNo() {
        return classNo;
    }

    public void setClassNo(Byte classNo) {
        this.classNo = classNo;
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