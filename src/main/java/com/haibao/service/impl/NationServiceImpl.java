package com.haibao.service.impl;

import com.haibao.dao.NationDao;
import com.haibao.model.po.ClassTable;
import com.haibao.model.po.Nation;
import com.haibao.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by haibao on 2018/1/29.
 */
@Service
public class NationServiceImpl implements NationService {

    @Autowired
    private NationDao nationDao;

    @Autowired
    private CacheManager cacheManager;

    @PostConstruct
    public void setup() {
        Cache nationCache = cacheManager.getCache("nations");
        List<Nation> nationList = nationDao.selectAll();
        for (Nation n : nationList) {
            nationCache.put(n.getNid(), n);
        }
    }

    @Cacheable(value = "nations")
    public Nation getNation(Integer nid) {
        return nationDao.selectByPrimaryKey(nid);
    }
}
