package com.haibao.model.po;

import java.util.Date;

public class Score {
    private Integer sid;

    private Integer stuId;

    private String ayear;

    private Byte semester;

    private Float score;

    private Integer subjectId;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public Score(Integer sid, Integer stuId, String ayear, Byte semester, Float score, Integer subjectId, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.sid = sid;
        this.stuId = stuId;
        this.ayear = ayear;
        this.semester = semester;
        this.score = score;
        this.subjectId = subjectId;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public Score() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
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