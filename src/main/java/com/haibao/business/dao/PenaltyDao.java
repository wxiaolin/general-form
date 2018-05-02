package com.haibao.business.dao;

import com.haibao.business.domain.entity.Penalty;

public interface PenaltyDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Penalty record);

    int insertSelective(Penalty record);

    Penalty selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Penalty record);

    int updateByPrimaryKey(Penalty record);
}