package com.haibao.business.dao;

import com.haibao.business.domain.entity.District;

import java.util.List;

public interface DistrictDao {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(District record);

    District selectByPrimaryKey(Integer id);

    List<District> selectAll();

    int updateByPrimaryKeySelective(District record);

}