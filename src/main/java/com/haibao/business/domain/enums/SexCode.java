package com.haibao.business.domain.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum SexCode {

    MALE((byte) 0,"男"),
    FAMALE((byte)1,"女");

    private byte code;
    private String desc;

    public byte code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    SexCode(byte code, String desc) {

        this.code = code;
        this.desc = desc;
    }
}
