package com.haibao.pojo.enums;

/**
 * Created by haibao on 2018/2/3.
 */
public enum FormField {

    NAME("姓名"),
    STU_NO("学号"),
    SEX("性别"),
    BIRTHDAY("出生年月"),
    CENSUS_REGISTER("籍贯"),
    NATION("民族"),
    ADDRESS("家庭地址"),
    MOBILE("联系方式"),
    POLITICAL_STATUS("政治面貌"),
    REGDATE("注册时间"),
    STATUS("学籍状态"),
    CLASSES("班级"),
    DEPT("系"),
    MAJOR("专业"),
    MINOR_1("副专业1"),
    MINOR_2("副专业2"),
    GRADE("年级"),
    APARTMENT("宿舍楼"),
    ROOM("房间"),
    SCORE("成绩")
    ;

    private String field;

    public String getField() {
        return field;
    }

    FormField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return field;
    }
}
