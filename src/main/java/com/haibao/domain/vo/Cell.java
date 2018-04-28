package com.haibao.domain.vo;

import java.io.Serializable;

/**
 * Created by haibao on 2018/1/22.
 */
public class Cell implements Serializable{
    private static final long serialVersionUID = 5429366605589727371L;
    private Double widthh;
    private Double heightt;
    private Double fontSize;
    private String keyy;
    private String valuee;
    private Boolean hasBorder;

    public Cell() {

    }

    public Double getWidthh() {
        return widthh;
    }

    public void setWidthh(Double widthh) {
        this.widthh = widthh;
    }

    public Double getHeightt() {
        return heightt;
    }

    public void setHeightt(Double heightt) {
        this.heightt = heightt;
    }

    public Double getFontSize() {
        return fontSize;
    }

    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }

    public String getKeyy() {
        return keyy;
    }

    public void setKeyy(String keyy) {
        this.keyy = keyy;
    }

    public String getValuee() {
        return valuee;
    }

    public void setValuee(String valuee) {
        this.valuee = valuee;
    }

    public Boolean getHasBorder() {
        return hasBorder;
    }

    public void setHasBorder(Boolean hasBorder) {
        this.hasBorder = hasBorder;
    }
}
