package com.haibao.dao;

import com.haibao.pojo.entity.Score;

public interface ScoreDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}