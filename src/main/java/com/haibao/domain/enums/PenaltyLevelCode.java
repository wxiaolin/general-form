package com.haibao.domain.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum PenaltyLevelCode {
    // 通报批评、警告处分、严重警告处分、记过处分、记大过处分、留校察看处分、开除学籍处分
    LEVEL_0((byte) 0, "开除处分"),
    LEVEL_1((byte) 1, "留校察看处分"),
    LEVEL_2((byte) 2, "记大过处分"),
    LEVEL_3((byte) 3, "记过处分"),
    LEVEL_4((byte) 4, "严重警告处分"),
    LEVEL_5((byte) 4, "警告处分"),
    LEVEL_6((byte) 4, "通报批评");;
    private byte code;
    private String desc;

    public byte code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    PenaltyLevelCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
