package com.haibao.business.domain.enums;

/**
 * 获奖类型枚举
 * Created by haibao on 2018/1/22.
 */
public enum GloryTypeCode {
    PERSONAL( 0, "个人奖"),
    TEAM( 1, "团体奖");



    GloryTypeCode(int code, String desc) {
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
