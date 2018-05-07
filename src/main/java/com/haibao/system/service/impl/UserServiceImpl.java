package com.haibao.system.service.impl;

import com.haibao.business.domain.vo.Page;
import com.haibao.system.dao.UserDao;
import com.haibao.system.domain.entity.User;
import com.haibao.system.service.UserService;
import com.haibao.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: caot
 * @Date: 2018/4/28 0028 下午 1:42
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public Page<User> pageList(int pageNum) {
        int offset = (pageNum - 1) * 10;
        Page<User> page = new Page();
        // 查记录总数
        int totalRecord = userDao.selectCount();
//        int pageMax = totalRecord % 10 == 0 ? totalRecord / 10 : totalRecord / 10 + 1;
        int pageMax = PageUtils.getPageMax(totalRecord);
        // 分页查询
        List<User> content = userDao.selectLimit(offset, page.getPageSize());
        page.setCurrentPage(pageNum);
        page.setData(content);
        page.setTotalRecord(totalRecord);
        page.setPageMax(pageMax);
        return page;
    }

    @Override
    public List<User> listUsersHaveRole(int offset, int rowCount) {
        return userDao.selectUsersHaveRolesLimit(offset, rowCount);
    }

    @Override
    public int editUser(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }
}
