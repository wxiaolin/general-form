package com.haibao.dao;

import com.haibao.domain.entity.Glory;

public interface GloryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Glory record);

    int insertSelective(Glory record);

    Glory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Glory record);

    int updateByPrimaryKey(Glory record);
}