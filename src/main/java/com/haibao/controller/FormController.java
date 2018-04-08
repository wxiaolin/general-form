package com.haibao.controller;

import com.haibao.pojo.entity.Form;
import com.haibao.service.FormService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created on 2018/3/18.
 * @author haibao
 */
@Controller
@RequestMapping(value = "form")
public class FormController {

    @Autowired
    private FormService formService;

    @RequestMapping(value = {"maker", "maker.html"})
    public String maker() {
        return "maker";
    }

    @RequestMapping(value = {"list", "list.html"})
    public ModelAndView formList(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView("list");
        List<Form> formList = formService.listForm();
        for (Form f : formList) {
            Logger.getRootLogger().debug(f.getCreateTime());
        }
        mav.addObject("formList",formList);
        return mav;
    }
}
