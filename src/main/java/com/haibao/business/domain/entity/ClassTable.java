package com.haibao.business.domain.entity;

import java.util.Date;

public class ClassTable {
    private Integer id;

    private Integer deptId;

    private Date grade;

    private Integer majorId;

    private Byte classNo;

    public ClassTable(Integer id, Integer deptId, Date grade, Integer majorId, Byte classNo) {
        this.id = id;
        this.deptId = deptId;
        this.grade = grade;
        this.majorId = majorId;
        this.classNo = classNo;
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

}