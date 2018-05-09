package com.haibao.business.dao;

import com.haibao.business.domain.entity.Dept;

import java.util.List;

public interface DeptDao {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    List<Dept> selectAll();

    int updateByPrimaryKeySelective(Dept record);

}