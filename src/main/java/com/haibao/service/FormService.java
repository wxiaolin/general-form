package com.haibao.service;

import com.haibao.domain.entity.Form;
import com.haibao.domain.vo.Page;

/**
 * Created by haibao on 2018/1/30.
 */
public interface FormService {

    Integer saveForm(Form form);

    Page<Form> pageList(Integer pageNum);

    Form getForm(Integer id);

}
