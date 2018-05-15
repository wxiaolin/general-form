package com.haibao.business.dao;

import com.haibao.business.domain.entity.Room;

public interface RoomDao {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Room record);

}