package com.haibao.exception;

/**
 * @Author: caot
 * @Date: 2018/4/26 0026 下午 4:52
 */
public class WebException extends Exception{

    private String msg;

    public WebException(String message, String msg) {
        super(message);
        this.msg = msg;
    }
}
