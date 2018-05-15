package com.haibao.business.service.impl;

import com.haibao.business.dao.NationDao;
import com.haibao.business.domain.entity.Nation;
import com.haibao.business.service.NationService;
import org.apache.log4j.Logger;
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

    @Cacheable(value = "nations")
    @Override
    public Nation getDeptByName(String name) {
        Logger.getLogger(this.getClass()).debug("没走缓存");
        return nationDao.selectByName(name);
    }
}
