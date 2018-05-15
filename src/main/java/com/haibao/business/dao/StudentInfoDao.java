package com.haibao.business.dao;

import com.haibao.business.domain.entity.StudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer id);

    StudentInfo selectByStuNoDetailed(@Param("stuNo") String stuNo);

    List<StudentInfo> selectListByCriteria(StudentInfo record);

    StudentInfo selectByCriteria(StudentInfo record);

    int updateByPrimaryKeySelective(StudentInfo record);
}