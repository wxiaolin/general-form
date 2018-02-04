package com.haibao.service.impl;

import com.haibao.dao.StudentCollegeInfoDao;
import com.haibao.dao.StudentInfoDao;
import com.haibao.model.po.StudentCollegeInfo;
import com.haibao.model.po.StudentInfo;
import com.haibao.service.StudentServcice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by haibao on 2018/2/3.
 */
@Service
public class StudentServciceImpl implements StudentServcice {

    @Autowired
    private StudentInfoDao studentInfoDao;

    @Autowired
    private StudentCollegeInfoDao studentCollegeInfoDao;

    public StudentInfo getStudentInfo(StudentInfo record) {
        return listStudentInfo(record).get(0);
    }

    public StudentCollegeInfo getStudentCollegeInfo(StudentCollegeInfo record) {
        return listStudentCollegeInfo(record).get(0);
    }

    public List<StudentInfo> listStudentInfo(StudentInfo record) {
        return studentInfoDao.selectByCriteria(record);
    }

    public List<StudentCollegeInfo> listStudentCollegeInfo(StudentCollegeInfo record) {
        return studentCollegeInfoDao.selectByCriteria(record);
    }
}
