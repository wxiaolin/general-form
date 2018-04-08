package com.haibao.pojo.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum EmployeeStatusCode {
    IN_SCHOOL((byte) 0, "离校"),
    LEAVEL_SCHOOL((byte) 1, "在校"),;

    private byte code;

    private String desc;
    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    EmployeeStatusCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
