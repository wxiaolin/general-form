package com.haibao.business.domain.entity;

import java.util.Date;

public class Penalty {
    private Integer id;

    private Byte identity;

    private Integer fkId;

    private Byte level;

    private String pdesc;


    public Penalty(Integer id, Byte identity, Integer fkId, Byte level, String pdesc) {
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

    public Byte getIdentity() {
        return identity;
    }

    public void setIdentity(Byte identity) {
        this.identity = identity;
    }

    public Integer getFkId() {
        return fkId;
    }

    public void setFkId(Integer fkId) {
        this.fkId = fkId;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

}