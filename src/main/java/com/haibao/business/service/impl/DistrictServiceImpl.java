package com.haibao.business.service.impl;

import com.haibao.business.dao.DistrictDao;
import com.haibao.business.domain.entity.District;
import com.haibao.business.service.DistrictService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by haibao on 2018/1/29.
 */
@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictDao districtDao;


    @Cacheable(value = "districts")
    public District getDistrict(Integer did) {
        return districtDao.selectByPrimaryKey(did);
    }


    @Cacheable(value = "districts")
    @Override
    public District getDeptByName(String name) {
        Logger.getLogger(this.getClass()).debug("没走缓存");
        return districtDao.selectByName(name);
    }
}
