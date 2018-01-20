package com.haibao.dao;

import com.haibao.model.po.StudentAccount;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentAccountDao {
    @Delete({
        "delete from t_student_account",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer aid);

    @Insert({
        "insert into t_student_account (aid, stu_id, ",
        "account, password, ",
        "astatus, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{aid,jdbcType=INTEGER}, #{stuId,jdbcType=INTEGER}, ",
        "#{account,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{astatus,jdbcType=TINYINT}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(StudentAccount record);

    int insertSelective(StudentAccount record);

    @Select({
        "select",
        "aid, stu_id, account, password, astatus, creator, create_time, updater, update_time",
        "from t_student_account",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.StudentAccountDao.BaseResultMap")
    StudentAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(StudentAccount record);

    @Update({
        "update t_student_account",
        "set stu_id = #{stuId,jdbcType=INTEGER},",
          "account = #{account,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "astatus = #{astatus,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StudentAccount record);
}