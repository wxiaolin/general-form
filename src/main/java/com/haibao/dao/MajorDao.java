package com.haibao.dao;

import com.haibao.model.po.Major;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MajorDao {
    @Delete({
        "delete from t_major",
        "where mid = #{mid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer mid);

    @Insert({
        "insert into t_major (mid, major, ",
        "dept_id, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{mid,jdbcType=INTEGER}, #{major,jdbcType=VARCHAR}, ",
        "#{deptId,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Major record);

    int insertSelective(Major record);

    @Select({
        "select",
        "mid, major, dept_id, creator, create_time, updater, update_time",
        "from t_major",
        "where mid = #{mid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.MajorDao.BaseResultMap")
    Major selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Major record);

    @Update({
        "update t_major",
        "set major = #{major,jdbcType=VARCHAR},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where mid = #{mid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Major record);
}