package com.haibao.dao;

import com.haibao.model.po.PoliticalStatus;

public interface PoliticalStatusDao {
    int deleteByPrimaryKey(Integer psId);

    int insert(PoliticalStatus record);

    int insertSelective(PoliticalStatus record);

    PoliticalStatus selectByPrimaryKey(Integer psId);

    int updateByPrimaryKeySelective(PoliticalStatus record);

    int updateByPrimaryKey(PoliticalStatus record);
}