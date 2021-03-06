package com.haibao.business.domain.enums;

/**
 * 学期枚举
 * Created by haibao on 2018/1/22.
 */
public enum TermCode {
    FIRST( 0, "第一学期"),
    SECOND( 1, "第二学期");


    TermCode(int code, String desc) {
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
