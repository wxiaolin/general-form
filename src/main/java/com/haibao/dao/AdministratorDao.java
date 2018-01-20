package com.haibao.dao;

import com.haibao.model.po.Administrator;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AdministratorDao {
    @Delete({
        "delete from t_administrator",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer aid);

    @Insert({
        "insert into t_administrator (aid, account, ",
        "password, astatus, ",
        "ulevel, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{aid,jdbcType=INTEGER}, #{account,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{astatus,jdbcType=TINYINT}, ",
        "#{ulevel,jdbcType=TINYINT}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Administrator record);

    int insertSelective(Administrator record);

    @Select({
        "select",
        "aid, account, password, astatus, ulevel, creator, create_time, updater, update_time",
        "from t_administrator",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.AdministratorDao.BaseResultMap")
    Administrator selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Administrator record);

    @Update({
        "update t_administrator",
        "set account = #{account,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "astatus = #{astatus,jdbcType=TINYINT},",
          "ulevel = #{ulevel,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Administrator record);
}