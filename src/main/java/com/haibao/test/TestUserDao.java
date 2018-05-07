package com.haibao.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.haibao.system.dao.UserDao;
import com.haibao.system.domain.entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: caot
 * @Date: 2018/5/7 0007 下午 1:43
 */
@ContextConfiguration(locations = {"classpath*:spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
public class TestUserDao {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSelectByUsernameWithRole() throws JsonProcessingException {
//        List<User> user = userDao.selectByUsernameWithRole("2014103040103");
        User user = userDao.selectByUsernameWithRole("2014103040103");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
//        Logger.getLogger(this.getClass()).debug("用户的角色数量"+user.getRoles().size());
        Logger.getLogger(this.getClass()).debug(json);
    }

    @Test
    public void testSelectUsersHaveRolesLimit() throws JsonProcessingException {
        //        List<User> user = userDao.selectByUsernameWithRole("2014103040103");
        List<User> user = userDao.selectUsersHaveRolesLimit(0, 10);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
//        Logger.getLogger(this.getClass()).debug("用户的角色数量"+user.getRoles().size());
        Logger.getLogger(this.getClass()).debug(json);
    }

    @Test
    public void testSelectLimit() throws JsonProcessingException {
        //        List<User> user = userDao.selectByUsernameWithRole("2014103040103");
        List<User> user = userDao.selectLimit(0, 10);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
//        Logger.getLogger(this.getClass()).debug("用户的角色数量"+user.getRoles().size());
        Logger.getLogger(this.getClass()).debug(json);
    }

}
