package com.haibao.service;

import com.haibao.model.po.Form;
import org.springframework.stereotype.Service;

/**
 * Created by haibao on 2018/1/30.
 */
public interface FormService {

    Integer saveForm(Form form);

    Form getForm(Integer fid);

}
