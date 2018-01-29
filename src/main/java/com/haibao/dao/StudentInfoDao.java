package com.haibao.dao;

import com.haibao.model.po.StudentInfo;

public interface StudentInfoDao {
    int deleteByPrimaryKey(Integer stuId);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}