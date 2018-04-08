package com.haibao.pojo.enums;

/**
 * Created by haibao on 2018/3/18.
 */
public enum RoleCode {


    ADMINISTRATOR(0,"管理员"),
    MAKER(1,"制表者"),
//    EMPLOYEE(2,"学校员工"),
//    TEACHER(3,"教师"),
    STUDENT(2,"学生");

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    RoleCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
