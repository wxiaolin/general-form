package com.haibao.dao;

import com.haibao.model.po.Glory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface GloryDao {
    @Delete({
        "delete from t_glory",
        "where gid = #{gid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer gid);

    @Insert({
        "insert into t_glory (gid, awardee, ",
        "gname, glevel, gtype, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{gid,jdbcType=INTEGER}, #{awardee,jdbcType=VARCHAR}, ",
        "#{gname,jdbcType=VARCHAR}, #{glevel,jdbcType=TINYINT}, #{gtype,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Glory record);

    int insertSelective(Glory record);

    @Select({
        "select",
        "gid, awardee, gname, glevel, gtype, creator, create_time, updater, update_time",
        "from t_glory",
        "where gid = #{gid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.GloryDao.BaseResultMap")
    Glory selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Glory record);

    @Update({
        "update t_glory",
        "set awardee = #{awardee,jdbcType=VARCHAR},",
          "gname = #{gname,jdbcType=VARCHAR},",
          "glevel = #{glevel,jdbcType=TINYINT},",
          "gtype = #{gtype,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where gid = #{gid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Glory record);
}