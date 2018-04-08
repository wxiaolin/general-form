package com.haibao.service.impl;

import com.haibao.dao.AccountDao;
import com.haibao.pojo.entity.Account;
import com.haibao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by haibao on 2018/3/25.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public Account doLogin(String userName, String password) {
        Account account = new Account();
        account.setAccount(userName);
        account.setPassword(password);
        return accountDao.selectByCriteria(account);
    }
}
