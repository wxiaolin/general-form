package com.haibao.system.service.impl;

import com.haibao.business.dao.StudentInfoDao;
import com.haibao.business.domain.entity.StudentInfo;
import com.haibao.system.dao.UserDao;
import com.haibao.system.domain.enums.SessionContext;
import com.haibao.system.service.LoginService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by haibao on 2018/3/25.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private StudentInfoDao studentInfoDao;

    @Override
    public boolean doLogin(String username, String password) {
        if (username == null && password == null) {
            Logger.getLogger(LoginServiceImpl.class).info("登录失败, username=" + username + ", password=" + password);
            return false;
        }
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(username);
//            char[] pwdMd5 = new Md5Hash(password).toString().toCharArray();
//            token.setPassword(pwdMd5);
        token.setPassword(password.toCharArray());
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            currentUser.login(token);
            StudentInfo studentInfo = studentInfoDao.selectByStuNoDetailed(username);
            Session session = currentUser.getSession();
            session.setAttribute(SessionContext.PERSONAL_DETAILS.string(), studentInfo);
            return true;
        } else {
            return false;
        }
    }
}
