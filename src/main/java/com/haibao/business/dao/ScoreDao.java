package com.haibao.business.dao;

import com.haibao.business.domain.entity.Score;

public interface ScoreDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Score record);

}