package com.haibao.business.dao;

import com.haibao.business.domain.entity.Glory;

public interface GloryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Glory record);

    int insertSelective(Glory record);

    Glory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Glory record);

    int updateByPrimaryKey(Glory record);
}