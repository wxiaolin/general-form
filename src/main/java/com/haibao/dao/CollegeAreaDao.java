package com.haibao.dao;

import com.haibao.model.po.CollegeArea;

public interface CollegeAreaDao {
    int deleteByPrimaryKey(Integer aid);

    int insert(CollegeArea record);

    int insertSelective(CollegeArea record);

    CollegeArea selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(CollegeArea record);

    int updateByPrimaryKey(CollegeArea record);
}