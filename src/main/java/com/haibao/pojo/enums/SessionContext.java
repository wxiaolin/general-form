package com.haibao.pojo.enums;

/**
 * Created by haibao on 2018/3/25.
 */
public enum SessionContext {

    LOGIN_USER("loginUser");

    private String name;

    public String getName() {
        return name;
    }

    SessionContext(String name) {
        this.name = name;
    }
}
