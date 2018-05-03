package com.haibao.business.service;

import com.haibao.business.domain.entity.StudentInfo;

import java.util.List;

/**
 * StudentServcice
 * Created by haibao on 2018/2/3.
 */
public interface StudentServcice {

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    StudentInfo getStudentInfoById(Integer id);

    /**
     * 根据不同条件获取学生信息
     * @param record
     * @return
     */
    StudentInfo getStudentInfo(StudentInfo record);

    /**
     * 根据不同条件获取学生信息列表
     * @param record
     * @return
     */
    List<StudentInfo> listStudentInfo(StudentInfo record);

}
