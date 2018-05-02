package com.haibao.system.dao;

import com.haibao.system.domain.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByCriteria(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}