package com.haibao.dao;

import com.haibao.pojo.entity.CollegeArea;

public interface CollegeAreaDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CollegeArea record);

    int insertSelective(CollegeArea record);

    CollegeArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollegeArea record);

    int updateByPrimaryKey(CollegeArea record);
}