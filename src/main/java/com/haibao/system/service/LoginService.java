package com.haibao.system.service;

import com.haibao.system.domain.entity.User;

/**
 * Created by haibao on 2018/3/25.
 */
public interface LoginService {

    User doLogin(String userName, String password);
}
