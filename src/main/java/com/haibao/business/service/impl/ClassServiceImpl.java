package com.haibao.business.service.impl;

import com.haibao.business.dao.ClassTableDao;
import com.haibao.business.domain.entity.ClassTable;
import com.haibao.business.service.ClassService;
import org.apache.log4j.Logger;
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
    public ClassTable getClassTable(Integer cid) {
        Logger.getLogger(this.getClass()).debug("没走缓存");
        return classTableDao.selectByPrimaryKey(cid);
    }
}
