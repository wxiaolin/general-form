package com.haibao.business.domain.entity;

import java.util.Date;

public class StudentInfo {
    private Integer id;

    private String name;

    private String stuNo;

    private Byte sex;

    private Date birthday;

    private Integer crid;

    private Integer nation;

    private String address;

    private String mobile;

    private Byte psId;

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

    public StudentInfo(Integer id, String name, String stuNo, Byte sex, Date birthday, Integer crid, Integer nation, String address, String mobile, Byte psId, Date regdate, Byte sstatus, Integer deptId, Integer majorId, Integer minorId1, Integer minorId2, Date grade, Integer classId, Integer apartment, Integer room, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.id = id;
        this.name = name;
        this.stuNo = stuNo;
        this.sex = sex;
        this.birthday = birthday;
        this.crid = crid;
        this.nation = nation;
        this.address = address;
        this.mobile = mobile;
        this.psId = psId;
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

    public StudentInfo() {
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

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo == null ? null : stuNo.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getCrid() {
        return crid;
    }

    public void setCrid(Integer crid) {
        this.crid = crid;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getPsId() {
        return psId;
    }

    public void setPsId(Byte psId) {
        this.psId = psId;
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

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", crid=" + crid +
                ", nation=" + nation +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", psId=" + psId +
                ", regdate=" + regdate +
                ", sstatus=" + sstatus +
                ", deptId=" + deptId +
                ", majorId=" + majorId +
                ", minorId1=" + minorId1 +
                ", minorId2=" + minorId2 +
                ", grade=" + grade +
                ", classId=" + classId +
                ", apartment=" + apartment +
                ", room=" + room +
                ", creator=" + creator +
                ", createTime=" + createTime +
                ", updater=" + updater +
                ", updateTime=" + updateTime +
                '}';
    }
}