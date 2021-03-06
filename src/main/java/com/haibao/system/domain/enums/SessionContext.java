package com.haibao.system.domain.enums;

/**
 * 会话枚举
 * Created by haibao on 2018/3/25.
 */
public enum SessionContext {

    PERSONAL_DETAILS("personalDetails"),
    CURRENT_USER("currentUser");

    private String string;

    public String string() {
        return string;
    }

    SessionContext(String string) {
        this.string = string;
    }
}
