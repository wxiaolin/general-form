package com.haibao.business.dao;

import com.haibao.business.domain.entity.ClassTable;

import java.util.List;

public interface ClassTableDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassTable record);

    int insertSelective(ClassTable record);

    ClassTable selectByPrimaryKey(Integer id);

    List<ClassTable> selectAll();

    int updateByPrimaryKeySelective(ClassTable record);

    int updateByPrimaryKey(ClassTable record);
}