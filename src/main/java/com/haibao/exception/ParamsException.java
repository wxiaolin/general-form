package com.haibao.exception;

import com.haibao.pojo.enums.ResultCode;

/**
 * @Author: caot
 * @Date: 2018/4/27 0027 上午 9:23
 */
public class ParamsException extends Exception {


    public ParamsException(String message) {
        super(message);
    }

    public ParamsException() {

    }
}
