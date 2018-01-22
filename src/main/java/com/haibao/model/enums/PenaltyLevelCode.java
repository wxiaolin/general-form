package com.haibao.model.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum PenaltyLevelCode {
    // 通报批评、警告处分、严重警告处分、记过处分、记大过处分、留校察看处分、开除学籍处分
    RANK_0((byte) 0, "开除处分"),
    RANK_1((byte) 1, "留校察看处分"),
    RANK_2((byte) 2, "记大过处分"),
    RANK_3((byte) 3, "记过处分"),
    RANK_4((byte) 4, "严重警告处分"),
    RANK_5((byte) 4, "警告处分"),
    RANK_6((byte) 4, "通报批评");;
    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    PenaltyLevelCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
