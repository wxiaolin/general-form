package com.haibao.model.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum TeacherStatusCode {
    IN_SCHOOL((byte) 0, "离校"),
    LEAVEL_SCHOOL((byte) 1, "在校"),
    INNER((byte) 0, "本校教师"),
    OUTER((byte) 1, "外聘教师");

    private byte code;

    private String desc;
    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    TeacherStatusCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }


}
