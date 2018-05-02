package com.haibao.business.domain.enums;

import java.util.HashMap;
import java.util.Map;

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
    SCORE("成绩");

    public static Map<String, FormField> FormFieldMap = new HashMap<>();

    static {
        FormField[] ff = FormField.values();
        for (FormField enums : ff) {
            FormFieldMap.put(enums.value(), enums);
        }
    }

    private String value;

    public String value() {
        return value;
    }

    FormField(String value) {

        this.value = value;
    }
}
