package com.haibao.business.service;

import com.haibao.business.domain.entity.Nation;

/**
 * NationService
 * Created by haibao on 2018/1/29.
 */
public interface NationService {
    /**
     * 根据民族id获取民族
     * @param nid
     * @return
     */
    Nation getNation(Integer nid);

    /**
     * 根据民族名称获取民族
     * @param name
     * @return
     */
    Nation getDeptByName(String name);
}
