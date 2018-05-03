package com.haibao.business.service;

import com.haibao.business.domain.entity.District;

/**
 * DistrictService
 * Created by haibao on 2018/3/3.
 */
public interface DistrictService {
    /**
     * 根据行政区id获取行政区
     * @param did
     * @return
     */
    District getDistrict(Integer did);
}
