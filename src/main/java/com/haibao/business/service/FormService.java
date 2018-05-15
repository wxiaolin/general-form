package com.haibao.business.service;

import com.haibao.business.domain.entity.Form;
import com.haibao.business.domain.vo.Page;

/**
 * FormService
 * Created by haibao on 2018/1/30.
 */
public interface FormService {

    /**
     * 保存表格
     * @param form
     * @return
     */
    Integer saveForm(Form form);

    /**
     * 更新表格
     * @param form
     * @return
     */
    Integer updateForm(Form form);

    /**
     * 逻辑删除表格
     * @param id
     * @return
     */
    Integer deleteForm(Integer id);

    /**
     * 获取一页表格列表
     * @param pageNum
     * @return
     */
    Page<Form> pageList(Integer pageNum);

    /**
     * 根据Id获取表格
     * @param id
     * @return
     */
    Form getForm(Integer id);

}
