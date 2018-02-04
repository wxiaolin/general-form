package com.haibao.model.enums;

/**
 * Created by haibao on 2018/2/3.
 */
public enum ViewField {

    NAME("NAME"),
    STU_NO("STU_NO"),
    SEX("SEX"),
    BIRTHDAY("BIRTHDAY"),
    CENSUS_REGISTER("CENSUS_REGISTER"),
    NATION("NATION"),
    ADDRESS("ADDRESS"),
    MOBILE("MOBILE"),
    POLITICAL_STATUS("POLITICAL_STATUS"),
    REGDATE("REGDATE"),
    STATUS("STATUS"),
    CLASSES("CLASSES"),
    DEPT("DEPT"),
    MAJOR("MAJOR"),
    MINOR_1("MINOR_1"),
    MINOR_2("MINOR_2"),
    GRADE("GRADE"),
    APARTMENT("APARTMENT"),
    ROOM("ROOM");

    private String field;

    public String getField() {
        return field;
    }

    ViewField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return field;
    }
}
