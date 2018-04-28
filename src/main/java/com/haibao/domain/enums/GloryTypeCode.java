package com.haibao.domain.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum GloryTypeCode {
    PERSONAL((byte) 0, "个人奖"),
    TEAM((byte) 1, "团体奖");



    GloryTypeCode(byte code, String desc) {
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
