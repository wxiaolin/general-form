package com.haibao.business.domain.entity;

import java.util.Date;

public class Major {
    private Integer id;

    private String major;

    private Integer deptId;


    public Major(Integer id, String ajor, Integer deptId) {
        this.id = id;
        this.major = ajor;
        this.deptId = deptId;
    }

    public Major() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

}