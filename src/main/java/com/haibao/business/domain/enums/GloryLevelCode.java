package com.haibao.business.domain.enums;

/**
 * 荣誉等级枚举
 * Created by haibao on 2018/1/22.
 */
public enum GloryLevelCode {
    INTERNATIONAL( 0, "国际级"),
    NATION( 1, "国家级"),
    PROVINCE( 2, "省级"),
    CITY( 3, "市级"),
    COLLEGE( 4, "院级"),
    DEPARTMENT( 5, "系级");



    GloryLevelCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }
}
