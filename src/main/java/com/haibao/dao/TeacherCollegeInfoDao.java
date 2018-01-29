package com.haibao.dao;

import com.haibao.model.po.TeacherCollegeInfo;

public interface TeacherCollegeInfoDao {
    int deleteByPrimaryKey(Integer tid);

    int insert(TeacherCollegeInfo record);

    int insertSelective(TeacherCollegeInfo record);

    TeacherCollegeInfo selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TeacherCollegeInfo record);

    int updateByPrimaryKey(TeacherCollegeInfo record);
}