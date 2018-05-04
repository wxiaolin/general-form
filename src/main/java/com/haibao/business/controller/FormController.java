package com.haibao.business.controller;

import com.haibao.exception.ParamsException;
import com.haibao.business.domain.entity.Form;
import com.haibao.business.domain.enums.ResultCode;
import com.haibao.business.domain.vo.Page;
import com.haibao.business.domain.vo.Result;
import com.haibao.business.service.FormService;
import com.haibao.system.domain.enums.ErrorInfo;
import org.apache.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresRoles;
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
 *
 * @author haibao
 */
@Controller
@RequestMapping(value = "form")
public class FormController {
    @Autowired
    private FormService formService;

    /**
     * 前往表格绘制页面
     * @return 表格绘制页面
     */
    @RequestMapping(value = {"maker"})
    public String goMaker() {
        return "maker";
    }

    /**
     * 前往页面编辑某一表格
     * @param id
     * @return 表格绘制（编辑）页面
     */
    @RequestMapping(value = "maker/{id}")
    public ModelAndView goMaker(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("maker");
        Form form = formService.getForm(id);
        mav.addObject("form", form);
        return mav;
    }

    /**
     * 保存表格定义
     * @param form
     * @return 返回处理结果的Result
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Form form) {
        Logger logger = Logger.getLogger(FormController.class);
        logger.debug("save(), " + form.toString());
        form.setCreator(1);
        form.setCreateTime(new Date());
        int r = formService.saveForm(form);
        if (r > 0) {
            logger.info("表格保存成功： " + form.toString());
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), form);
        } else {
            logger.info("表格保存失败： " + form.toString());
            return new Result(false, ResultCode.ERROR_500.code(), ResultCode.ERROR_500.desc(), form);
        }
    }

    /**
     * 根据Id编辑、更新表格
     * @param form 自动绑定的表格对象
     * @return 返回处理结果的Result
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Result edit(@RequestBody Form form) {
        Logger logger = Logger.getLogger(FormController.class);
        logger.debug("edit(), " + form.toString());
        int r = formService.updateForm(form);
        if (r > 0) {
            logger.info("表格更新成功：" + form.toString());
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), form);
        } else {
            logger.info("表格更新失败：" + form.toString());
            return new Result(false, ResultCode.ERROR_500.code(), ResultCode.ERROR_500.desc(), form);
        }
    }

    /**
     * 根据Id对表格执行逻辑删除
     * RequestBody Form form，不直接用Integet id，因为springmvc框架不能很好的处理GET/POST外的请求，所以直接绑定到Form对象上。
     * @param form 表格对象
     * @return 返回处理结果的Result
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE)
    public Result delete(@RequestBody Form form, HttpServletRequest req) {
        Logger logger = Logger.getLogger(FormController.class);
        Integer id = form.getId();
        if (id == null) {
            return new Result(false, ErrorInfo.ERROR_400.code(), ErrorInfo.ERROR_400.msg(), null);
        }
        logger.debug("delete(), id=" + id);
        int r = formService.deleteForm(id);
        if (r > 0) {
            logger.info("表格删除成功：id=" + id);
            return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), null);
        } else {
            logger.info("表格删除失败：id=" + id);
            return new Result(false, ResultCode.ERROR_500.code(), ResultCode.ERROR_500.desc(), null);
        }
    }

    /**
     * 根据Id获取具体表格
     * @param id
     * @return 返回表格页
     * @throws ParamsException
     */
    @ResponseBody
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
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

    /**
     * 获取表格列表
     * @param req
     * @param page
     * @return 返回表格列表页
     */
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
