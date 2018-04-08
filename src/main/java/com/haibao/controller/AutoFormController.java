package com.haibao.controller;

import com.haibao.pojo.enums.PoliticalStatusCode;
import com.haibao.pojo.enums.ResultCode;
import com.haibao.pojo.enums.SexCode;
import com.haibao.pojo.enums.ViewField;
import com.haibao.pojo.entity.*;
import com.haibao.pojo.vo.Cell;
import com.haibao.pojo.vo.FormVO;
import com.haibao.pojo.vo.Result;
import com.haibao.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by haibao on 2018/1/29.
 */
@Controller
public class AutoFormController {
    @Autowired
    private FormService formService;
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

    @ResponseBody
    @RequestMapping(value = "/autofill", method = RequestMethod.POST)
    public Result autofill(Integer fid, String stuno) throws IOException, ClassNotFoundException {

        Form form = formService.getForm(fid);
        System.out.println(fid + " " + stuno);

        ByteArrayInputStream bais = new ByteArrayInputStream(form.getFdefine());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FormVO formVO = (FormVO) ois.readObject();
        List<Cell> cells = formVO.getCellList();

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStuNo(stuno);
        studentInfo = studentServcice.getStudentInfo(studentInfo);

        fillCell(cells, studentInfo);

        return new Result(true, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDesc(), formVO);
    }


    /**
     * 对List<Cell>的cells作填充内容值的操作
     * @param cells
     * @param si
     */
    private void fillCell(List<Cell> cells, StudentInfo si) {
        // 遍历单元格列表
        for (Cell cell : cells) {
            if (null == cell.getKeyy() || "".equals(cell.getKeyy())) {
                // 判空
                continue;
            } else {
                ViewField vf = ViewField.valueOf(cell.getKeyy());
                switch (vf) {
                    case NAME:
                        cell.setValuee(si.getStuName());
                        break;
                    case STU_NO:
                        cell.setValuee(si.getStuNo());
                        break;
                    case REGDATE:
                        SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
                        cell.setValuee(pattern.format(si.getRegdate()));
                        break;
                    case STATUS:
                        cell.setValuee(String.valueOf(si.getSstatus()));
                        break;
                    case DEPT:
                        Dept dept = deptService.getDept(si.getDeptId());
                        cell.setValuee(dept.getDname());
                        break;
                    case MAJOR:
                        Major major = majorService.getMajor(si.getMajorId());
                        cell.setValuee(major.getMajor());
                        break;
                    case MINOR_1:
                        Major minor1 = majorService.getMajor(si.getMinorId1());
                        cell.setValuee(minor1.getMajor());
                        break;
                    case MINOR_2:
                        Major minor2 = majorService.getMajor(si.getMinorId2());
                        cell.setValuee(minor2.getMajor());
                        break;
                    case GRADE:
                        SimpleDateFormat pattern1 = new SimpleDateFormat("yyyy");
                        cell.setValuee(pattern1.format(si.getGrade()));
                        break;
                    case CLASSES:
                        ClassTable classTable = classService.getClassTable(si.getClassId());
                        Major major1 = majorService.getMajor(classTable.getMajorId());
                        SimpleDateFormat pattern2 = new SimpleDateFormat("yyyy");
                        String grade = pattern2.format(classTable.getGrade());
                        String className = grade + "级" + major1.getMajor() + classTable.getClassNo();
                        cell.setValuee(className);
                        break;
                    case APARTMENT:
                        ;
                        break;
                    case ROOM:
                        ;
                        break;
                    case SEX:
                        if (SexCode.MALE.getCode() == si.getSex()) {
                            cell.setValuee("男");
                        } else if (SexCode.FAMALE.getCode() == si.getSex()) {
                            cell.setValuee("女");
                        }
                        break;
                    case BIRTHDAY:
                        SimpleDateFormat pattern3 = new SimpleDateFormat("yyyy-MM");
                        cell.setValuee(pattern3.format(si.getBirthday()));
                        break;
                    case CENSUS_REGISTER:
                        District area = districtService.getDistrict(si.getCrid());
                        District city = districtService.getDistrict(area.getBelong());
                        District prov = districtService.getDistrict(city.getBelong());
                        cell.setValuee(prov.getDname()+city.getDname()+area.getDname());
                        break;
                    case NATION:
                        Nation nation = nationService.getNation(si.getNation());
                        cell.setValuee(nation.getNname());
                        break;
                    case ADDRESS:
                        cell.setValuee(si.getAddress());
                        break;
                    case MOBILE:
                        cell.setValuee(si.getMobile());
                        break;
                    case POLITICAL_STATUS:
                        for (PoliticalStatusCode politicalStatusCode : PoliticalStatusCode.values()) {
                            if (politicalStatusCode.getCode() == si.getPsId()) {
                                cell.setValuee(politicalStatusCode.getDesc());
                            }
                        }
                        break;
                }
            }
        }
    }
}
