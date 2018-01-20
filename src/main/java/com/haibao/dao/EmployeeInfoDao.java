package com.haibao.dao;

import com.haibao.model.po.EmployeeInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmployeeInfoDao {
    @Delete({
        "delete from t_employee_info",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer eid);

    @Insert({
        "insert into t_employee_info (eid, eci_id, ",
        "sex, birthday, crid, ",
        "nation, address, ",
        "mobile, ps_id, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{eid,jdbcType=INTEGER}, #{eciId,jdbcType=INTEGER}, ",
        "#{sex,jdbcType=TINYINT}, #{birthday,jdbcType=DATE}, #{crid,jdbcType=INTEGER}, ",
        "#{nation,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=CHAR}, #{psId,jdbcType=TINYINT}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(EmployeeInfo record);

    int insertSelective(EmployeeInfo record);

    @Select({
        "select",
        "eid, eci_id, sex, birthday, crid, nation, address, mobile, ps_id, creator, create_time, ",
        "updater, update_time",
        "from t_employee_info",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.EmployeeInfoDao.BaseResultMap")
    EmployeeInfo selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(EmployeeInfo record);

    @Update({
        "update t_employee_info",
        "set eci_id = #{eciId,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=TINYINT},",
          "birthday = #{birthday,jdbcType=DATE},",
          "crid = #{crid,jdbcType=INTEGER},",
          "nation = #{nation,jdbcType=INTEGER},",
          "address = #{address,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=CHAR},",
          "ps_id = #{psId,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EmployeeInfo record);
}