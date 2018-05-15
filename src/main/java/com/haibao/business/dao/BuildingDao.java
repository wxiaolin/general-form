package com.haibao.business.dao;

import com.haibao.business.domain.entity.Building;

public interface BuildingDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Building record);

}