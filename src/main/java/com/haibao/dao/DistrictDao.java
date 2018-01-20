package com.haibao.dao;

import com.haibao.model.po.District;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DistrictDao {
    @Delete({
        "delete from t_district",
        "where did = #{did,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer did);

    @Insert({
        "insert into t_district (did, dname, ",
        "drank, belong, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{did,jdbcType=INTEGER}, #{dname,jdbcType=VARCHAR}, ",
        "#{drank,jdbcType=TINYINT}, #{belong,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(District record);

    int insertSelective(District record);

    @Select({
        "select",
        "did, dname, drank, belong, creator, create_time, updater, update_time",
        "from t_district",
        "where did = #{did,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.DistrictDao.BaseResultMap")
    District selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(District record);

    @Update({
        "update t_district",
        "set dname = #{dname,jdbcType=VARCHAR},",
          "drank = #{drank,jdbcType=TINYINT},",
          "belong = #{belong,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where did = #{did,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(District record);
}