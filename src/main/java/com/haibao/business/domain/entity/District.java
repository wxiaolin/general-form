package com.haibao.business.domain.entity;

import java.util.Date;

public class District {
    private Integer id;

    private String name;

    private Integer rank;

    private Integer belong;


    public District(Integer id, String name, Integer rank, Integer belong) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.belong = belong;
    }

    public District() {
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

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }

}