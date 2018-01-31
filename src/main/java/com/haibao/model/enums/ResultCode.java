package com.haibao.model.enums;

/**
 * Created by haibao on 2018/1/30.
 */
public enum ResultCode {

    SUCCESS(200, "OK"),
    FAILS(500, "FAILS");

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    ResultCode(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

}
