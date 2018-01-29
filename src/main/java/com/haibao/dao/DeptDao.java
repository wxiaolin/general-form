package com.haibao.dao;

import com.haibao.model.po.Dept;

public interface DeptDao {
    int deleteByPrimaryKey(Integer did);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}