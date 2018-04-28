package com.haibao.service.impl;

import com.haibao.dao.UserDao;
import com.haibao.domain.entity.User;
import com.haibao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by haibao on 2018/3/25.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserDao userDao;

    @Override
    public User doLogin(String userName, String password) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(password);
        return userDao.selectByCriteria(user);
    }
}
