package com.haibao.service.impl;

import com.haibao.dao.DeptDao;
import com.haibao.model.po.Dept;
import com.haibao.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
