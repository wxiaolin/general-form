package com.haibao.service.impl;

import com.haibao.dao.StudentInfoDao;
import com.haibao.model.po.StudentInfo;
import com.haibao.service.StudentServcice;
import com.sun.org.apache.bcel.internal.generic.RET;
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

    public StudentInfo getStudentInfo(StudentInfo record) {
        List<StudentInfo> siList = listStudentInfo(record);
        if (siList.size()==1) {
            return siList.get(0);
        } else {
            return null;
        }
    }

    public List<StudentInfo> listStudentInfo(StudentInfo record) {
        return studentInfoDao.selectByCriteria(record);
    }

}
