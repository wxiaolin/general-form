package com.haibao.model.po;

import java.util.Date;

public class Major {
    private Integer mid;

    private String major;

    private Integer deptId;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Major(Integer mid, String major, Integer deptId, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.mid = mid;
        this.major = major;
        this.deptId = deptId;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Major() {
        super();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
        if (!(o instanceof Major)) return false;

        Major major1 = (Major) o;

        if (major != null ? !major.equals(major1.major) : major1.major != null) return false;
        return deptId != null ? deptId.equals(major1.deptId) : major1.deptId == null;
    }

    @Override
    public int hashCode() {
        int result = major != null ? major.hashCode() : 0;
        result = 31 * result + (deptId != null ? deptId.hashCode() : 0);
        return result;
    }
}