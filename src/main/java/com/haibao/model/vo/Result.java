package com.haibao.model.vo;

import java.io.Serializable;

/**
 * Created by haibao on 2018/1/30.
 */
public class Result implements Serializable{


    private static final long serialVersionUID = 4913564835384751506L;
    private Boolean success;
    private Integer code;
    private String msg;
    private Object data;


    public Result(Boolean success, Integer code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result() {

    }
}
