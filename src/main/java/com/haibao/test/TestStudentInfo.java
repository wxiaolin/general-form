package com.haibao.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.haibao.business.dao.StudentInfoDao;
import com.haibao.business.domain.entity.StudentInfo;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: caot
 * @Date: 2018/5/9 0009 上午 11:14
 */
@ContextConfiguration(locations = {"classpath*:spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
public class TestStudentInfo {

    @Autowired
    private StudentInfoDao studentInfoDao;

    @Test
    public void testSelectByStuNoDetailed() throws JsonProcessingException {
        StudentInfo user = studentInfoDao.selectByStuNoDetailed("2014103040103");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
//        Logger.getLogger(this.getClass()).debug("用户的角色数量"+user.getRoles().size());
        Logger.getLogger(this.getClass()).debug(json);


    }
}
