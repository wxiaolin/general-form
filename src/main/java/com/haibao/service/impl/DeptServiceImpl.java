package com.haibao.service.impl;

import com.haibao.dao.DeptDao;
import com.haibao.domain.entity.Dept;
import com.haibao.service.DeptService;
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
}
