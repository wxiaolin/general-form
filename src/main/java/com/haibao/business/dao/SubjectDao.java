package com.haibao.business.dao;

import com.haibao.business.domain.entity.Subject;

public interface SubjectDao {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subject record);

}