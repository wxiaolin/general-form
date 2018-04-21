package com.haibao.dao;

import com.haibao.pojo.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer aid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer aid);

    User selectByCriteria(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}