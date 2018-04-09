package com.haibao.dao;

import com.haibao.pojo.entity.Form;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormDao {
    int deleteByPrimaryKey(Integer fid);

    int insert(Form record);

    int insertSelective(Form record);

    Form selectByPrimaryKey(Integer fid);

    List<Form> selectAll();

    int selectCount();

    List<Form> selectLimit(@Param("offset") Integer offset, @Param("rowCount")Integer rowCount);

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKeyWithBLOBs(Form record);

    int updateByPrimaryKey(Form record);
}