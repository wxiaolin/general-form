package com.haibao.dao;

import com.haibao.pojo.entity.StudentInfo;

import java.util.List;

public interface StudentInfoDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer sid);

    List<StudentInfo> selectByCriteria(StudentInfo record);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}