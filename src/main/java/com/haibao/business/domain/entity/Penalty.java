package com.haibao.business.domain.entity;

import java.util.Date;

public class Penalty {
    private Integer id;

    private Integer identity;

    private Integer fkId;

    private Integer level;

    private String pdesc;


    public Penalty(Integer id, Integer identity, Integer fkId, Integer level, String pdesc) {
        this.id = id;
        this.identity = identity;
        this.fkId = fkId;
        this.level = level;
        this.pdesc = pdesc;
    }

    public Penalty() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getFkId() {
        return fkId;
    }

    public void setFkId(Integer fkId) {
        this.fkId = fkId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

}