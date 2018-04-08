package com.haibao.service.impl;

import com.haibao.dao.MajorDao;
import com.haibao.pojo.entity.Major;
import com.haibao.service.MajorService;
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
}
