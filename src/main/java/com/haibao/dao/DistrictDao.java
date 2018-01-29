package com.haibao.dao;

import com.haibao.model.po.District;

public interface DistrictDao {
    int deleteByPrimaryKey(Integer did);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}