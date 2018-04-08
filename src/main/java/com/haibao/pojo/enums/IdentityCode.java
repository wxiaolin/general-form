package com.haibao.pojo.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum IdentityCode {
    STUDENT((byte) 0, "学生"),
    TEACHER((byte) 1, "教师"),
    EMPLOYEE((byte) 2, "员工");
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
