package com.haibao.dao;

import com.haibao.pojo.entity.Subject;

public interface SubjectDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}