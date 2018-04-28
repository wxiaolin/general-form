package com.haibao.dao;

import com.haibao.domain.entity.Classroom;

public interface ClassroomDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    Classroom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);
}