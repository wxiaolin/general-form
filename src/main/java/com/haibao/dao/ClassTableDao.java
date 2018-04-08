package com.haibao.dao;

import com.haibao.pojo.entity.ClassTable;

import java.util.List;

public interface ClassTableDao {
    int deleteByPrimaryKey(Integer cid);

    int insert(ClassTable record);

    int insertSelective(ClassTable record);

    ClassTable selectByPrimaryKey(Integer cid);

    List<ClassTable> selectAll();

    int updateByPrimaryKeySelective(ClassTable record);

    int updateByPrimaryKey(ClassTable record);
}