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
    Page<User> pageUserList(int pageNum);

    /**
     * 模糊查询某一页的用户
     * @param pageNum
     * @return
     */
    Page<User> pageUserListSearch(String str, int pageNum);

    /**
     * 查询具备权限角色的用户
     * @return
     */
    Page<User> pageUsersHaveRole(int pageNum);

    /**
     * 更新用户账户信息
     * @param user
     * @return
     */
    int editUser(User user);

    /**
     * 重置密码
     * @param user
     * @return
     */
    int resetPw(User user);
}
