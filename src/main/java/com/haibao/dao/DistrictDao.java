package com.haibao.dao;

import com.haibao.pojo.entity.District;

import java.util.List;

public interface DistrictDao {
    int deleteByPrimaryKey(Integer did);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer did);

    List<District> selectAll();

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}