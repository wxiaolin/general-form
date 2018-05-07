package com.haibao.system.dao;

import com.haibao.system.domain.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    int selectCount();

    User selectByPrimaryKey(Integer id);

    User selectByCriteria(User record);

    User selectByUsernameWithRole(String username);

//    List<User> selectByUsernameWithRole(String username);

    List<User> selectLimit(@Param("offset") int offset, @Param("rowCount") int rowCount);

    List<User> selectUsersHaveRolesLimit(@Param("offset") int offset, @Param("rowCount") int rowCount);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}