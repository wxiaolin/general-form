package com.haibao.dao;

import com.haibao.model.po.TeacherAccount;

public interface TeacherAccountDao {
    int deleteByPrimaryKey(Integer aid);

    int insert(TeacherAccount record);

    int insertSelective(TeacherAccount record);

    TeacherAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(TeacherAccount record);

    int updateByPrimaryKey(TeacherAccount record);
}