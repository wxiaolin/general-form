package com.haibao.dao;

import com.haibao.model.po.Nation;

import java.util.List;

public interface NationDao {
    int deleteByPrimaryKey(Integer nid);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer nid);

    List<Nation> selectAll();

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
}