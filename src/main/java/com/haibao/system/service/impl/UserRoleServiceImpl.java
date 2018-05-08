package com.haibao.system.service.impl;

import com.haibao.system.dao.UserRoleDao;
import com.haibao.system.domain.entity.UserRole;
import com.haibao.system.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: caot
 * @Date: 2018/5/7 0007 上午 10:06
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public int add(UserRole userRole) {
        return userRoleDao.insertSelective(userRole);
    }

    @Override
    public int delete(UserRole userRole) {
        return userRoleDao.deleteByPrecise(userRole);
    }
}
