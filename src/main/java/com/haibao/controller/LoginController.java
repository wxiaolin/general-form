package com.haibao.controller;

import com.haibao.pojo.entity.User;
import com.haibao.pojo.enums.ResultCode;
import com.haibao.pojo.enums.SessionContext;
import com.haibao.pojo.vo.Result;
import com.haibao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 2018/3/18.
 * @author haibao
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = {"login", "login.html"},method = RequestMethod.GET)
    public String goLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Result doLogin(String userName, String password, HttpServletRequest request) {
        User user = loginService.doLogin(userName, password);
        if (user != null) {
            request.getSession().setAttribute(SessionContext.LOGIN_USER.getName(), user);
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), null);
        } else {
            return new Result(false, ResultCode.ERROR_500.code(), ResultCode.ERROR_500.desc(), null);
        }
    }
}
