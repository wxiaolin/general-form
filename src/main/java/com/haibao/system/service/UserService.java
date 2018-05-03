package com.haibao.system.service;

import com.haibao.system.domain.entity.User;

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

}
