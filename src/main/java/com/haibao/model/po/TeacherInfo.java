package com.haibao.model.po;

import java.util.Date;

public class TeacherInfo {
    private Integer tid;

    private String tno;

    private String tname;

    private Byte sex;

    private Date birthday;

    private Integer crid;

    private Integer nation;

    private String address;

    private String mobile;

    private Byte psId;

    private Date entryDate;

    private Byte tstatus;

    private Integer deptId;

    private Byte touter;

    private Byte title;

    private Integer creator;

    private Date createTime;

    private Integer updater;

    private Date updateTime;

    public TeacherInfo(Integer tid, String tno, String tname, Byte sex, Date birthday, Integer crid, Integer nation, String address, String mobile, Byte psId, Date entryDate, Byte tstatus, Integer deptId, Byte touter, Byte title, Integer creator, Date createTime, Integer updater, Date updateTime) {
        this.tid = tid;
        this.tno = tno;
        this.tname = tname;
        this.sex = sex;
        this.birthday = birthday;
        this.crid = crid;
        this.nation = nation;
        this.address = address;
        this.mobile = mobile;
        this.psId = psId;
        this.entryDate = entryDate;
        this.tstatus = tstatus;
        this.deptId = deptId;
        this.touter = touter;
        this.title = title;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
    }

    public TeacherInfo() {
        super();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getCrid() {
        return crid;
    }

    public void setCrid(Integer crid) {
        this.crid = crid;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getPsId() {
        return psId;
    }

    public void setPsId(Byte psId) {
        this.psId = psId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Byte getTstatus() {
        return tstatus;
    }

    public void setTstatus(Byte tstatus) {
        this.tstatus = tstatus;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Byte getTouter() {
        return touter;
    }

    public void setTouter(Byte touter) {
        this.touter = touter;
    }

    public Byte getTitle() {
        return title;
    }

    public void setTitle(Byte title) {
        this.title = title;
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