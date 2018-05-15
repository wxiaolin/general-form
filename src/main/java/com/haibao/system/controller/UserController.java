package com.haibao.system.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.haibao.system.domain.enums.SessionContext;
import com.haibao.business.domain.vo.Result;
import com.haibao.system.domain.entity.User;
import com.haibao.system.domain.enums.ResultCode;
import com.haibao.system.service.UserService;
import com.haibao.utils.StringUtils;
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

import java.util.Map;

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
     * 前往个人信息页面
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView goUserInfo() {
        Logger.getLogger(this.getClass()).debug("进入goUserInfo()");
        ModelAndView mav = new ModelAndView("userInfo");
        return mav;
    }

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
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Result doEdit(@RequestBody Map<String, String> map) throws JsonProcessingException {
        Logger logger = Logger.getLogger(this.getClass());
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        logger.debug("进入doEdit()，"+json);
        Session session = SecurityUtils.getSubject().getSession();
        User currentUser = (User) session.getAttribute(SessionContext.CURRENT_USER.string());
        String oldPw = map.get("oldPw");
        if (!oldPw.equals(currentUser.getPassword())){
            return new Result(true, ResultCode.ERROR_400.code(), "原密码错误", null);
        }
        String newPw = map.get("newPw");
        if (!StringUtils.isEmpty(newPw) && 7 < newPw.length()) {
            currentUser.setPassword(newPw);
            userService.editUser(currentUser);
            logger.info("账号信息更新成功，"+currentUser.toString());
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.msg(), null);
        } else {
            logger.info("账号信息更新失败，"+currentUser);
            return new Result(false, ResultCode.ERROR_400.code(), "账号信息更新失败", null);
        }
    }

}
