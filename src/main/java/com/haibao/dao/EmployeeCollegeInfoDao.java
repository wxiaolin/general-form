package com.haibao.dao;

import com.haibao.model.po.EmployeeCollegeInfo;

public interface EmployeeCollegeInfoDao {
    int deleteByPrimaryKey(Integer eid);

    int insert(EmployeeCollegeInfo record);

    int insertSelective(EmployeeCollegeInfo record);

    EmployeeCollegeInfo selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(EmployeeCollegeInfo record);

    int updateByPrimaryKey(EmployeeCollegeInfo record);
}