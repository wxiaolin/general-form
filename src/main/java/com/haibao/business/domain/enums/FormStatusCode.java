package com.haibao.business.domain.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum FormStatusCode {
    INVALID((byte)0, "失效"),
    NORMAL((byte)1, "正常");

    private byte code;
    private String desc;

    public byte code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    FormStatusCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
