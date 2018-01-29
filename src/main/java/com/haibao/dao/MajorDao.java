package com.haibao.dao;

import com.haibao.model.po.Major;

public interface MajorDao {
    int deleteByPrimaryKey(Integer mid);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}