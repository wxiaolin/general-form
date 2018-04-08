package com.haibao.dao;

import com.haibao.pojo.entity.Classroom;

public interface ClassroomDao {
    int deleteByPrimaryKey(Integer cid);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    Classroom selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);
}