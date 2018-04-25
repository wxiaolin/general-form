package com.haibao.service.impl;

import com.haibao.dao.FormDao;
import com.haibao.pojo.entity.Form;
import com.haibao.pojo.vo.Page;
import com.haibao.service.FormService;
import com.haibao.utils.PageUtil;
import org.apache.poi.ss.formula.functions.Count;
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
    public Page<Form> pageList(Integer pageNum) {
        int offset = (pageNum - 1) * 10;
        Page<Form> page = new Page();
        // 查记录总数
        int totalRecord = formDao.selectCount();
//        int pageMax = totalRecord % 10 == 0 ? totalRecord / 10 : totalRecord / 10 + 1;
        int pageMax = PageUtil.getPageMax(totalRecord);
        // 分页查询

        List<Form> content = formDao.selectLimit(offset, page.getPageSize());
        page.setCurrentPage(pageNum);
        page.setData(content);
        page.setTotalRecord(totalRecord);
        page.setPageMax(pageMax);
        return page;
    }


    public Form getForm(Integer id) {
        return formDao.selectByPrimaryKey(id);
    }
}
