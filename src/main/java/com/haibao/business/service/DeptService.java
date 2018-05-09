package com.haibao.business.service;

import com.haibao.business.domain.entity.Dept;

/**
 * DeptService
 * Created by haibao on 2018/1/29.
 */
public interface DeptService {

    /**
     * 根据系部id获取系部
     * @param did
     * @return
     */
    Dept getDept(Integer did);

    /**
     * 根据系部名称获取系部
     * @param name
     * @return
     */
    Dept getDeptByName(String name);



}
