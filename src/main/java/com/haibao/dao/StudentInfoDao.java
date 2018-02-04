package com.haibao.dao;

import com.haibao.model.po.StudentCollegeInfo;
import com.haibao.model.po.StudentInfo;

import java.util.List;

public interface StudentInfoDao {
    int deleteByPrimaryKey(Integer stuId);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer stuId);

    List<StudentInfo> selectByCriteria(StudentInfo record);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}