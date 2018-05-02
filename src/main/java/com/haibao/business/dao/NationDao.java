package com.haibao.business.dao;

import com.haibao.business.domain.entity.Nation;

import java.util.List;

public interface NationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    List<Nation> selectAll();


    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
}