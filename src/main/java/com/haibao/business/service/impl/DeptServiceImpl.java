package com.haibao.business.service.impl;

import com.haibao.business.dao.DeptDao;
import com.haibao.business.domain.entity.Dept;
import com.haibao.business.service.DeptService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by haibao on 2018/1/29.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;


    @Cacheable(value = "depts")
    public Dept getDept(Integer did) {
        return deptDao.selectByPrimaryKey(did);
    }

    @Override
    @Cacheable(value = "depts")
    public Dept getDeptByName(String name) {
        Logger.getLogger(this.getClass()).debug("没走缓存");
        return deptDao.selectByName(name);
    }
}
