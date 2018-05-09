package com.haibao.business.dao;

import com.haibao.business.domain.entity.Classroom;

public interface ClassroomDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Classroom record);

    Classroom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classroom record);

}