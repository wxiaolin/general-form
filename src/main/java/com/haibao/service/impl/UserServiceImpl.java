package com.haibao.service.impl;

import com.haibao.dao.UserDao;
import com.haibao.domain.entity.User;
import com.haibao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: caot
 * @Date: 2018/4/28 0028 下午 1:42
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
