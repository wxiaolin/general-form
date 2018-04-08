package com.haibao.pojo.enums;

/**
 * 权限枚举
 * Created by haibao on 2018/1/22.
 */
public enum AdministratorLevelCode {
    SUPER_ADMINISTRATOR((byte)0, "超级管理员"),
    FORM_ADMINISTRATOR((byte)1, "表格管理员");


    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    AdministratorLevelCode(byte code, String desc) {

        this.code = code;
        this.desc = desc;
    }
}
