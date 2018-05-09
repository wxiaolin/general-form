package com.haibao.business.domain.entity;

import java.util.Date;

public class StudentInfo {
    private Integer id;

    private String name;

    private String stuNo;

    private Integer sex;

    private Date birthday;

    private Integer crid;

    private Integer nationId;

    private String address;

    private String mobile;

    private Integer psId;

    private Date regdate;

    private Integer sstatus;

    private Integer deptId;

    private Integer majorId;

    private Integer minorId1;

    private Integer minorId2;

    private Date grade;

    private Integer classId;

    private Integer apartmentId;

    private Integer roomId;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    private District district;
    private Nation nation;
    private Dept dept;
    private Major major;
    private ClassTable classTable;
    private Building apartment;
    private Room room;

    public StudentInfo(Integer id, String name, String stuNo, Integer sex, Date birthday, Integer crid, Integer nationId, String address, String mobile, Integer psId, Date regdate, Integer sstatus, Integer deptId, Integer majorId, Integer minorId1, Integer minorId2, Date grade, Integer classId, Integer apartmentId, Integer roomId, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.id = id;
        this.name = name;
        this.stuNo = stuNo;
        this.sex = sex;
        this.birthday = birthday;
        this.crid = crid;
        this.nationId = nationId;
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
        this.apartmentId = apartmentId;
        this.roomId = roomId;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
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

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
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

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Integer getSstatus() {
        return sstatus;
    }

    public void setSstatus(Integer sstatus) {
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

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public ClassTable getClassTable() {
        return classTable;
    }

    public void setClassTable(ClassTable classTable) {
        this.classTable = classTable;
    }

    public Building getApartment() {
        return apartment;
    }

    public void setApartment(Building apartment) {
        this.apartment = apartment;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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
                ", nation=" + nationId +
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
                ", apartmentId=" + apartmentId +
                ", roomId=" + roomId +
                ", creator=" + creator +
                ", createTime=" + createTime +
                ", updater=" + updater +
                ", updateTime=" + updateTime +
                '}';
    }
}