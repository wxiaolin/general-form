package com.haibao.dao;

import com.haibao.model.po.Class;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ClassDao {
    @Delete({
        "delete from t_class",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cid);

    @Insert({
        "insert into t_class (cid, dept_id, ",
        "grade, major_id, class_no, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{cid,jdbcType=INTEGER}, #{deptId,jdbcType=INTEGER}, ",
        "#{grade,jdbcType=DATE}, #{majorId,jdbcType=INTEGER}, #{classNo,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Class record);

    int insertSelective(Class record);

    @Select({
        "select",
        "cid, dept_id, grade, major_id, class_no, creator, create_time, updater, update_time",
        "from t_class",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.ClassDao.BaseResultMap")
    Class selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Class record);

    @Update({
        "update t_class",
        "set dept_id = #{deptId,jdbcType=INTEGER},",
          "grade = #{grade,jdbcType=DATE},",
          "major_id = #{majorId,jdbcType=INTEGER},",
          "class_no = #{classNo,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Class record);
}