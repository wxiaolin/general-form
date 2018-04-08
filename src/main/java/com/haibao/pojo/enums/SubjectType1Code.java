package com.haibao.pojo.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum SubjectType1Code {
    REQUIRED((byte) 0, "必修课"),
    OPTIONAL((byte) 1, "选修课");

    SubjectType1Code(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
