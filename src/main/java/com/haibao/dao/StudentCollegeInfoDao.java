package com.haibao.dao;

import com.haibao.model.po.StudentCollegeInfo;

public interface StudentCollegeInfoDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(StudentCollegeInfo record);

    int insertSelective(StudentCollegeInfo record);

    StudentCollegeInfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(StudentCollegeInfo record);

    int updateByPrimaryKey(StudentCollegeInfo record);
}