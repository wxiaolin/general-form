package com.haibao.model.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum FormStatusCode {
    INVALID((byte)0, "失效"),
    NORMAL((byte)1, "正常");

    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    FormStatusCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
