package com.haibao.dao;

import com.haibao.model.po.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DeptDao {
    @Delete({
        "delete from t_dept",
        "where did = #{did,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer did);

    @Insert({
        "insert into t_dept (did, dname, ",
        "belong, ddesc, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{did,jdbcType=INTEGER}, #{dname,jdbcType=VARCHAR}, ",
        "#{belong,jdbcType=INTEGER}, #{ddesc,jdbcType=VARCHAR}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Dept record);

    int insertSelective(Dept record);

    @Select({
        "select",
        "did, dname, belong, ddesc, creator, create_time, updater, update_time",
        "from t_dept",
        "where did = #{did,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.DeptDao.BaseResultMap")
    Dept selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dept record);

    @Update({
        "update t_dept",
        "set dname = #{dname,jdbcType=VARCHAR},",
          "belong = #{belong,jdbcType=INTEGER},",
          "ddesc = #{ddesc,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where did = #{did,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Dept record);
}