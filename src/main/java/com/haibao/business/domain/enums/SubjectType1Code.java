package com.haibao.business.domain.enums;

/**
 * 课程类型1 枚举
 * Created by haibao on 2018/1/22.
 */
public enum SubjectType1Code {
    REQUIRED( 0, "必修课"),
    OPTIONAL( 1, "选修课");

    SubjectType1Code(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

}
