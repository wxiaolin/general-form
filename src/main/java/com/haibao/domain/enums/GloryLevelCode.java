package com.haibao.domain.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum GloryLevelCode {
    INTERNATIONAL((byte) 0, "国际级"),
    NATION((byte) 1, "国家级"),
    PROVINCE((byte) 2, "省级"),
    CITY((byte) 3, "市级"),
    COLLEGE((byte) 4, "院级"),
    DEPARTMENT((byte) 5, "系级");



    GloryLevelCode(byte code, String desc) {
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
