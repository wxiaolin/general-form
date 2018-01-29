package com.haibao.model.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by haibao on 2018/1/23.
 */
public class Form implements Serializable {

    private double widthh = 840;

    private double heightt;

    private String formName;

    private List<Cell> cellList;

    public Form() {

    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public List<Cell> getCellList() {
        return cellList;
    }

    public void setCellList(List<Cell> cellList) {
        this.cellList = cellList;
    }

    public double getWidthh() {
        return widthh;
    }

    public void setWidthh(double widthh) {
        this.widthh = widthh;
    }

    public double getHeightt() {
        return heightt;
    }

    public void setHeightt(double heightt) {
        this.heightt = heightt;
    }
}
