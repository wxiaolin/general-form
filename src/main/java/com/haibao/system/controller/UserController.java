package com.haibao.system.controller;

import com.haibao.business.domain.enums.SessionContext;
import com.haibao.business.domain.vo.Result;
import com.haibao.system.domain.entity.User;
import com.haibao.system.domain.enums.ResultCode;
import com.haibao.system.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: caot
 * @Date: 2018/5/8 0008 下午 5:21
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 前往个人账号维护页面
     * @return
     */
    @RequestMapping(value = "editor")
    public ModelAndView goEditor() {
        Logger.getLogger(this.getClass()).debug("进入goEditor()");
        ModelAndView mav = new ModelAndView("userEditor");
        return mav;
    }

    /**
     * 用户自主维护个人信息
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Result doEdit(@RequestBody User user) {
        Logger logger = Logger.getLogger(this.getClass());
        logger.debug("进入doEdit()，"+user.toString());
        if (null != user.getUsername() && null != user.getPassword()) {
            Session session = SecurityUtils.getSubject().getSession();
            User currentUser = (User) session.getAttribute(SessionContext.CURRENT_USER.string());
            user.setId(currentUser.getId());
            userService.editUser(user);
            logger.info("账号信息更新成功，"+user.toString());
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.msg(), null);
        } else {
            logger.info("账号信息更新失败，"+user.toString());
            return new Result(false, ResultCode.ERROR_400.code(), "账号信息更新失败", null);
        }
    }

}
