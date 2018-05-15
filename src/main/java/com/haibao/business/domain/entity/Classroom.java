package com.haibao.business.domain.entity;

import java.util.Date;

public class Classroom {
    private Integer id;

    private String name;

    private Integer buildingId;


    public Classroom(Integer id, String name, Integer buildingId) {
        this.id = id;
        this.name = name;
        this.buildingId = buildingId;
    }

    public Classroom() {
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
        this.name = name == null ? null : name.trim();
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

}