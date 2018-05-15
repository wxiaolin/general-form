package com.haibao.business.service.impl;

import com.haibao.business.dao.FormDao;
import com.haibao.business.domain.entity.Form;
import com.haibao.business.domain.vo.Page;
import com.haibao.business.service.FormService;
import com.haibao.utils.PageUtils;
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

    @Override
    public Integer saveForm(Form form) {
        return formDao.insertSelective(form);
    }

    @Override
    public Integer updateForm(Form form) {
        return formDao.updateByPrimaryKeySelective(form);
    }

    @Override
    public Integer deleteForm(Integer id) {
        return formDao.deleteByPrimaryKey(id);
    }

    @Override
    public Page<Form> pageList(Integer pageNum) {
        int offset = (pageNum - 1) * 10;
        Page<Form> page = new Page();
        // 查记录总数
        int totalRecord = formDao.selectCount();
//        int pageMax = totalRecord % 10 == 0 ? totalRecord / 10 : totalRecord / 10 + 1;
        int pageMax = PageUtils.getPageMax(totalRecord);
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
