package com.haibao.dao;

import com.haibao.model.po.EmployeeCollegeInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmployeeCollegeInfoDao {
    @Delete({
        "delete from t_employee_college_info",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer eid);

    @Insert({
        "insert into t_employee_college_info (eid, emp_name, ",
        "emp_no, estatus, dept_id, ",
        "job_id, entry_date, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{eid,jdbcType=INTEGER}, #{empName,jdbcType=VARCHAR}, ",
        "#{empNo,jdbcType=CHAR}, #{estatus,jdbcType=TINYINT}, #{deptId,jdbcType=INTEGER}, ",
        "#{jobId,jdbcType=INTEGER}, #{entryDate,jdbcType=DATE}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(EmployeeCollegeInfo record);

    int insertSelective(EmployeeCollegeInfo record);

    @Select({
        "select",
        "eid, emp_name, emp_no, estatus, dept_id, job_id, entry_date, creator, create_time, ",
        "updater, update_time",
        "from t_employee_college_info",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.EmployeeCollegeInfoDao.BaseResultMap")
    EmployeeCollegeInfo selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(EmployeeCollegeInfo record);

    @Update({
        "update t_employee_college_info",
        "set emp_name = #{empName,jdbcType=VARCHAR},",
          "emp_no = #{empNo,jdbcType=CHAR},",
          "estatus = #{estatus,jdbcType=TINYINT},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "job_id = #{jobId,jdbcType=INTEGER},",
          "entry_date = #{entryDate,jdbcType=DATE},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EmployeeCollegeInfo record);
}