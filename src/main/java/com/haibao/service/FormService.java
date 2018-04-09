package com.haibao.service;

import com.haibao.pojo.entity.Form;
import com.haibao.pojo.vo.Page;

import java.util.List;

/**
 * Created by haibao on 2018/1/30.
 */
public interface FormService {

    Integer saveForm(Form form);

    Page<Form> pageList(Integer pageNum);

    Form getForm(Integer fid);

}
