package com.haibao.service;

import com.haibao.model.po.StudentInfo;

import java.util.List;

/**
 * Created by haibao on 2018/2/3.
 */
public interface StudentServcice {


    StudentInfo getStudentInfo(StudentInfo record);
    List<StudentInfo> listStudentInfo(StudentInfo record);

}
