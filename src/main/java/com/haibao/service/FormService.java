package com.haibao.service;

import com.haibao.pojo.entity.Form;

import java.util.List;

/**
 * Created by haibao on 2018/1/30.
 */
public interface FormService {

    Integer saveForm(Form form);

    List<Form> listForm();

    Form getForm(Integer fid);

}
