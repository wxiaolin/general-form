package com.haibao.business.service.impl;

import com.haibao.business.dao.MajorDao;
import com.haibao.business.domain.entity.Major;
import com.haibao.business.service.MajorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by haibao on 2018/1/29.
 */
@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorDao majorDao;

    @Cacheable(value = "majors")
    public Major getMajor(Integer mid) {
        return majorDao.selectByPrimaryKey(mid);
    }

    @Cacheable(value = "majors")
    @Override
    public Major getDeptByName(String name) {
        Logger.getLogger(this.getClass()).debug("没走缓存");
        return majorDao.selectByName(name);
    }
}
