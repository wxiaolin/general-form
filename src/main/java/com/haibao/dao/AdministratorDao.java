package com.haibao.dao;

import com.haibao.model.po.Administrator;

public interface AdministratorDao {
    int deleteByPrimaryKey(Integer aid);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}