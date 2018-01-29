package com.haibao.model.po;

import java.util.Date;

public class ClassTable {
    private Integer cid;

    private Integer deptId;

    private Date grade;

    private Integer majorId;

    private Byte classNo;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public ClassTable(Integer cid, Integer deptId, Date grade, Integer majorId, Byte classNo, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.cid = cid;
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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassTable)) return false;

        ClassTable that = (ClassTable) o;

        if (deptId != null ? !deptId.equals(that.deptId) : that.deptId != null) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;
        if (majorId != null ? !majorId.equals(that.majorId) : that.majorId != null) return false;
        return classNo != null ? classNo.equals(that.classNo) : that.classNo == null;
    }

    @Override
    public int hashCode() {
        int result = deptId != null ? deptId.hashCode() : 0;
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (majorId != null ? majorId.hashCode() : 0);
        result = 31 * result + (classNo != null ? classNo.hashCode() : 0);
        return result;
    }
}