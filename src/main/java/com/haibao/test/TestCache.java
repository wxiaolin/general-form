package com.haibao.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.haibao.business.domain.entity.*;
import com.haibao.business.service.*;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: caot
 * @Date: 2018/5/9 0009 下午 3:51
 */
@ContextConfiguration(locations = {"classpath*:spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
public class TestCache {
    @Autowired
    private ClassService classService;
    @Autowired
    private DeptService deptService;
    @Autowired
    private NationService nationService;
    @Autowired
    private MajorService majorService;
    @Autowired
    private DistrictService districtService;

    @Test
    public void testCache() throws JsonProcessingException {
        ClassTable classTable = classService.getClassTable(1);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(classTable);
//        Logger.getLogger(this.getClass()).debug("用户的角色数量"+user.getRoles().size());
        Logger.getLogger(this.getClass()).debug(json);
    }

    @Test
    public void testCache2() throws JsonProcessingException {
        Dept dept = deptService.getDeptByName("计算机系");
        Nation nation = nationService.getDeptByName("汉族");
        Major major = majorService.getDeptByName("计算机科学与技术");
        District district = districtService.getDeptByName("广东省");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dept);
        String json1 = mapper.writeValueAsString(nation);
        String json2 = mapper.writeValueAsString(major);
        String json3 = mapper.writeValueAsString(district);
//        Logger.getLogger(this.getClass()).debug("用户的角色数量"+user.getRoles().size());
        Logger.getLogger(this.getClass()).debug(json);
        Logger.getLogger(this.getClass()).debug(json1);
        Logger.getLogger(this.getClass()).debug(json2);
        Logger.getLogger(this.getClass()).debug(json3);
    }
}
