package com.haibao.business.domain.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum SubjectType2Code {
    PUBLIC((byte) 0, "公共课"),
    SPECIALIZED((byte) 1, "专业课"),
    BASE_SPECIALIZED((byte) 2, "专业基础课");

    SubjectType2Code(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private byte code;
    private String desc;

    public byte code() {
        return code;
    }

    public String desc() {
        return desc;
    }

}
