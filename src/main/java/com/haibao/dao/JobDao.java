package com.haibao.dao;

import com.haibao.model.po.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface JobDao {
    @Delete({
        "delete from t_job",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer jid);

    @Insert({
        "insert into t_job (jid, jname, ",
        "dept_id, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{jid,jdbcType=INTEGER}, #{jname,jdbcType=VARCHAR}, ",
        "#{deptId,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Job record);

    int insertSelective(Job record);

    @Select({
        "select",
        "jid, jname, dept_id, creator, create_time, updater, update_time",
        "from t_job",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.JobDao.BaseResultMap")
    Job selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(Job record);

    @Update({
        "update t_job",
        "set jname = #{jname,jdbcType=VARCHAR},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Job record);
}