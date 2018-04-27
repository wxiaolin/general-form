package com.haibao.controller;

import com.haibao.pojo.entity.*;
import com.haibao.pojo.enums.PoliticalStatusCode;
import com.haibao.pojo.enums.ResultCode;
import com.haibao.pojo.enums.SexCode;
import com.haibao.pojo.enums.FormField;
import com.haibao.pojo.vo.Result;
import com.haibao.service.*;
import com.haibao.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: caot
 * @Date: 2018/4/27 0027 下午 3:40
 */
@Controller
@RequestMapping(value = "filler")
public class FillerController {
    @Autowired
    private StudentServcice studentServcice;
    @Autowired
    private DeptService deptService;
    @Autowired
    private MajorService majorService;
    @Autowired
    private ClassService classService;
    @Autowired
    private DistrictService districtService;
    @Autowired
    private NationService nationService;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result filler(String[] names) throws Exception {
        Map<String, String> map = fill(names);
        return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), map);

    }

    private Map<String, String> fill(String[] fields){
        Map<String, String> map = new HashMap<>();

//        for (String field : fields) {
//            if (StringUtil.isEmpty(field)) {
//                continue;
//            } else {
//                FormField ff = FormField.valueOf(field);
//                switch (ff) {
//                    case NAME:
//                        cell.setValuee(si.getStuName());
//                        break;
//                    case STU_NO:
//                        cell.setValuee(si.getStuNo());
//                        break;
//                    case REGDATE:
//                        SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
//                        cell.setValuee(pattern.format(si.getRegdate()));
//                        break;
//                    case STATUS:
//                        cell.setValuee(String.valueOf(si.getSstatus()));
//                        break;
//                    case DEPT:
//                        Dept dept = deptService.getDept(si.getDeptId());
//                        cell.setValuee(dept.getName());
//                        break;
//                    case MAJOR:
//                        Major major = majorService.getMajor(si.getMajorId());
//                        cell.setValuee(major.getMajor());
//                        break;
//                    case MINOR_1:
//                        Major minor1 = majorService.getMajor(si.getMinorId1());
//                        cell.setValuee(minor1.getMajor());
//                        break;
//                    case MINOR_2:
//                        Major minor2 = majorService.getMajor(si.getMinorId2());
//                        cell.setValuee(minor2.getMajor());
//                        break;
//                    case GRADE:
//                        SimpleDateFormat pattern1 = new SimpleDateFormat("yyyy");
//                        cell.setValuee(pattern1.format(si.getGrade()));
//                        break;
//                    case CLASSES:
//                        ClassTable classTable = classService.getClassTable(si.getClassId());
//                        Major major1 = majorService.getMajor(classTable.getMajorId());
//                        SimpleDateFormat pattern2 = new SimpleDateFormat("yyyy");
//                        String grade = pattern2.format(classTable.getGrade());
//                        String className = grade + "级" + major1.getMajor() + classTable.getClassNo();
//                        cell.setValuee(className);
//                        break;
//                    case APARTMENT:
//                        ;
//                        break;
//                    case ROOM:
//                        ;
//                        break;
//                    case SEX:
//                        if (SexCode.MALE.getCode() == si.getSex()) {
//                            cell.setValuee("男");
//                        } else if (SexCode.FAMALE.getCode() == si.getSex()) {
//                            cell.setValuee("女");
//                        }
//                        break;
//                    case BIRTHDAY:
//                        SimpleDateFormat pattern3 = new SimpleDateFormat("yyyy-MM");
//                        cell.setValuee(pattern3.format(si.getBirthday()));
//                        break;
//                    case CENSUS_REGISTER:
//                        District area = districtService.getDistrict(si.getCrid());
//                        District city = districtService.getDistrict(area.getBelong());
//                        District prov = districtService.getDistrict(city.getBelong());
//                        cell.setValuee(prov.getName()+city.getName()+area.getName());
//                        break;
//                    case NATION:
//                        Nation nation = nationService.getNation(si.getNation());
//                        cell.setValuee(nation.getName());
//                        break;
//                    case ADDRESS:
//                        cell.setValuee(si.getAddress());
//                        break;
//                    case MOBILE:
//                        cell.setValuee(si.getMobile());
//                        break;
//                    case POLITICAL_STATUS:
//                        for (PoliticalStatusCode politicalStatusCode : PoliticalStatusCode.values()) {
//                            if (politicalStatusCode.getCode() == si.getPsId()) {
//                                cell.setValuee(politicalStatusCode.getDesc());
//                            }
//                        }
//                        break;
//                }
//            }
//        }




        return map;
    }
}
