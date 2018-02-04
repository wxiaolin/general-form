package com.haibao.dao;

import com.haibao.model.po.StudentCollegeInfo;

import java.util.List;

public interface StudentCollegeInfoDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(StudentCollegeInfo record);

    int insertSelective(StudentCollegeInfo record);

    StudentCollegeInfo selectByPrimaryKey(Integer sid);

    List<StudentCollegeInfo> selectByCriteria(StudentCollegeInfo record);

    int updateByPrimaryKeySelective(StudentCollegeInfo record);

    int updateByPrimaryKey(StudentCollegeInfo record);
}