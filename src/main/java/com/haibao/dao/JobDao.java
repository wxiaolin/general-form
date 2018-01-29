package com.haibao.dao;

import com.haibao.model.po.Job;

public interface JobDao {
    int deleteByPrimaryKey(Integer jid);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}