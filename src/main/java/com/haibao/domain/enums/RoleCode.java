package com.haibao.domain.enums;

/**
 * Created by haibao on 2018/3/18.
 */
public enum RoleCode {


    ADMINISTRATOR(0,"管理员"),
    MAKER(1,"制表者"),
    STUDENT(2,"学生");

    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    RoleCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
