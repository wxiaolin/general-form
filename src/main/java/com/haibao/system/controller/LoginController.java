package com.haibao.system.controller;

import com.haibao.business.domain.enums.ResultCode;
import com.haibao.business.domain.vo.Result;
import com.haibao.system.domain.entity.User;
import com.haibao.system.service.LoginService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录相关的Controller
 * Created on 2018/3/18.
 *
 * @author haibao
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = {"login"}, method = RequestMethod.GET)
    public String goLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Result doLogin(String username, String password, HttpServletRequest request) throws Exception {
        Logger.getLogger(LoginController.class).debug("username = " + username + ", password =" + password);
        // todo: 登录部分封装service
        try {
            UsernamePasswordToken token = new UsernamePasswordToken();
            token.setUsername(username);
//            char[] pwdMd5 = new Md5Hash(password).toString().toCharArray();
//            token.setPassword(pwdMd5);
            token.setPassword(password.toCharArray());
            Subject currentUser = SecurityUtils.getSubject();
            if (!currentUser.isAuthenticated()) {
                currentUser.login(token);
            }
            String user = (String) currentUser.getPrincipal();
            Logger.getLogger(LoginController.class).debug("user = " + user);
            request.getSession().setAttribute("loginUser", user);
        } catch (Exception e) {
            throw e;
        }
        return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), null);
    }
}
