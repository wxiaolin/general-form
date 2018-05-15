package com.haibao.business.domain.entity;

import java.util.Date;

public class Subject {
    private Integer id;

    private String subject;

    private Integer stype1;

    private Integer stype2;

    private Integer deptId;


    public Subject(Integer id, String subject, Integer stype1, Integer stype2, Integer deptId) {
        this.id = id;
        this.subject = subject;
        this.stype1 = stype1;
        this.stype2 = stype2;
        this.deptId = deptId;
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

    public Integer getStype1() {
        return stype1;
    }

    public void setStype1(Integer stype1) {
        this.stype1 = stype1;
    }

    public Integer getStype2() {
        return stype2;
    }

    public void setStype2(Integer stype2) {
        this.stype2 = stype2;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

}