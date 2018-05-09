package com.haibao.business.domain.enums;

/**
 * 学生就读状态枚举
 * Created by haibao on 2018/1/22.
 */
public enum StudentStatusCode {

    IN_SCHOOL( 0, "在读"),
    GRADUATE( 1, "毕业"),
    SUSPEND_SCHOOL( 2, "休学");

    StudentStatusCode(int code, String desc) {
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
