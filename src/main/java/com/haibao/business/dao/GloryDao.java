package com.haibao.business.dao;

import com.haibao.business.domain.entity.Glory;

public interface GloryDao {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(Glory record);

    Glory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Glory record);

}