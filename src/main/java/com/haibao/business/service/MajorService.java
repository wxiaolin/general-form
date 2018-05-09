package com.haibao.business.service;

import com.haibao.business.domain.entity.Major;

/**
 * MajorService
 * Created by haibao on 2018/1/29.
 */
public interface MajorService {

    /**
     * 根据专业Id获取专业
     * @param mid
     * @return
     */
    Major getMajor(Integer mid);
    /**
     * 根据专业名称获取专业
     * @param name
     * @return
     */
    Major getDeptByName(String name);
}
