package com.haibao.business.domain.entity;

import java.util.Date;

public class Dept {
    private Integer id;

    private String name;

    private Integer belong;

    private String ddesc;


    public Dept(Integer id, String name, Integer belong, String ddesc) {
        this.id = id;
        this.name = name;
        this.belong = belong;
        this.ddesc = ddesc;
    }

    public Dept() {
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

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc == null ? null : ddesc.trim();
    }

}