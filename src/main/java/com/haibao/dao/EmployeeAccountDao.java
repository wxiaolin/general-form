package com.haibao.dao;

import com.haibao.model.po.EmployeeAccount;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmployeeAccountDao {
    @Delete({
        "delete from t_employee_account",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer aid);

    @Insert({
        "insert into t_employee_account (aid, eid, ",
        "account, password, ",
        "astatus, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{aid,jdbcType=INTEGER}, #{eid,jdbcType=INTEGER}, ",
        "#{account,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{astatus,jdbcType=TINYINT}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(EmployeeAccount record);

    int insertSelective(EmployeeAccount record);

    @Select({
        "select",
        "aid, eid, account, password, astatus, creator, create_time, updater, update_time",
        "from t_employee_account",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.EmployeeAccountDao.BaseResultMap")
    EmployeeAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(EmployeeAccount record);

    @Update({
        "update t_employee_account",
        "set eid = #{eid,jdbcType=INTEGER},",
          "account = #{account,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "astatus = #{astatus,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EmployeeAccount record);
}