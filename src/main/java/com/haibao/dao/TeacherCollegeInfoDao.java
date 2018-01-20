package com.haibao.dao;

import com.haibao.model.po.TeacherCollegeInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TeacherCollegeInfoDao {
    @Delete({
        "delete from t_teacher_college_info",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer tid);

    @Insert({
        "insert into t_teacher_college_info (tid, tname, ",
        "tno, entry_date, tstatus, ",
        "dept_id, touter, ",
        "title, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{tid,jdbcType=INTEGER}, #{tname,jdbcType=VARCHAR}, ",
        "#{tno,jdbcType=CHAR}, #{entryDate,jdbcType=DATE}, #{tstatus,jdbcType=TINYINT}, ",
        "#{deptId,jdbcType=INTEGER}, #{touter,jdbcType=TINYINT}, ",
        "#{title,jdbcType=TINYINT}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(TeacherCollegeInfo record);

    int insertSelective(TeacherCollegeInfo record);

    @Select({
        "select",
        "tid, tname, tno, entry_date, tstatus, dept_id, touter, title, creator, create_time, ",
        "updater, update_time",
        "from t_teacher_college_info",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.TeacherCollegeInfoDao.BaseResultMap")
    TeacherCollegeInfo selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TeacherCollegeInfo record);

    @Update({
        "update t_teacher_college_info",
        "set tname = #{tname,jdbcType=VARCHAR},",
          "tno = #{tno,jdbcType=CHAR},",
          "entry_date = #{entryDate,jdbcType=DATE},",
          "tstatus = #{tstatus,jdbcType=TINYINT},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "touter = #{touter,jdbcType=TINYINT},",
          "title = #{title,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TeacherCollegeInfo record);
}