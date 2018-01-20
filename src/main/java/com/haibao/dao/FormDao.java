package com.haibao.dao;

import com.haibao.model.po.Form;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FormDao {
    @Delete({
        "delete from t_form",
        "where fid = #{fid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer fid);

    @Insert({
        "insert into t_form (fid, fname, ",
        "fstatus, fdesc, ",
        "dept_id, ftype, creator, ",
        "create_time, updater, ",
        "update_time, fdefine)",
        "values (#{fid,jdbcType=INTEGER}, #{fname,jdbcType=VARCHAR}, ",
        "#{fstatus,jdbcType=TINYINT}, #{fdesc,jdbcType=VARCHAR}, ",
        "#{deptId,jdbcType=INTEGER}, #{ftype,jdbcType=TINYINT}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{fdefine,jdbcType=LONGVARBINARY})"
    })
    int insert(Form record);

    int insertSelective(Form record);

    @Select({
        "select",
        "fid, fname, fstatus, fdesc, dept_id, ftype, creator, create_time, updater, update_time, ",
        "fdefine",
        "from t_form",
        "where fid = #{fid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.FormDao.ResultMapWithBLOBs")
    Form selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Form record);

    @Update({
        "update t_form",
        "set fname = #{fname,jdbcType=VARCHAR},",
          "fstatus = #{fstatus,jdbcType=TINYINT},",
          "fdesc = #{fdesc,jdbcType=VARCHAR},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "ftype = #{ftype,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "fdefine = #{fdefine,jdbcType=LONGVARBINARY}",
        "where fid = #{fid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Form record);

    @Update({
        "update t_form",
        "set fname = #{fname,jdbcType=VARCHAR},",
          "fstatus = #{fstatus,jdbcType=TINYINT},",
          "fdesc = #{fdesc,jdbcType=VARCHAR},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "ftype = #{ftype,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where fid = #{fid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Form record);
}