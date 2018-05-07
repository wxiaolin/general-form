package com.haibao.system.service;

import com.haibao.system.domain.entity.UserRole;

/**
 * @Author: caot
 * @Date: 2018/5/7 0007 上午 10:06
 */
public interface UserRoleService {

    /**
     * 添加帐号角色授权
     * @param userRole
     * @return
     */
    int add(UserRole userRole);

    /**
     * 取消帐号角色授权
     * @param userRole
     * @return
     */
    int delete(UserRole userRole);
}
