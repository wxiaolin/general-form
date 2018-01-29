package com.haibao.dao;

import com.haibao.model.po.Form;

public interface FormDao {
    int deleteByPrimaryKey(Integer fid);

    int insert(Form record);

    int insertSelective(Form record);

    Form selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKeyWithBLOBs(Form record);

    int updateByPrimaryKey(Form record);
}