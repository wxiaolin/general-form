package com.haibao.dao;

import com.haibao.model.po.Nation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface NationDao {
    @Delete({
        "delete from t_nation",
        "where nid = #{nid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer nid);

    @Insert({
        "insert into t_nation (nid, nname, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{nid,jdbcType=INTEGER}, #{nname,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Nation record);

    int insertSelective(Nation record);

    @Select({
        "select",
        "nid, nname, creator, create_time, updater, update_time",
        "from t_nation",
        "where nid = #{nid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.NationDao.BaseResultMap")
    Nation selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Nation record);

    @Update({
        "update t_nation",
        "set nname = #{nname,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where nid = #{nid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Nation record);
}