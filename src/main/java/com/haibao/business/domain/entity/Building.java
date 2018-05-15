package com.haibao.business.domain.entity;

import java.util.Date;

public class Building {
    private Integer id;

    private String name;

    public Building(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Building() {
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

}