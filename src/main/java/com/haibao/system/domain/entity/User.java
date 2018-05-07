package com.haibao.system.domain.entity;

import java.util.Date;
import java.util.List;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Byte astatus;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    private List<Role> roles;

    public User(Integer id, String username, String password, Byte astatus, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.astatus = astatus;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", astatus=" + astatus +
                ", creator=" + creator +
                ", createTime=" + createTime +
                ", updater=" + updater +
                ", updateTime=" + updateTime +
                ", userRoles=" + roles +
                '}';
    }
}