package com.haibao.business.domain.enums;

/**
 * 课程类型2 枚举
 * Created by haibao on 2018/1/22.
 */
public enum SubjectType2Code {
    PUBLIC( 0, "公共课"),
    SPECIALIZED( 1, "专业课"),
    BASE_SPECIALIZED( 2, "专业基础课");

    SubjectType2Code(int code, String desc) {
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
