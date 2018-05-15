package com.haibao.business.domain.enums;

/**
 * 身份枚举
 * Created by haibao on 2018/1/22.
 */
public enum IdentityCode {
    STUDENT( 0, "学生"),
    TEACHER( 1, "教师"),
    EMPLOYEE( 2, "员工");
    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    IdentityCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
