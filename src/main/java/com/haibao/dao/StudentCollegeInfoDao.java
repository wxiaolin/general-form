package com.haibao.dao;

import com.haibao.model.po.StudentCollegeInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentCollegeInfoDao {
    @Delete({
        "delete from t_student_college_info",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer sid);

    @Insert({
        "insert into t_student_college_info (sid, stu_name, ",
        "stu_no, regdate, sstatus, ",
        "dept_id, major_id, ",
        "minor_id1, minor_id2, ",
        "grade, class_id, apartment, ",
        "room, creator, create_time, ",
        "updater, update_time)",
        "values (#{sid,jdbcType=INTEGER}, #{stuName,jdbcType=VARCHAR}, ",
        "#{stuNo,jdbcType=CHAR}, #{regdate,jdbcType=DATE}, #{sstatus,jdbcType=TINYINT}, ",
        "#{deptId,jdbcType=INTEGER}, #{majorId,jdbcType=INTEGER}, ",
        "#{minorId1,jdbcType=INTEGER}, #{minorId2,jdbcType=INTEGER}, ",
        "#{grade,jdbcType=DATE}, #{classId,jdbcType=INTEGER}, #{apartment,jdbcType=INTEGER}, ",
        "#{room,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(StudentCollegeInfo record);

    int insertSelective(StudentCollegeInfo record);

    @Select({
        "select",
        "sid, stu_name, stu_no, regdate, sstatus, dept_id, major_id, minor_id1, minor_id2, ",
        "grade, class_id, apartment, room, creator, create_time, updater, update_time",
        "from t_student_college_info",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.StudentCollegeInfoDao.BaseResultMap")
    StudentCollegeInfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(StudentCollegeInfo record);

    @Update({
        "update t_student_college_info",
        "set stu_name = #{stuName,jdbcType=VARCHAR},",
          "stu_no = #{stuNo,jdbcType=CHAR},",
          "regdate = #{regdate,jdbcType=DATE},",
          "sstatus = #{sstatus,jdbcType=TINYINT},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "major_id = #{majorId,jdbcType=INTEGER},",
          "minor_id1 = #{minorId1,jdbcType=INTEGER},",
          "minor_id2 = #{minorId2,jdbcType=INTEGER},",
          "grade = #{grade,jdbcType=DATE},",
          "class_id = #{classId,jdbcType=INTEGER},",
          "apartment = #{apartment,jdbcType=INTEGER},",
          "room = #{room,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where sid = #{sid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StudentCollegeInfo record);
}