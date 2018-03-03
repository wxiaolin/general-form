package com.haibao.controller;

import com.haibao.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by haibao on 2018/1/29.
 */
@Controller
public class DistrictController {

    @Autowired
    private DistrictService districtService;

}
