package com.haibao.pojo.po;

import com.haibao.pojo.entity.StudentInfo;
import com.haibao.pojo.entity.User;

/**
 * Created on 2018/4/5.
 *
 * @author haibao
 */
public class LoginUser {
    private User loginUser;
    private StudentInfo userInfo;

    public User getLoginUser() {
        return loginUser;
    }

    public void setLoginAccount(User loginUser) {
        this.loginUser = loginUser;
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
