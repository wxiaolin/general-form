package com.haibao.business.domain.entity;

import java.util.Date;

public class Major {
    private Integer id;

    private String name;

    private Integer deptId;


    public Major(Integer id, String name, Integer deptId) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

}