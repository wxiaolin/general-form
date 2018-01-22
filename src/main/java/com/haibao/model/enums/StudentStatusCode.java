package com.haibao.model.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum StudentStatusCode {

    IN_SCHOOL((byte) 0, "在读"),
    GRADUATE((byte) 1, "毕业"),
    SUSPEND_SCHOOL((byte) 2, "休学");

    StudentStatusCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}
