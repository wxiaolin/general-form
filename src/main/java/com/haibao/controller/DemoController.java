package com.haibao.controller;

import com.haibao.model.enums.ResultCode;
import com.haibao.model.po.Form;
import com.haibao.model.vo.Cell;
import com.haibao.model.vo.FormVO;
import com.haibao.model.vo.Result;
import com.haibao.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by haibao on 2018/1/27.
 */
@Controller
public class DemoController {

    @Autowired
    private FormService formService;

    @ResponseBody
    @RequestMapping(value = "/readformdb")
    public Result readFormDB() throws IOException, ClassNotFoundException {
        Form form = formService.getForm(1);
        ByteArrayInputStream bais = new ByteArrayInputStream(form.getFdefine());
        ObjectInputStream ois = new ObjectInputStream(bais);

        FormVO formVO = (FormVO) ois.readObject();

        return new Result(true,ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getDesc(),formVO);
    }


    @ResponseBody
    @RequestMapping(value = "/saveform", method = RequestMethod.POST)
    public Result saveForm() throws IOException {
        FormVO formVO = new FormVO();
        List<Cell> cells = new LinkedList<Cell>();

        formVO.setFormName("FormVO Name");

        Cell cell1 = new Cell();
        cell1.setWidthh(100.8);
        cell1.setHeightt((double) 40);
        cell1.setFontSize((double) 16);
        cell1.setValuee("院系");
        Cell cell2 = new Cell();
        cell2.setWidthh(179.2);
        cell2.setHeightt((double) 40);
        cell2.setFontSize((double) 16);
        cell2.setValuee("");
        cells.add(cell1);
        cells.add(cell2);
        Cell cell3 = new Cell();
        cell3.setWidthh(100.8);
        cell3.setHeightt((double) 40);
        cell3.setFontSize((double) 16);
        cell3.setValuee("专业");
        Cell cell4 = new Cell();
        cell4.setWidthh(179.2);
        cell4.setHeightt((double) 40);
        cell4.setFontSize((double) 16);
        cell4.setValuee("");
        cells.add(cell3);
        cells.add(cell4);
        Cell cell5 = new Cell();
        cell5.setWidthh(100.8);
        cell5.setHeightt((double) 40);
        cell5.setFontSize((double) 16);
        cell5.setValuee("学号");
        Cell cell6 = new Cell();
        cell6.setWidthh(179.2);
        cell6.setHeightt((double) 40);
        cell6.setFontSize((double) 16);
        cell6.setValuee("");
        cells.add(cell5);
        cells.add(cell6);

        Cell cell7 = new Cell();
        cell7.setWidthh(100.8);
        cell7.setHeightt((double) 40);
        cell7.setFontSize((double) 16);
        cell7.setValuee("姓名");
        Cell cell8 = new Cell();
        cell8.setWidthh(179.2);
        cell8.setHeightt((double) 40);
        cell8.setFontSize((double) 16);
        cell8.setValuee("");
        cells.add(cell7);
        cells.add(cell8);
        Cell cell9 = new Cell();
        cell9.setWidthh(100.8);
        cell9.setHeightt((double) 40);
        cell9.setFontSize((double) 16);
        cell9.setValuee("性别");
        Cell cell10 = new Cell();
        cell10.setWidthh(179.2);
        cell10.setHeightt((double) 40);
        cell10.setFontSize((double) 16);
        cell10.setValuee("");
        cells.add(cell9);
        cells.add(cell10);
        Cell cell11 = new Cell();
        cell11.setWidthh(100.8);
        cell11.setHeightt((double) 40);
        cell11.setFontSize((double) 16);
        cell11.setValuee("出生年月");
        Cell cell12 = new Cell();
        cell12.setWidthh(179.2);
        cell12.setHeightt((double) 40);
        cell12.setFontSize((double) 16);
        cell12.setValuee("");
        cells.add(cell11);
        cells.add(cell12);

        Cell cell13 = new Cell();
        cell13.setWidthh(100.8);
        cell13.setHeightt((double) 40);
        cell13.setFontSize((double) 16);
        cell13.setValuee("民族");
        Cell cell14 = new Cell();
        cell14.setWidthh(179.2);
        cell14.setHeightt((double) 40);
        cell14.setFontSize((double) 16);
        cell14.setValuee("");
        cells.add(cell13);
        cells.add(cell14);
        Cell cell15 = new Cell();
        cell15.setWidthh(100.8);
        cell15.setHeightt((double) 40);
        cell15.setFontSize((double) 16);
        cell15.setValuee("籍贯");
        Cell cell16 = new Cell();
        cell16.setWidthh(179.2);
        cell16.setHeightt((double) 40);
        cell16.setFontSize((double) 16);
        cell16.setValuee("");
        cells.add(cell15);
        cells.add(cell16);
        Cell cell17 = new Cell();
        cell17.setWidthh(100.8);
        cell17.setHeightt((double) 40);
        cell17.setFontSize((double) 16);
        cell17.setValuee("政治面貌");
        Cell cell18 = new Cell();
        cell18.setWidthh(179.2);
        cell18.setHeightt((double) 40);
        cell18.setFontSize((double) 16);
        cell18.setValuee("");
        cells.add(cell17);
        cells.add(cell18);


        Cell cell19 = new Cell();
        cell19.setWidthh(100.8);
        cell19.setHeightt((double) 40);
        cell19.setFontSize((double) 16);
        cell19.setValuee("手机号码");
        Cell cell20 = new Cell();
        cell20.setWidthh(179.2);
        cell20.setHeightt((double) 40);
        cell20.setFontSize((double) 16);
        cell20.setValuee("");
        cells.add(cell19);
        cells.add(cell20);
        Cell cell21 = new Cell();
        cell21.setWidthh(100.8);
        cell21.setHeightt((double) 40);
        cell21.setFontSize((double) 16);
        cell21.setValuee("家庭住址");
        Cell cell22 = new Cell();
        cell22.setWidthh(459.2);
        cell22.setHeightt((double) 40);
        cell22.setFontSize((double) 16);
        cell22.setValuee("");
        cells.add(cell21);
        cells.add(cell22);
        for (int i = 0; i < 4; i++) {
            Cell cell = new Cell();
            cell.setWidthh(100.8);
            cell.setHeightt((double) 220);
            cell.setFontSize((double) 16);
            cell.setValuee("key");
            Cell cell23 = new Cell();
            cell23.setWidthh(739.2);
            cell23.setHeightt((double) 220);
            cell23.setFontSize((double) 16);
            cell23.setValuee("");
            cells.add(cell);
            cells.add(cell23);
            formVO.setCellList(cells);
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(formVO);
        byte[] buffer = baos.toByteArray();
        Form form = new Form();
        form.setCreator(1);
        form.setCreateTime(new Date());
        form.setFname("测试表");
        form.setFdefine(buffer);
        form.setFdesc("测试表");

        formService.saveForm(form);

        return new Result(true, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDesc(), null);
    }

    @ResponseBody
    @RequestMapping(value = {"/formdemo2"}, method = RequestMethod.GET)
    public FormVO getFormDemo() {
        FormVO formVO = new FormVO();
        List<Cell> cells = new LinkedList<Cell>();

        formVO.setFormName("FormVO Name");

        Cell cell1 = new Cell();
        cell1.setWidthh(100.8);
        cell1.setHeightt((double) 40);
        cell1.setFontSize((double) 16);
        cell1.setValuee("院系");
        Cell cell2 = new Cell();
        cell2.setWidthh(179.2);
        cell2.setHeightt((double) 40);
        cell2.setFontSize((double) 16);
        cell2.setValuee("");
        cells.add(cell1);
        cells.add(cell2);
        Cell cell3 = new Cell();
        cell3.setWidthh(100.8);
        cell3.setHeightt((double) 40);
        cell3.setFontSize((double) 16);
        cell3.setValuee("专业");
        Cell cell4 = new Cell();
        cell4.setWidthh(179.2);
        cell4.setHeightt((double) 40);
        cell4.setFontSize((double) 16);
        cell4.setValuee("");
        cells.add(cell3);
        cells.add(cell4);
        Cell cell5 = new Cell();
        cell5.setWidthh(100.8);
        cell5.setHeightt((double) 40);
        cell5.setFontSize((double) 16);
        cell5.setValuee("学号");
        Cell cell6 = new Cell();
        cell6.setWidthh(179.2);
        cell6.setHeightt((double) 40);
        cell6.setFontSize((double) 16);
        cell6.setValuee("");
        cells.add(cell5);
        cells.add(cell6);

        Cell cell7 = new Cell();
        cell7.setWidthh(100.8);
        cell7.setHeightt((double) 40);
        cell7.setFontSize((double) 16);
        cell7.setValuee("姓名");
        Cell cell8 = new Cell();
        cell8.setWidthh(179.2);
        cell8.setHeightt((double) 40);
        cell8.setFontSize((double) 16);
        cell8.setValuee("");
        cells.add(cell7);
        cells.add(cell8);
        Cell cell9 = new Cell();
        cell9.setWidthh(100.8);
        cell9.setHeightt((double) 40);
        cell9.setFontSize((double) 16);
        cell9.setValuee("性别");
        Cell cell10 = new Cell();
        cell10.setWidthh(179.2);
        cell10.setHeightt((double) 40);
        cell10.setFontSize((double) 16);
        cell10.setValuee("");
        cells.add(cell9);
        cells.add(cell10);
        Cell cell11 = new Cell();
        cell11.setWidthh(100.8);
        cell11.setHeightt((double) 40);
        cell11.setFontSize((double) 16);
        cell11.setValuee("出生年月");
        Cell cell12 = new Cell();
        cell12.setWidthh(179.2);
        cell12.setHeightt((double) 40);
        cell12.setFontSize((double) 16);
        cell12.setValuee("");
        cells.add(cell11);
        cells.add(cell12);

        Cell cell13 = new Cell();
        cell13.setWidthh(100.8);
        cell13.setHeightt((double) 40);
        cell13.setFontSize((double) 16);
        cell13.setValuee("民族");
        Cell cell14 = new Cell();
        cell14.setWidthh(179.2);
        cell14.setHeightt((double) 40);
        cell14.setFontSize((double) 16);
        cell14.setValuee("");
        cells.add(cell13);
        cells.add(cell14);
        Cell cell15 = new Cell();
        cell15.setWidthh(100.8);
        cell15.setHeightt((double) 40);
        cell15.setFontSize((double) 16);
        cell15.setValuee("籍贯");
        Cell cell16 = new Cell();
        cell16.setWidthh(179.2);
        cell16.setHeightt((double) 40);
        cell16.setFontSize((double) 16);
        cell16.setValuee("");
        cells.add(cell15);
        cells.add(cell16);
        Cell cell17 = new Cell();
        cell17.setWidthh(100.8);
        cell17.setHeightt((double) 40);
        cell17.setFontSize((double) 16);
        cell17.setValuee("政治面貌");
        Cell cell18 = new Cell();
        cell18.setWidthh(179.2);
        cell18.setHeightt((double) 40);
        cell18.setFontSize((double) 16);
        cell18.setValuee("");
        cells.add(cell17);
        cells.add(cell18);


        Cell cell19 = new Cell();
        cell19.setWidthh(100.8);
        cell19.setHeightt((double) 40);
        cell19.setFontSize((double) 16);
        cell19.setValuee("手机号码");
        Cell cell20 = new Cell();
        cell20.setWidthh(179.2);
        cell20.setHeightt((double) 40);
        cell20.setFontSize((double) 16);
        cell20.setValuee("");
        cells.add(cell19);
        cells.add(cell20);
        Cell cell21 = new Cell();
        cell21.setWidthh(100.8);
        cell21.setHeightt((double) 40);
        cell21.setFontSize((double) 16);
        cell21.setValuee("家庭住址");
        Cell cell22 = new Cell();
        cell22.setWidthh(459.2);
        cell22.setHeightt((double) 40);
        cell22.setFontSize((double) 16);
        cell22.setValuee("");
        cells.add(cell21);
        cells.add(cell22);
        for (int i = 0; i < 4; i++) {
            Cell cell = new Cell();
            cell.setWidthh(100.8);
            cell.setHeightt((double) 220);
            cell.setFontSize((double) 16);
            cell.setValuee("key");
            Cell cell23 = new Cell();
            cell23.setWidthh(739.2);
            cell23.setHeightt((double) 220);
            cell23.setFontSize((double) 16);
            cell23.setValuee("");
            cells.add(cell);
            cells.add(cell23);
            formVO.setCellList(cells);
        }
        return formVO;
    }


    @ResponseBody
    @RequestMapping(value = {"/formdemo"}, method = RequestMethod.GET)
    public FormVO getForm() {
        FormVO formVO = new FormVO();
        List<Cell> cells = new LinkedList<Cell>();

        formVO.setFormName("FormVO Name");

        Cell cell1 = new Cell();
        cell1.setWidthh(100.8);
        cell1.setHeightt((double) 40);
        cell1.setFontSize((double) 16);
        cell1.setValuee("院系");
        Cell cell2 = new Cell();
        cell2.setWidthh(179.2);
        cell2.setHeightt((double) 40);
        cell2.setFontSize((double) 16);
        cell2.setValuee("计算机系");
        cells.add(cell1);
        cells.add(cell2);
        Cell cell3 = new Cell();
        cell3.setWidthh(100.8);
        cell3.setHeightt((double) 40);
        cell3.setFontSize((double) 16);
        cell3.setValuee("专业");
        Cell cell4 = new Cell();
        cell4.setWidthh(179.2);
        cell4.setHeightt((double) 40);
        cell4.setFontSize((double) 16);
        cell4.setValuee("计算机科学与技术");
        cells.add(cell3);
        cells.add(cell4);
        Cell cell5 = new Cell();
        cell5.setWidthh(100.8);
        cell5.setHeightt((double) 40);
        cell5.setFontSize((double) 16);
        cell5.setValuee("学号");
        Cell cell6 = new Cell();
        cell6.setWidthh(179.2);
        cell6.setHeightt((double) 40);
        cell6.setFontSize((double) 16);
        cell6.setValuee("2014101010100");
        cells.add(cell5);
        cells.add(cell6);

        Cell cell7 = new Cell();
        cell7.setWidthh(100.8);
        cell7.setHeightt((double) 40);
        cell7.setFontSize((double) 16);
        cell7.setValuee("姓名");
        Cell cell8 = new Cell();
        cell8.setWidthh(179.2);
        cell8.setHeightt((double) 40);
        cell8.setFontSize((double) 16);
        cell8.setValuee("张三");
        cells.add(cell7);
        cells.add(cell8);
        Cell cell9 = new Cell();
        cell9.setWidthh(100.8);
        cell9.setHeightt((double) 40);
        cell9.setFontSize((double) 16);
        cell9.setValuee("性别");
        Cell cell10 = new Cell();
        cell10.setWidthh(179.2);
        cell10.setHeightt((double) 40);
        cell10.setFontSize((double) 16);
        cell10.setValuee("男");
        cells.add(cell9);
        cells.add(cell10);
        Cell cell11 = new Cell();
        cell11.setWidthh(100.8);
        cell11.setHeightt((double) 40);
        cell11.setFontSize((double) 16);
        cell11.setValuee("出生年月");
        Cell cell12 = new Cell();
        cell12.setWidthh(179.2);
        cell12.setHeightt((double) 40);
        cell12.setFontSize((double) 16);
        cell12.setValuee("1996-02");
        cells.add(cell11);
        cells.add(cell12);

        Cell cell13 = new Cell();
        cell13.setWidthh(100.8);
        cell13.setHeightt((double) 40);
        cell13.setFontSize((double) 16);
        cell13.setValuee("民族");
        Cell cell14 = new Cell();
        cell14.setWidthh(179.2);
        cell14.setHeightt((double) 40);
        cell14.setFontSize((double) 16);
        cell14.setValuee("汉族");
        cells.add(cell13);
        cells.add(cell14);
        Cell cell15 = new Cell();
        cell15.setWidthh(100.8);
        cell15.setHeightt((double) 40);
        cell15.setFontSize((double) 16);
        cell15.setValuee("籍贯");
        Cell cell16 = new Cell();
        cell16.setWidthh(179.2);
        cell16.setHeightt((double) 40);
        cell16.setFontSize((double) 16);
        cell16.setValuee("广东省珠海市");
        cells.add(cell15);
        cells.add(cell16);
        Cell cell17 = new Cell();
        cell17.setWidthh(100.8);
        cell17.setHeightt((double) 40);
        cell17.setFontSize((double) 16);
        cell17.setValuee("政治面貌");
        Cell cell18 = new Cell();
        cell18.setWidthh(179.2);
        cell18.setHeightt((double) 40);
        cell18.setFontSize((double) 16);
        cell18.setValuee("群众");
        cells.add(cell17);
        cells.add(cell18);


        Cell cell19 = new Cell();
        cell19.setWidthh(100.8);
        cell19.setHeightt((double) 40);
        cell19.setFontSize((double) 16);
        cell19.setValuee("手机号码");
        Cell cell20 = new Cell();
        cell20.setWidthh(179.2);
        cell20.setHeightt((double) 40);
        cell20.setFontSize((double) 16);
        cell20.setValuee("13075600000");
        cells.add(cell19);
        cells.add(cell20);
        Cell cell21 = new Cell();
        cell21.setWidthh(100.8);
        cell21.setHeightt((double) 40);
        cell21.setFontSize((double) 16);
        cell21.setValuee("家庭住址");
        Cell cell22 = new Cell();
        cell22.setWidthh(459.2);
        cell22.setHeightt((double) 40);
        cell22.setFontSize((double) 16);
        cell22.setValuee("广东省珠海市某某区某某路某某小区某某楼某单元某房");
        cells.add(cell21);
        cells.add(cell22);
        for (int i = 0; i < 4; i++) {
            Cell cell = new Cell();
            cell.setWidthh(100.8);
            cell.setHeightt((double) 220);
            cell.setFontSize((double) 16);
            cell.setValuee("key");
            Cell cell23 = new Cell();
            cell23.setWidthh(739.2);
            cell23.setHeightt((double) 220);
            cell23.setFontSize((double) 16);
            cell23.setValuee("value");
            cells.add(cell);
            cells.add(cell23);
            formVO.setCellList(cells);
        }
        return formVO;
    }


}
