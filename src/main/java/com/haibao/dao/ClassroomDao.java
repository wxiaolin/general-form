package com.haibao.dao;

import com.haibao.model.po.Classroom;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ClassroomDao {
    @Delete({
        "delete from t_classroom",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cid);

    @Insert({
        "insert into t_classroom (cid, cname, ",
        "belong, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{cid,jdbcType=INTEGER}, #{cname,jdbcType=VARCHAR}, ",
        "#{belong,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Classroom record);

    int insertSelective(Classroom record);

    @Select({
        "select",
        "cid, cname, belong, creator, create_time, updater, update_time",
        "from t_classroom",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.ClassroomDao.BaseResultMap")
    Classroom selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Classroom record);

    @Update({
        "update t_classroom",
        "set cname = #{cname,jdbcType=VARCHAR},",
          "belong = #{belong,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Classroom record);
}