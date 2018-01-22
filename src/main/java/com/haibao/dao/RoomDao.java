package com.haibao.dao;

import com.haibao.model.po.Room;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface RoomDao {
    @Delete({
        "delete from t_room",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer rid);

    @Insert({
        "insert into t_room (rid, rname, ",
        "building_id, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{rid,jdbcType=INTEGER}, #{rname,jdbcType=VARCHAR}, ",
        "#{buildingId,jdbcType=INTEGER}, #{creator,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Room record);

    int insertSelective(Room record);

    @Select({
        "select",
        "rid, rname, building_id, creator, create_time, updater, update_time",
        "from t_room",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    @ResultMap("com.haibao.dao.RoomDao.BaseResultMap")
    Room selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Room record);

    @Update({
        "update t_room",
        "set rname = #{rname,jdbcType=VARCHAR},",
          "building_id = #{buildingId,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Room record);
}