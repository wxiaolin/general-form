package com.haibao.business.domain.enums;

/**
 * 性别枚举
 * Created by haibao on 2018/1/22.
 */
public enum SexCode {

    MALE( 0,"男"),
    FAMALE(1,"女");

    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    SexCode(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }
}
