package com.haibao.dao;

import com.haibao.model.po.TeacherTitle;

public interface TeacherTitleDao {
    int deleteByPrimaryKey(Integer tid);

    int insert(TeacherTitle record);

    int insertSelective(TeacherTitle record);

    TeacherTitle selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TeacherTitle record);

    int updateByPrimaryKey(TeacherTitle record);
}