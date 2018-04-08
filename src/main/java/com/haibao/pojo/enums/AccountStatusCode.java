package com.haibao.pojo.enums;

/**
 * 账号状态枚举
 * Created by haibao on 2018/1/22.
 */
public enum AccountStatusCode {

    INVALID((byte)0, "失效"),
    NORMAL((byte)1, "正常"),
    FROZEN((byte)2, "冻结");

    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    AccountStatusCode(byte code, String desc) {

        this.code = code;
        this.desc = desc;
    }
}
