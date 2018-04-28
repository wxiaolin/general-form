package com.haibao.dao;

import com.haibao.domain.entity.Subject;

public interface SubjectDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}