package com.haibao.dao;

import com.haibao.model.po.TeacherAccount;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TeacherAccountDao {
    @Delete({
        "delete from t_teacher_account",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer aid);

    @Insert({
        "insert into t_teacher_account (aid, tid, ",
        "account, password, ",
        "astatus, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{aid,jdbcType=INTEGER}, #{tid,jdbcType=INTEGER}, ",
        "#{account,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{astatus,jdbcType=TINYINT}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(TeacherAccount record);

    int insertSelective(TeacherAccount record);

    @Select({
        "select",
        "aid, tid, account, password, astatus, creator, create_time, updater, update_time",
        "from t_teacher_account",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.TeacherAccountDao.BaseResultMap")
    TeacherAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(TeacherAccount record);

    @Update({
        "update t_teacher_account",
        "set tid = #{tid,jdbcType=INTEGER},",
          "account = #{account,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "astatus = #{astatus,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TeacherAccount record);
}