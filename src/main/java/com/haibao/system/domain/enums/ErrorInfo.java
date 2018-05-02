package com.haibao.system.domain.enums;

/**
 * Created by haibao on 2018/3/25.
 */
public enum ErrorInfo {
    ERROR_404(404, "请求资源不存在"),
    ERROR_500(500, "服务器内部错误");

    private int code;
    private String msg;

    public int code() {
        return code;
    }

    public void code(int code) {
        this.code = code;
    }

    public String msg() {
        return msg;
    }

    public void msg(String msg) {
        this.msg = msg;
    }

    ErrorInfo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
