package com.haibao.dao;

import com.haibao.model.po.StudentInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentInfoDao {
    @Delete({
        "delete from t_student_info",
        "where stu_id = #{stuId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer stuId);

    @Insert({
        "insert into t_student_info (stu_id, stuci_id, ",
        "sex, birthday, crid, ",
        "nation, address, ",
        "mobile, ps_id, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{stuId,jdbcType=INTEGER}, #{stuciId,jdbcType=INTEGER}, ",
        "#{sex,jdbcType=TINYINT}, #{birthday,jdbcType=DATE}, #{crid,jdbcType=INTEGER}, ",
        "#{nation,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=CHAR}, #{psId,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    @Select({
        "select",
        "stu_id, stuci_id, sex, birthday, crid, nation, address, mobile, ps_id, creator, ",
        "create_time, updater, update_time",
        "from t_student_info",
        "where stu_id = #{stuId,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.StudentInfoDao.BaseResultMap")
    StudentInfo selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(StudentInfo record);

    @Update({
        "update t_student_info",
        "set stuci_id = #{stuciId,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=TINYINT},",
          "birthday = #{birthday,jdbcType=DATE},",
          "crid = #{crid,jdbcType=INTEGER},",
          "nation = #{nation,jdbcType=INTEGER},",
          "address = #{address,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=CHAR},",
          "ps_id = #{psId,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where stu_id = #{stuId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StudentInfo record);
}