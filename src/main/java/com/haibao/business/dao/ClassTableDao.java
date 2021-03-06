package com.haibao.business.dao;

import com.haibao.business.domain.entity.ClassTable;

import java.util.List;

public interface ClassTableDao {
    int insertSelective(ClassTable record);

    ClassTable selectByPrimaryKey(Integer id);

    List<ClassTable> selectAll();

    int updateByPrimaryKeySelective(ClassTable record);

}