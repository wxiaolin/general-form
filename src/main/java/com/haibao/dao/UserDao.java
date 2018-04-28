package com.haibao.dao;

import com.haibao.domain.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByCriteria(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}