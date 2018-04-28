package com.haibao.domain.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by haibao on 2018/1/23.
 */
public class FormVO implements Serializable {
    private static final long serialVersionUID = -6933028693681178806L;
    private double widthh = 840;
    private double heightt;
    private String formName;
    private List<Cell> cellList;
    public FormVO() {

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

    @Override
    public String toString() {
        return "FormVO{" +
                "widthh=" + widthh +
                ", heightt=" + heightt +
                ", formName='" + formName + '\'' +
                ", cellList=" + cellList +
                '}';
    }
}
