package com.haibao.service.impl;

import com.haibao.dao.FormDao;
import com.haibao.pojo.entity.Form;
import com.haibao.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by haibao on 2018/1/30.
 */
@Service
public class FormServiceImpl implements FormService {

    @Autowired
    private FormDao formDao;

    public Integer saveForm(Form form) {

        return formDao.insertSelective(form);

    }

    @Override
    public List<Form> listForm() {
        return formDao.selectAll();
    }

    public Form getForm(Integer fid) {
        return formDao.selectByPrimaryKey(fid);
    }
}
