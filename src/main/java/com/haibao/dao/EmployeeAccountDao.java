package com.haibao.dao;

import com.haibao.model.po.EmployeeAccount;

public interface EmployeeAccountDao {
    int deleteByPrimaryKey(Integer aid);

    int insert(EmployeeAccount record);

    int insertSelective(EmployeeAccount record);

    EmployeeAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(EmployeeAccount record);

    int updateByPrimaryKey(EmployeeAccount record);
}