package com.haibao.service;

import com.haibao.pojo.entity.Account;

/**
 * Created by haibao on 2018/3/25.
 */
public interface LoginService {

    Account doLogin(String userName,String password);
}
