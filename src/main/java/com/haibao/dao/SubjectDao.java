package com.haibao.dao;

import com.haibao.model.po.Subject;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SubjectDao {
    @Delete({
        "delete from t_subject",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer sid);

    @Insert({
        "insert into t_subject (sid, ssubject, ",
        "stype1, stype2, ",
        "dept_id, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{sid,jdbcType=INTEGER}, #{ssubject,jdbcType=VARCHAR}, ",
        "#{stype1,jdbcType=TINYINT}, #{stype2,jdbcType=TINYINT}, ",
        "#{deptId,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Subject record);

    int insertSelective(Subject record);

    @Select({
        "select",
        "sid, ssubject, stype1, stype2, dept_id, creator, create_time, updater, update_time",
        "from t_subject",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.SubjectDao.BaseResultMap")
    Subject selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Subject record);

    @Update({
        "update t_subject",
        "set ssubject = #{ssubject,jdbcType=VARCHAR},",
          "stype1 = #{stype1,jdbcType=TINYINT},",
          "stype2 = #{stype2,jdbcType=TINYINT},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Subject record);
}