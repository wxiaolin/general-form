package com.haibao.system.service;

import com.haibao.business.domain.vo.Page;
import com.haibao.system.domain.entity.User;

import java.util.List;

/**
 * UserService
 * @Author: caot
 * @Date: 2018/4/28 0028 下午 1:41
 */
public interface UserService {

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 查询某一页的用户
     * @param pageNum
     * @return
     */
    Page<User> pageList(int pageNum);

    /**
     * 查询具备权限角色的用户
     * @return
     */
    List<User> listUsersHaveRole(int offset, int rowCount);

    /**
     * 更新用户账户信息
     * @param user
     * @return
     */
    int editUser(User user);
}
