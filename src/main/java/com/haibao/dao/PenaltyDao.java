package com.haibao.dao;

import com.haibao.model.po.Penalty;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PenaltyDao {
    @Delete({
        "delete from t_penalty",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pid);

    @Insert({
        "insert into t_penalty (pid, identity, ",
        "fk_id, plevel, pdesc, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{pid,jdbcType=INTEGER}, #{identity,jdbcType=TINYINT}, ",
        "#{fkId,jdbcType=INTEGER}, #{plevel,jdbcType=TINYINT}, #{pdesc,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Penalty record);

    int insertSelective(Penalty record);

    @Select({
        "select",
        "pid, identity, fk_id, plevel, pdesc, creator, create_time, updater, update_time",
        "from t_penalty",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.PenaltyDao.BaseResultMap")
    Penalty selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Penalty record);

    @Update({
        "update t_penalty",
        "set identity = #{identity,jdbcType=TINYINT},",
          "fk_id = #{fkId,jdbcType=INTEGER},",
          "plevel = #{plevel,jdbcType=TINYINT},",
          "pdesc = #{pdesc,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Penalty record);
}