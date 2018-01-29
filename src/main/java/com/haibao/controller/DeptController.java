package com.haibao.controller;

import com.haibao.model.po.Dept;
import com.haibao.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by haibao on 2018/1/29.
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;


}
