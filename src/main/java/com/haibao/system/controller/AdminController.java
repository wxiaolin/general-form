package com.haibao.system.controller;

import com.haibao.business.domain.vo.Page;
import com.haibao.business.domain.vo.Result;
import com.haibao.system.domain.entity.User;
import com.haibao.system.domain.entity.UserRole;
import com.haibao.system.domain.enums.ResultCode;
import com.haibao.system.service.UserRoleService;
import com.haibao.system.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 管理员相关操作的controller
 * Created on 2018/3/18.
 *
 * @author haibao
 */
@RequestMapping(value = "admin")
@Controller
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRoleService userRoleService;

    /**
     * 更改帐号状态和改密码
     *
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "user", method = RequestMethod.PUT)
    public Result editUser(@RequestBody User user) {
        Logger logger = Logger.getLogger(AdminController.class);
        logger.debug("进入editUser(), " + user.toString());
        if (user.getId() == null) {
            logger.info("user.id == null");
            return new Result(false, ResultCode.ERROR_400.code(), ResultCode.ERROR_400.msg(), null);
        }
        // 改状态
        if (null != user.getAstatus()) {
            userService.editUser(user);
            logger.info("帐号更新成功，" + user.toString());
            return new Result(true, ResultCode.SUCCESS.code(), "帐号更新成功", null);
        }
        return new Result(false, ResultCode.ERROR_500.code(), ResultCode.ERROR_500.msg(), null);
    }

    /**
     * 重置密码
     *
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "user", params = "resetpw", method = RequestMethod.PUT)
    public Result resetPw(@RequestBody User user) {
        Logger logger = Logger.getLogger(AdminController.class);
        logger.debug("进入resetPw(), " + user.toString());
        if (user.getId() == null) {
            logger.info("user.id == null");
            return new Result(false, ResultCode.ERROR_400.code(), ResultCode.ERROR_400.msg(), null);
        }
        userService.resetPw(user);
        logger.info("重置密码成功，" + user.toString());
        return new Result(true, ResultCode.SUCCESS.code(), "重置密码成功", null);
    }

    /**
     * 查看用户
     *
     * @param page
     * @return
     */
    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    public ModelAndView goUserList(String str, Integer page, Boolean authc) {
        ModelAndView mav = new ModelAndView("user");
        Page<User> pageObj = null;
        if (null == page || 0 > page) {
            page = 1;
        }
        if (null != authc && true == authc) {
            pageObj = userService.pageUsersHaveRole(page);
        } else if (null == str) {
            pageObj = userService.pageUserList(page);
        } else {
            pageObj = userService.pageUserListSearch(str, page);
        }
        List<User> userList = pageObj.getData();
        mav.addObject("userList", userList);
        mav.addObject("pageObj", pageObj);
        return mav;
    }


    /**
     * 角色授权
     *
     * @param userRole
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "user/role", method = RequestMethod.POST)
    public Result addAuthc(@RequestBody UserRole userRole) {
        Logger logger = Logger.getLogger(AdminController.class);
        logger.debug("进入addAuthc(), " + userRole.toString());
        if (null != userRole.getUserId() && null != userRole.getRoleId()) {
            userRoleService.add(userRole);
            logger.info("帐号授权成功，" + userRole.toString());
            return new Result(true, ResultCode.SUCCESS.code(), "帐号授权成功", null);
        } else {
            return new Result(false, ResultCode.ERROR_400.code(), ResultCode.ERROR_400.msg(), null);
        }
    }

    /**
     * 取消角色授权
     *
     * @param userRole
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "user/role", method = RequestMethod.DELETE)
    public Result deleteAuthc(@RequestBody UserRole userRole, HttpServletRequest req) {
        Logger logger = Logger.getLogger(AdminController.class);
        logger.debug("进入deleteAuthc(), " + userRole.toString());
        if (null != userRole.getRoleId() && null != userRole.getUserId()) {
            userRoleService.delete(userRole);
            logger.info("取消授权成功，" + userRole.toString());
            return new Result(true, ResultCode.SUCCESS.code(), "取消授权成功", null);
        } else {
            return new Result(false, ResultCode.ERROR_400.code(), ResultCode.ERROR_400.msg(), null);
        }
    }
}
