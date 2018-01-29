package com.haibao.dao;

import com.haibao.model.po.StudentAccount;

public interface StudentAccountDao {
    int deleteByPrimaryKey(Integer aid);

    int insert(StudentAccount record);

    int insertSelective(StudentAccount record);

    StudentAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(StudentAccount record);

    int updateByPrimaryKey(StudentAccount record);
}