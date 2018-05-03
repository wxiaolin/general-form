package com.haibao.business.controller;

import com.haibao.exception.ParamsException;
import com.haibao.business.domain.entity.Form;
import com.haibao.business.domain.enums.ResultCode;
import com.haibao.business.domain.vo.Page;
import com.haibao.business.domain.vo.Result;
import com.haibao.business.service.FormService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 表格相关的Controller
 * Created on 2018/3/18.
 * @author haibao
 */
@Controller
@RequestMapping(value = "form")
public class FormController {

    @Autowired
    private FormService formService;

    @RequestMapping(value = {"maker"})
    public String goMaker() {
        return "maker";
    }

    @RequestMapping(value = "maker/{id}")
    public ModelAndView goMaker(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("maker");
        Form form = formService.getForm(id);
        mav.addObject("form", form);
        return mav;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Form form) {
        Logger logger = Logger.getLogger(FormController.class);
        logger.debug("save(), "+form.toString());
        form.setCreator(1);
        form.setCreateTime(new Date());
        int r = formService.saveForm(form);
        if (r > 0) {
            logger.info("表格保存成功： "+ form.toString());
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), form);
        } else {
            logger.info("表格保存失败： "+ form.toString());
            return new Result(false, ResultCode.ERROR_500.code(), ResultCode.ERROR_500.desc(), form);
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Result edit(@RequestBody Form form){
        Logger logger = Logger.getLogger(FormController.class);
        logger.debug("edit(), "+form.toString());
        int r = formService.updateForm(form);
        if (r > 0) {
            logger.info("表格更新成功："+ form.toString());
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), form);
        } else {
            logger.info("表格更新失败："+ form.toString());
            return new Result(false, ResultCode.ERROR_500.code(), ResultCode.ERROR_500.desc(), form);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView get(@PathVariable Integer id) throws ParamsException {
        Form form = formService.getForm(id);
        if (null != form) {
            ModelAndView mav = new ModelAndView("form");
            mav.addObject("form", form);
            return mav;
        } else {
            throw new ParamsException();
        }
    }

    @RequestMapping(value = {"list"}, method = RequestMethod.GET)
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
