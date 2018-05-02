package com.haibao.business.service;

import com.haibao.business.domain.entity.StudentInfo;

import java.util.List;

/**
 * Created by haibao on 2018/2/3.
 */
public interface StudentServcice {

    StudentInfo getStudentInfoById(Integer id);
    StudentInfo getStudentInfo(StudentInfo record);
    List<StudentInfo> listStudentInfo(StudentInfo record);

}
