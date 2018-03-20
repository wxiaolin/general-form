package com.haibao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by haibao on 2018/3/18.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"index", "index.html"})
    public ModelAndView index(HttpServletRequest req) {
        req.setAttribute("name", "caot");
        return new ModelAndView("index");
    }

    @RequestMapping(value = {"making", "making.html"})
    public String making() {
        return "making";
    }

    @RequestMapping(value = {"starter", "starter.html"})
    public String starter() {
        return "starter";
    }
}
