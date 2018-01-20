package com.haibao.dao;

import com.haibao.model.po.TeacherInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TeacherInfoDao {
    @Delete({
        "delete from t_teacher_info",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer tid);

    @Insert({
        "insert into t_teacher_info (tid, tci_id, ",
        "sex, birthday, crid, ",
        "nation, address, ",
        "mobile, ps_id, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{tid,jdbcType=INTEGER}, #{tciId,jdbcType=INTEGER}, ",
        "#{sex,jdbcType=TINYINT}, #{birthday,jdbcType=DATE}, #{crid,jdbcType=INTEGER}, ",
        "#{nation,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=CHAR}, #{psId,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    @Select({
        "select",
        "tid, tci_id, sex, birthday, crid, nation, address, mobile, ps_id, creator, create_time, ",
        "updater, update_time",
        "from t_teacher_info",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.TeacherInfoDao.BaseResultMap")
    TeacherInfo selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TeacherInfo record);

    @Update({
        "update t_teacher_info",
        "set tci_id = #{tciId,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=TINYINT},",
          "birthday = #{birthday,jdbcType=DATE},",
          "crid = #{crid,jdbcType=INTEGER},",
          "nation = #{nation,jdbcType=INTEGER},",
          "address = #{address,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=CHAR},",
          "ps_id = #{psId,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where tid = #{tid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TeacherInfo record);
}