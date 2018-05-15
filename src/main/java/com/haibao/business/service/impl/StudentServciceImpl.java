package com.haibao.business.service.impl;

import com.haibao.business.dao.StudentInfoDao;
import com.haibao.business.domain.entity.StudentInfo;
import com.haibao.business.service.StudentServcice;
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

    public StudentInfo getStudentInfoById(Integer id) {
        return studentInfoDao.selectByPrimaryKey(id);
    }

    public StudentInfo getStudentInfo(StudentInfo record) {
        return studentInfoDao.selectByCriteria(record);
    }

    public List<StudentInfo> listStudentInfo(StudentInfo record) {
        return studentInfoDao.selectListByCriteria(record);
    }

    @Override
    public StudentInfo getStudentInfoDetailed(String stuNo) {
        return studentInfoDao.selectByStuNoDetailed(stuNo);
    }

}
