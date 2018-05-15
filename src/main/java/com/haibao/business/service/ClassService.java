package com.haibao.business.service;

import com.haibao.business.domain.entity.ClassTable;

/**
 * ClassService
 * Created by haibao on 2018/1/29.
 */
public interface ClassService {

    /**
     * 根据班级id获取班级
     * @param cid
     * @return
     */
    ClassTable getClassTable(Integer cid);
}
