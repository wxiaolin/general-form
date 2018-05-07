package com.haibao.system.domain.enums;

/**
 * ResultCode枚举
 * Created by haibao on 2018/1/30.
 */
public enum ResultCode {

    SUCCESS(200, "OK"),
    ERROR_400(400,"参数绑定错误"),
    ERROR_403(403, "身份验证失败"),
    ERROR_404(404, "请求资源不存在"),
    ERROR_500(500, "服务器内部错误");

    private int code;
    private String msg;

    public int code() {
        return code;
    }

    public String msg() {
        return msg;
    }

    ResultCode(int code, String desc) {
        this.code = code;
        this.msg = desc;
    }

}
