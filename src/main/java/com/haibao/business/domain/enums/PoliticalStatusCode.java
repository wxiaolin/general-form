package com.haibao.business.domain.enums;

/**
 * 政治面貌枚举
 * Created by haibao on 2018/1/29.
 */
public enum PoliticalStatusCode {

    QUN_ZHONG( 0, "群众"),
    GONG_QING_TUAN_YUAN( 1, "共青团员"),
    ZHONG_GONG_DANG_YUAN( 2, "中共党员");

    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    PoliticalStatusCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
