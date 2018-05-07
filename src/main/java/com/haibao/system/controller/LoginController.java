package com.haibao.system.controller;

import com.haibao.system.domain.enums.ResultCode;
import com.haibao.business.domain.vo.Result;
import com.haibao.system.domain.enums.ResultCode;
import com.haibao.system.service.LoginService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录相关的Controller
 * Created on 2018/3/18.
 * @author haibao
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = {"login"}, method = RequestMethod.GET)
    public String goLogin() {
        Logger logger = Logger.getLogger(LoginController.class);
        logger.debug("进入goLogin()");
        return "login";
    }

    /**
     * 登陆操作
     * @param username 用户名
     * @param password
     * @return Result对象的json
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Result doLogin(String username, String password) {
        Logger logger = Logger.getLogger(LoginController.class);
        logger.debug("进入doLogin(), username = " + username + ", password =" + password);
        if (username == null && password == null) {
            logger.info("登录失败, username=" + username + ", password=" + password);
            return new Result(false, ResultCode.ERROR_403.code(), ResultCode.ERROR_403.msg(), null);
        }
        boolean loginResult = loginService.doLogin(username, password);
        if (loginResult){
            logger.info("登录成功, username= " + username);
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.msg(), null);
        } else {
            logger.info("登录失败, username=" + username + ", password=" + password);
            return new Result(false, ResultCode.ERROR_403.code(), ResultCode.ERROR_403.msg(), null);
        }
    }

    /**
     * 登出
     * @return 返回到登陆界面
     */
    @RequestMapping(value = "logout")
    public ModelAndView logout() {
        Logger logger = Logger.getLogger(LoginController.class);
        logger.debug("进入logout()");
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return new ModelAndView("login");
    }
}
