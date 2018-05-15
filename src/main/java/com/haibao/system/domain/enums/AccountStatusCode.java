package com.haibao.system.domain.enums;

/**
 * 账号状态枚举
 * Created by haibao on 2018/1/22.
 */
public enum AccountStatusCode {

    INVALID(0, "失效"),
    NORMAL(1, "正常"),
    FROZEN(2, "冻结");

    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    AccountStatusCode(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }
}
