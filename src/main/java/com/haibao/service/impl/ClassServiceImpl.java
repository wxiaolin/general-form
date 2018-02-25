package com.haibao.service.impl;

import com.haibao.dao.ClassTableDao;
import com.haibao.model.po.ClassTable;
import com.haibao.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by haibao on 2018/1/29.
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassTableDao classTableDao;

    @Cacheable(value = "classes")
    public ClassTable getClassTable(Integer cid){
        return classTableDao.selectByPrimaryKey(cid);
    }
}
