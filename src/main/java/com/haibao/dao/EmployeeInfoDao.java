package com.haibao.dao;

import com.haibao.model.po.EmployeeInfo;

public interface EmployeeInfoDao {
    int deleteByPrimaryKey(Integer eid);

    int insert(EmployeeInfo record);

    int insertSelective(EmployeeInfo record);

    EmployeeInfo selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(EmployeeInfo record);

    int updateByPrimaryKey(EmployeeInfo record);
}