package com.haibao.dao;

import com.haibao.domain.entity.StudentInfo;

import java.util.List;

public interface StudentInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer id);

    List<StudentInfo> selectListByCriteria(StudentInfo record);

    StudentInfo selectByCriteria(StudentInfo record);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}