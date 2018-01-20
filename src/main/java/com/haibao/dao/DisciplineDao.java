package com.haibao.dao;

import com.haibao.model.po.Discipline;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DisciplineDao {
    @Delete({
        "delete from t_discipline",
        "where did = #{did,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer did);

    @Insert({
        "insert into t_discipline (did, identity, ",
        "fk_id, dlevel, ddesc, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{did,jdbcType=INTEGER}, #{identity,jdbcType=TINYINT}, ",
        "#{fkId,jdbcType=INTEGER}, #{dlevel,jdbcType=TINYINT}, #{ddesc,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Discipline record);

    int insertSelective(Discipline record);

    @Select({
        "select",
        "did, identity, fk_id, dlevel, ddesc, creator, create_time, updater, update_time",
        "from t_discipline",
        "where did = #{did,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.DisciplineDao.BaseResultMap")
    Discipline selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Discipline record);

    @Update({
        "update t_discipline",
        "set identity = #{identity,jdbcType=TINYINT},",
          "fk_id = #{fkId,jdbcType=INTEGER},",
          "dlevel = #{dlevel,jdbcType=TINYINT},",
          "ddesc = #{ddesc,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where did = #{did,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Discipline record);
}