package com.haibao.model.po;

import java.util.Date;

public class EmployeeAccount {
    private Integer aid;

    private Integer eid;

    private String account;

    private String password;

    private Byte astatus;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public EmployeeAccount(Integer aid, Integer eid, String account, String password, Byte astatus, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.aid = aid;
        this.eid = eid;
        this.account = account;
        this.password = password;
        this.astatus = astatus;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public EmployeeAccount() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getAstatus() {
        return astatus;
    }

    public void setAstatus(Byte astatus) {
        this.astatus = astatus;
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