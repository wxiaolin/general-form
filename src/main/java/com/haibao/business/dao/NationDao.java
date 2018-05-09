package com.haibao.business.dao;

import com.haibao.business.domain.entity.Nation;

import java.util.List;

public interface NationDao {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    Nation selectByName(String name);

    List<Nation> selectAll();


    int updateByPrimaryKeySelective(Nation record);

}