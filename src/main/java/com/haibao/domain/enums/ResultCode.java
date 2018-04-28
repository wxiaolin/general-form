package com.haibao.domain.enums;

/**
 * Created by haibao on 2018/1/30.
 */
public enum ResultCode {

    SUCCESS(200, "OK"),
    ERROR_404(404, "请求资源不存在"),
    ERROR_500(500, "服务器内部错误");

    private int code;
    private String desc;

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    ResultCode(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

}
