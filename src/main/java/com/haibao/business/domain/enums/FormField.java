package com.haibao.business.domain.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 表格字段枚举
 * Created by haibao on 2018/2/3.
 */
public enum FormField {


    NAME("姓名"),
    STU_NO("学号"),
    SEX("性别"),
    BIRTHDAY_yyyyMM("出生年月"),
    BIRTHDAY_yyyyMMdd("出生日期"),
    CENSUS_REGISTER("籍贯"),
    NATION("民族"),
    ADDRESS("家庭地址"),
    MOBILE("联系方式"),
    POLITICAL_STATUS("政治面貌"),
    REGDATE("入学日期"),
    STATUS("学籍状态"),
    CLASS_NAME("班级(名)"),
    CLASS_NO("班级(号)"),
    DEPT("系部"),
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
