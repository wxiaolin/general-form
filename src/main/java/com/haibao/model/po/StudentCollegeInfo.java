package com.haibao.model.po;

import java.util.Date;

public class StudentCollegeInfo {
    private Integer sid;

    private String stuName;

    private String stuNo;

    private Date regdate;

    private Byte sstatus;

    private Integer deptId;

    private Integer majorId;

    private Integer minorId1;

    private Integer minorId2;

    private Date grade;

    private Integer classId;

    private Integer apartment;

    private Integer room;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public StudentCollegeInfo(Integer sid, String stuName, String stuNo, Date regdate, Byte sstatus, Integer deptId, Integer majorId, Integer minorId1, Integer minorId2, Date grade, Integer classId, Integer apartment, Integer room, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.sid = sid;
        this.stuName = stuName;
        this.stuNo = stuNo;
        this.regdate = regdate;
        this.sstatus = sstatus;
        this.deptId = deptId;
        this.majorId = majorId;
        this.minorId1 = minorId1;
        this.minorId2 = minorId2;
        this.grade = grade;
        this.classId = classId;
        this.apartment = apartment;
        this.room = room;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public StudentCollegeInfo() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo == null ? null : stuNo.trim();
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Byte getSstatus() {
        return sstatus;
    }

    public void setSstatus(Byte sstatus) {
        this.sstatus = sstatus;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getMinorId1() {
        return minorId1;
    }

    public void setMinorId1(Integer minorId1) {
        this.minorId1 = minorId1;
    }

    public Integer getMinorId2() {
        return minorId2;
    }

    public void setMinorId2(Integer minorId2) {
        this.minorId2 = minorId2;
    }

    public Date getGrade() {
        return grade;
    }

    public void setGrade(Date grade) {
        this.grade = grade;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
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