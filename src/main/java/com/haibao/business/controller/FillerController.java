package com.haibao.business.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.haibao.business.domain.entity.*;
import com.haibao.business.domain.enums.FormField;
import com.haibao.business.domain.enums.PoliticalStatusCode;
import com.haibao.business.domain.enums.ResultCode;
import com.haibao.business.domain.enums.SexCode;
import com.haibao.business.service.*;
import com.haibao.business.domain.vo.Result;
import com.haibao.system.domain.entity.User;
import com.haibao.system.service.UserService;
import com.haibao.utils.StringUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 自动填充表格的Controller
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
    @Autowired
    private UserService userService;


    /**
     * 表格内容自动填充
     * @param request
     * @param names
     * @return
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result filler(HttpServletRequest request, String[] names) throws Exception {
        User user = userService.getUserById(1);
        Logger.getLogger(FillerController.class).debug(user.toString());
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStuNo(user.getUsername());
        studentInfo = studentServcice.getStudentInfo(studentInfo);
        Logger.getRootLogger().debug(studentInfo.toString());
        Map<String, String> map = fill(names, studentInfo);
        // jackson.databind.ObjectMapper，可以把map转换成string方便debug
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        Logger.getRootLogger().debug(json);
        return new Result(true, ResultCode.SUCCESS.code(), ResultCode.SUCCESS.desc(), map);
    }

    /**
     * 填充的方法
     * @param fields
     * @param studentInfo
     * @return
     */
    private Map<String, String> fill(String[] fields, StudentInfo studentInfo) {
        Map<String, String> map = new HashMap<>();
        // 迭代需要填充的字段
        for (String field : fields) {
            if (!StringUtil.isEmpty(field)) {
                Logger.getLogger(FillerController.class).info("nullfield= " + field);
                continue;
            } else {
                // static FormFieldMap，程序启动的时候把枚举的KV加载进去
                FormField ff = FormField.FormFieldMap.get(field);
                if (null != ff) {
                    Logger.getRootLogger().debug("field= " + field);
                    switch (ff) {
                        case NAME:
                            map.put(field, studentInfo.getName());
                            break;
                        case STU_NO:
                            map.put(field, studentInfo.getStuNo());
                            break;
                        case REGDATE:
                            SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
                            map.put(field, pattern.format(studentInfo.getRegdate()));
                            break;
                        case STATUS:
                            map.put(field, studentInfo.getSstatus() + "");
                            break;
                        case DEPT:
                            Dept dept = deptService.getDept(studentInfo.getDeptId());
                            map.put(field, dept.getName());
                            break;
                        case MAJOR:
                            Major major = majorService.getMajor(studentInfo.getMajorId());
                            map.put(field, major.getMajor());
                            break;
                        case MINOR_1:
                            Major minor1 = majorService.getMajor(studentInfo.getMinorId1());
                            map.put(field, minor1.getMajor());
                            break;
                        case MINOR_2:
                            Major minor2 = majorService.getMajor(studentInfo.getMinorId2());
                            map.put(field, minor2.getMajor());
                            break;
                        case GRADE:
                            SimpleDateFormat pattern1 = new SimpleDateFormat("yyyy");
                            map.put(field, pattern1.format(studentInfo.getGrade()));
                            break;
                        case CLASSES:
                            ClassTable classTable = classService.getClassTable(studentInfo.getClassId());
                            Major major1 = majorService.getMajor(classTable.getMajorId());
                            SimpleDateFormat pattern2 = new SimpleDateFormat("yyyy");
                            String grade = pattern2.format(classTable.getGrade());
                            String className = grade + "级" + major1.getMajor() + classTable.getClassNo();
                            map.put(field, className);
                            break;
                        case APARTMENT:
                            ;
                            break;
                        case ROOM:
                            ;
                            break;
                        case SEX:
                            if (SexCode.MALE.code() == studentInfo.getSex()) {
                                map.put(field, SexCode.MALE.desc());
                            } else if (SexCode.FAMALE.code() == studentInfo.getSex()) {
                                map.put(field, SexCode.FAMALE.desc());
                            }
                            break;
                        case BIRTHDAY:
                            SimpleDateFormat pattern3 = new SimpleDateFormat("yyyy-MM");
                            map.put(field, pattern3.format(studentInfo.getBirthday()));
                            break;
                        case CENSUS_REGISTER:
                            District area = districtService.getDistrict(studentInfo.getCrid());
                            District city = districtService.getDistrict(area.getBelong());
                            District prov = districtService.getDistrict(city.getBelong());
                            String cr = prov.getName() + city.getName() + area.getName();
                            map.put(field, cr);
                            break;
                        case NATION:
                            Nation nation = nationService.getNation(studentInfo.getNation());
                            map.put(field, nation.getName());
                            break;
                        case ADDRESS:
                            map.put(field, studentInfo.getAddress());
                            break;
                        case MOBILE:
                            map.put(field, studentInfo.getMobile());
                            break;
                        case POLITICAL_STATUS:
                            for (PoliticalStatusCode politicalStatusCode : PoliticalStatusCode.values()) {
                                if (politicalStatusCode.code() == studentInfo.getPsId()) {
                                    map.put(field, politicalStatusCode.desc());
                                }
                            }
                            break;
                    }
                }
            }
        }
        return map;
    }
}
