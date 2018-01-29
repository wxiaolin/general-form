package com.haibao.controller;

import com.haibao.model.vo.Cell;
import com.haibao.model.vo.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by haibao on 2018/1/27.
 */
@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping(value = {"/form"}, method = RequestMethod.GET)
    public Form getForm() {
        Form form = new Form();
        List<Cell> cells = new LinkedList<Cell>();

        form.setFormName("Form Name");

        for (int i = 0; i < 6; i++) {
            Cell cell1 = new Cell();
            cell1.setWidthh(100.8);
            cell1.setHeightt((double) 32);
            cell1.setFontSize((double) 16);
            cell1.setValuee("key");
            Cell cell2 = new Cell();
            cell2.setWidthh(179.2);
            cell2.setHeightt((double) 32);
            cell2.setFontSize((double) 16);
            cell2.setValuee("value");
            cells.add(cell1);
            cells.add(cell2);
        }
        for (int i = 0; i < 2; i++) {
            Cell cell1 = new Cell();
            cell1.setWidthh(100.8);
            cell1.setHeightt((double) 48);
            cell1.setFontSize((double) 16);
            cell1.setValuee("key");
            Cell cell2 = new Cell();
            cell2.setWidthh(319.2);
            cell2.setHeightt((double) 48);
            cell2.setFontSize((double) 16);
            cell2.setValuee("value");
            cells.add(cell1);
            cells.add(cell2);
        }
        Cell cell1 = new Cell();
        cell1.setWidthh(100.8);
        cell1.setHeightt((double) 48);
        cell1.setFontSize((double) 16);
        cell1.setValuee("key");
        Cell cell2 = new Cell();
        cell2.setWidthh(739.2);
        cell2.setHeightt((double) 48);
        cell2.setFontSize((double) 16);
        cell2.setValuee("value");
        cells.add(cell1);
        cells.add(cell2);

        for (int i = 0; i < 4; i++) {
            Cell cell3 = new Cell();
            cell3.setWidthh(100.8);
            cell3.setHeightt((double) 240);
            cell3.setFontSize((double) 16);
            cell3.setValuee("key");
            Cell cell4 = new Cell();
            cell4.setWidthh(739.2);
            cell4.setHeightt((double) 240);
            cell4.setFontSize((double) 16);
            cell4.setValuee("value");
            cells.add(cell3);
            cells.add(cell4);
        }
        form.setCellList(cells);
        return form;
    }


}
