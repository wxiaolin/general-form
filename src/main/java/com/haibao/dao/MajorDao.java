package com.haibao.dao;

import com.haibao.pojo.entity.Major;

import java.util.List;

public interface MajorDao {
    int deleteByPrimaryKey(Integer mid);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer mid);

    List<Major> selectAll();

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}