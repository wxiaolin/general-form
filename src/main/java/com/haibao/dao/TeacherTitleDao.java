package com.haibao.dao;

import com.haibao.model.po.TeacherTitle;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TeacherTitleDao {
    @Delete({
        "delete from t_teacher_title",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer tid);

    @Insert({
        "insert into t_teacher_title (tid, title, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{tid,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(TeacherTitle record);

    int insertSelective(TeacherTitle record);

    @Select({
        "select",
        "tid, title, creator, create_time, updater, update_time",
        "from t_teacher_title",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.TeacherTitleDao.BaseResultMap")
    TeacherTitle selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TeacherTitle record);

    @Update({
        "update t_teacher_title",
        "set title = #{title,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TeacherTitle record);
}