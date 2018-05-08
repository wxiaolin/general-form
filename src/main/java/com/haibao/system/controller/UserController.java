package com.haibao.system.controller;

import com.haibao.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    public ModelAndView goEditor(){
        ModelAndView mav = new ModelAndView("userEditor");

        return mav;
    }

}
