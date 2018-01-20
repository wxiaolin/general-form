package com.haibao.dao;

import com.haibao.model.po.PoliticalStatus;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PoliticalStatusDao {
    @Delete({
        "delete from t_political_status",
        "where ps_id = #{psId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer psId);

    @Insert({
        "insert into t_political_status (ps_id, ps_name, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{psId,jdbcType=INTEGER}, #{psName,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(PoliticalStatus record);

    int insertSelective(PoliticalStatus record);

    @Select({
        "select",
        "ps_id, ps_name, creator, create_time, updater, update_time",
        "from t_political_status",
        "where ps_id = #{psId,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.PoliticalStatusDao.BaseResultMap")
    PoliticalStatus selectByPrimaryKey(Integer psId);

    int updateByPrimaryKeySelective(PoliticalStatus record);

    @Update({
        "update t_political_status",
        "set ps_name = #{psName,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where ps_id = #{psId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PoliticalStatus record);
}