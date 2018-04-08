package com.haibao.pojo.enums;

/**
 * Created by haibao on 2018/3/25.
 */
public enum SessionContext {
    USER_CONTEXT("USER_CONTEXT");

    private String name;

    public String getName() {
        return name;
    }

    SessionContext(String name) {
        this.name = name;
    }
}
