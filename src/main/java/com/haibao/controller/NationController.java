package com.haibao.controller;

import com.haibao.model.po.Nation;
import com.haibao.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by haibao on 2018/1/29.
 */
@Controller
public class NationController {

    @Autowired
    private NationService nationService;



}
