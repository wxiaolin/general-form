package com.haibao.system.service;

import com.haibao.system.domain.entity.User;

/**
 * LoginService
 * Created by haibao on 2018/3/25.
 */
public interface LoginService {

    /**
     * 执行登录操作
     * @param userName
     * @param password
     * @return
     */
    boolean doLogin(String userName, String password);
}
