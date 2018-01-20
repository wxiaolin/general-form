package com.haibao.dao;

import com.haibao.model.po.Building;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BuildingDao {
    @Delete({
        "delete from t_building",
        "where bid = #{bid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer bid);

    @Insert({
        "insert into t_building (bid, bname, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{bid,jdbcType=INTEGER}, #{bname,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Building record);

    int insertSelective(Building record);

    @Select({
        "select",
        "bid, bname, creator, create_time, updater, update_time",
        "from t_building",
        "where bid = #{bid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.BuildingDao.BaseResultMap")
    Building selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Building record);

    @Update({
        "update t_building",
        "set bname = #{bname,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where bid = #{bid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Building record);
}