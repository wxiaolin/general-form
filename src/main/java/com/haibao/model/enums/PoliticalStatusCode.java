package com.haibao.model.enums;

/**
 * Created by haibao on 2018/1/29.
 */
public enum PoliticalStatusCode {

    QUN_ZHONG((byte) 0, "群众"),
    GONG_QING_TUAN_YUAN((byte) 1, "共青团员"),
    ZHONG_GONG_DANG_YUAN((byte) 2, "中共党员");

    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    PoliticalStatusCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
