package com.haibao.dao;

import com.haibao.model.po.CollegeArea;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CollegeAreaDao {
    @Delete({
        "delete from t_college_area",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer aid);

    @Insert({
        "insert into t_college_area (aid, aname, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{aid,jdbcType=INTEGER}, #{aname,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(CollegeArea record);

    int insertSelective(CollegeArea record);

    @Select({
        "select",
        "aid, aname, creator, create_time, updater, update_time",
        "from t_college_area",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.CollegeAreaDao.BaseResultMap")
    CollegeArea selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(CollegeArea record);

    @Update({
        "update t_college_area",
        "set aname = #{aname,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where aid = #{aid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CollegeArea record);
}