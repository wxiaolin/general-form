package com.haibao.business.dao;

import com.haibao.business.domain.entity.Form;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Form record);

    int insertSelective(Form record);

    Form selectByPrimaryKey(Integer id);

    int selectCount();

    List<Form> selectLimit(@Param("offset") int offset, @Param("rowCount") int rowCount);

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKey(Form record);
}