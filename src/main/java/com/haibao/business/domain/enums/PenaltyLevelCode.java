package com.haibao.business.domain.enums;

/**
 * 记过等级枚举
 * Created by haibao on 2018/1/22.
 */
public enum PenaltyLevelCode {
    // 通报批评、警告处分、严重警告处分、记过处分、记大过处分、留校察看处分、开除学籍处分
    LEVEL_0( 0, "开除处分"),
    LEVEL_1( 1, "留校察看处分"),
    LEVEL_2( 2, "记大过处分"),
    LEVEL_3( 3, "记过处分"),
    LEVEL_4( 4, "严重警告处分"),
    LEVEL_5( 4, "警告处分"),
    LEVEL_6( 4, "通报批评");;
    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    PenaltyLevelCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
