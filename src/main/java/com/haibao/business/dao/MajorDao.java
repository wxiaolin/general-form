package com.haibao.business.dao;

import com.haibao.business.domain.entity.Major;

import java.util.List;

public interface MajorDao {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer id);

    List<Major> selectAll();


    int updateByPrimaryKeySelective(Major record);

}