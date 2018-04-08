package com.haibao.dao;

import com.haibao.pojo.entity.Account;

public interface AccountDao {
    int deleteByPrimaryKey(Integer aid);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer aid);

    Account selectByCriteria(Account record);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}