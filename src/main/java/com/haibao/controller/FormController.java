package com.haibao.controller;

import com.haibao.exception.ParamsException;
import com.haibao.pojo.entity.Form;
import com.haibao.pojo.enums.ErrorInfo;
import com.haibao.pojo.enums.ResultCode;
import com.haibao.pojo.vo.Page;
import com.haibao.pojo.vo.Result;
import com.haibao.service.FormService;
import org.apache.ibatis.type.IntegerTypeHandler;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created on 2018/3/18.
 *
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

    @RequestMapping(value = {"reader", "reader.html"})
    public String reader() {
        return "reader";
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Form form) {
        form.setCreator(1);
        form.setCreateTime(new Date());
        int r = formService.saveForm(form);
        Logger logger = Logger.getRootLogger();
        logger.debug(form.toString());

        if (r > 0) {
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), form);
        } else {
            return new Result(false, ResultCode.ERROR_500.code(), ResultCode.ERROR_500.desc(), form);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView get(@PathVariable Integer id) throws ParamsException {
        Form form = formService.getForm(id);
        ModelAndView mav = null;

        if (form != null) {
            mav = new ModelAndView("form");
            mav.addObject("form", form);
            return mav;
        } else {
//            mav = new ModelAndView("/error/error");
//            Result result = new Result();
//            result.setCode(ResultCode.ERROR_404.code());
//            result.setMsg(ResultCode.ERROR_404.desc());
//            mav.addObject("result", result);
//            return mav;
            throw new ParamsException();
        }
    }

    @RequestMapping(value = {"list", "list.html"}, method = RequestMethod.GET)
    public ModelAndView formPageList(HttpServletRequest req, Integer page) {
        ModelAndView mav = new ModelAndView("list");
        if (null == page) {
            page = 1;
        }
        Page<Form> pageObj = formService.pageList(page);
        List<Form> formList = pageObj.getData();
        mav.addObject("formList", formList);
        mav.addObject("pageObj", pageObj);
        return mav;
    }

}
