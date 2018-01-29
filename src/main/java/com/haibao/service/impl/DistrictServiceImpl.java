package com.haibao.service.impl;

import com.haibao.dao.DistrictDao;
import com.haibao.model.po.District;
import com.haibao.service.DistrictService;
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
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictDao districtDao;

    @Autowired
    private CacheManager cacheManager;

    @PostConstruct
    public void setup() {
        Cache distractCachhe = cacheManager.getCache("districts");
        List<District> districtList = districtDao.selectAll();
        for (District d : districtList) {
            distractCachhe.put(d.getDid(), d);
        }

    }

    @Cacheable(value = "districts")
    public District getDistrict(Integer did) {
        return districtDao.selectByPrimaryKey(did);
    }
}
