package com.haibao.business.dao;

import com.haibao.business.domain.entity.Major;

import java.util.List;

public interface MajorDao {
    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer id);

    Major selectByName(String name);

    List<Major> selectAll();

    int updateByPrimaryKeySelective(Major record);

}