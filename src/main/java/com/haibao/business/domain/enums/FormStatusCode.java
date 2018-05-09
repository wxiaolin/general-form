package com.haibao.business.domain.enums;

/**
 * 表格状态枚举
 * Created by haibao on 2018/1/22.
 */
public enum FormStatusCode {
    INVALID(0, "失效"),
    NORMAL(1, "正常");

    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    FormStatusCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
