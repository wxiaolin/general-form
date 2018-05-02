package com.haibao.business.domain.entity;

import java.util.Date;

public class Score {
    private Integer id;

    private Integer stuId;

    private String ayear;

    private Byte semester;

    private Float score1;

    private Float score2;

    private Integer subjectId;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Score(Integer id, Integer stuId, String ayear, Byte semester, Float score1, Float score2, Integer subjectId, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.id = id;
        this.stuId = stuId;
        this.ayear = ayear;
        this.semester = semester;
        this.score1 = score1;
        this.score2 = score2;
        this.subjectId = subjectId;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Score() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getAyear() {
        return ayear;
    }

    public void setAyear(String ayear) {
        this.ayear = ayear == null ? null : ayear.trim();
    }

    public Byte getSemester() {
        return semester;
    }

    public void setSemester(Byte semester) {
        this.semester = semester;
    }

    public Float getScore1() {
        return score1;
    }

    public void setScore1(Float score1) {
        this.score1 = score1;
    }

    public Float getScore2() {
        return score2;
    }

    public void setScore2(Float score2) {
        this.score2 = score2;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
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