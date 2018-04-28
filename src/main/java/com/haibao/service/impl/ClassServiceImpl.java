package com.haibao.service.impl;

import com.haibao.dao.ClassTableDao;
import com.haibao.domain.entity.ClassTable;
import com.haibao.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

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
