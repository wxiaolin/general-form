package com.haibao.dao;

import com.haibao.model.po.TeacherInfo;

public interface TeacherInfoDao {
    int deleteByPrimaryKey(Integer tid);

    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    TeacherInfo selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TeacherInfo record);

    int updateByPrimaryKey(TeacherInfo record);
}