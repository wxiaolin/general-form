package com.haibao.business.domain.entity;

import java.util.Date;

public class Subject {
    private Integer id;

    private String subject;

    private Byte stype1;

    private Byte stype2;

    private Integer deptId;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Subject(Integer id, String subject, Byte stype1, Byte stype2, Integer deptId, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.id = id;
        this.subject = subject;
        this.stype1 = stype1;
        this.stype2 = stype2;
        this.deptId = deptId;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Subject() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Byte getStype1() {
        return stype1;
    }

    public void setStype1(Byte stype1) {
        this.stype1 = stype1;
    }

    public Byte getStype2() {
        return stype2;
    }

    public void setStype2(Byte stype2) {
        this.stype2 = stype2;
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
}