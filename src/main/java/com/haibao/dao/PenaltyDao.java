package com.haibao.dao;

import com.haibao.pojo.entity.Penalty;

public interface PenaltyDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Penalty record);

    int insertSelective(Penalty record);

    Penalty selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Penalty record);

    int updateByPrimaryKey(Penalty record);
}