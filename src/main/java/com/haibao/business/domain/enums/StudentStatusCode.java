package com.haibao.business.domain.enums;

/**
 * 学生就读状态枚举
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

    public byte code() {
        return code;
    }

    public String desc() {
        return desc;
    }


}
