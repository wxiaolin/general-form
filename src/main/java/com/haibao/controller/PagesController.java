package com.haibao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 2018/3/18.
 * @author haibao
 */
@Controller
public class PagesController {

    @RequestMapping(value = {"demo", "demo.html"})
    public ModelAndView index(HttpServletRequest req) {
        return new ModelAndView("demo");
    }

    @RequestMapping(value = {"makerDemo", "makerDemo.html"})
    public String making() {
        return "making";
    }

    @RequestMapping(value = {"starter", "starter.html"})
    public String starter() {
        return "starter";
    }

}
