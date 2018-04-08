package com.haibao.dao;

import com.haibao.pojo.entity.Glory;

public interface GloryDao {
    int deleteByPrimaryKey(Integer gid);

    int insert(Glory record);

    int insertSelective(Glory record);

    Glory selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Glory record);

    int updateByPrimaryKey(Glory record);
}