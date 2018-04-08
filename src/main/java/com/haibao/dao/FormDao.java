package com.haibao.dao;

import com.haibao.pojo.entity.Form;

import java.util.List;

public interface FormDao {
    int deleteByPrimaryKey(Integer fid);

    int insert(Form record);

    int insertSelective(Form record);

    Form selectByPrimaryKey(Integer fid);

    List<Form> selectAll();

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKeyWithBLOBs(Form record);

    int updateByPrimaryKey(Form record);
}