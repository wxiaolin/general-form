package com.haibao.model.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum IdentityCode {
    STUDENT((byte) 0, "开除学籍处分"),
    TEACHER((byte) 1, "留校察看处分"),
    EMPLOYEE((byte) 2, "记大过处分");
    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    IdentityCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
