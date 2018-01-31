package com.haibao.service.impl;

import com.haibao.dao.FormDao;
import com.haibao.model.po.Form;
import com.haibao.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Form getForm(Integer fid) {
        return formDao.selectByPrimaryKey(fid);
    }
}
