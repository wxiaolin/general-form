package com.haibao.pojo.po;

import com.haibao.pojo.entity.Account;
import com.haibao.pojo.entity.StudentInfo;

/**
 * Created on 2018/4/5.
 *
 * @author haibao
 */
public class LoginUser {
    private Account loginAccount;
    private StudentInfo userInfo;

    public Account getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(Account loginAccount) {
        this.loginAccount = loginAccount;
    }

    public StudentInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(StudentInfo userInfo) {
        this.userInfo = userInfo;
    }

    public LoginUser() {

    }
}
