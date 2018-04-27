package com.haibao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * todo: 文件待删除
 * Created on 2018/3/18.
 * @author haibao
 */
@Controller
public class PagesController {

    @RequestMapping(value = {"demo", "demo.html"})
    public ModelAndView demo(HttpServletRequest req) {
        return new ModelAndView("demo");
    }

    @RequestMapping(value = {"makerDemo", "makerDemo.html"})
    public String making() {
        return "makerDemo";
    }

//    @RequestMapping(value = {"starter", "starter.html"})
//    public String starter() {
//        return "starter";
//    }

}
