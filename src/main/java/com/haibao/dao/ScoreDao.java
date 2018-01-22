package com.haibao.dao;

import com.haibao.model.po.Score;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ScoreDao {
    @Delete({
        "delete from t_score",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer sid);

    @Insert({
        "insert into t_score (sid, stu_id, ",
        "ayear, semester, score, ",
        "subject_id, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{sid,jdbcType=INTEGER}, #{stuId,jdbcType=INTEGER}, ",
        "#{ayear,jdbcType=CHAR}, #{semester,jdbcType=TINYINT}, #{score,jdbcType=REAL}, ",
        "#{subjectId,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Score record);

    int insertSelective(Score record);

    @Select({
        "select",
        "sid, stu_id, ayear, semester, score, subject_id, creator, create_time, updater, ",
        "update_time",
        "from t_score",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.ScoreDao.BaseResultMap")
    Score selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Score record);

    @Update({
        "update t_score",
        "set stu_id = #{stuId,jdbcType=INTEGER},",
          "ayear = #{ayear,jdbcType=CHAR},",
          "semester = #{semester,jdbcType=TINYINT},",
          "score = #{score,jdbcType=REAL},",
          "subject_id = #{subjectId,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Score record);
}