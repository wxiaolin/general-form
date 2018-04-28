package com.haibao.service.impl;

import com.haibao.dao.NationDao;
import com.haibao.domain.entity.Nation;
import com.haibao.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by haibao on 2018/1/29.
 */
@Service
public class NationServiceImpl implements NationService {

    @Autowired
    private NationDao nationDao;

    @Cacheable(value = "nations")
    public Nation getNation(Integer nid) {
        return nationDao.selectByPrimaryKey(nid);
    }
}
