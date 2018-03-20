package com.haibao.init.db;

import com.haibao.model.po.District;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by haibao on 2018/3/3.
 */
public class DistrictInit {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Resource resource = new ClassPathResource("最新县及县以上行政区划代码(截止2016年7月31日).xlsx");
        Workbook workbook = new XSSFWorkbook(resource.getInputStream());
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        List<District> districtList = new ArrayList<>();
        rowIterator.next();
        final int belongCountry = 0;
        int belongProv = 0;
        int belongCity = 0;
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            Cell cell0 = null;
            Cell cell1 = null;
            Cell cell2 = null;
            Cell cell3 = null;
            District district = new District();
            if (row.getLastCellNum() == 4) {
                cell0 = row.getCell(0);
                cell3 = row.getCell(3);
                switch (cell0.getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:{
                        double code = cell0.getNumericCellValue();
                        district.setDid(Integer.valueOf((int) code));
                    }break;
                    case Cell.CELL_TYPE_STRING:{
                        String code = cell0.getStringCellValue().substring(0, 6);
                        district.setDid(Integer.valueOf(Integer.valueOf(code)));
                    }
                }
                district.setDname(cell3.getStringCellValue().trim());
                district.setBelong(belongCity);
                // 2 县级行政区
                district.setDrank((byte) 2);
                district.setCreator(1);
                districtList.add(district);
            }
            if (row.getLastCellNum() == 3) {
                cell0 = row.getCell(0);
                cell2 = row.getCell(2);
                switch (cell0.getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:{
                        double code = cell0.getNumericCellValue();
                        district.setDid(Integer.valueOf((int) code));
                    }break;
                    case Cell.CELL_TYPE_STRING:{
                        String code = cell0.getStringCellValue().substring(0, 6);
                        district.setDid(Integer.valueOf(Integer.valueOf(code)));
                    }
                }
                district.setDname(cell2.getStringCellValue().trim());
                district.setBelong(belongProv);
                district.setDrank((byte) 1);
                // 1 市级行政区
                district.setCreator(1);
                districtList.add(district);
                belongCity = district.getDid();
            }
            if (row.getLastCellNum() == 2) {
                cell0 = row.getCell(0);
                cell1 = row.getCell(1);
                switch (cell0.getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:{
                        double code = cell0.getNumericCellValue();
                        district.setDid(Integer.valueOf((int) code));
                    }break;
                    case Cell.CELL_TYPE_STRING:{
                        String code = cell0.getStringCellValue().substring(0, 6);
                        district.setDid(Integer.valueOf(Integer.valueOf(code)));
                    }
                }
                district.setDname(cell1.getStringCellValue().trim());
                district.setBelong(belongCountry);
                // 0，省级行政区
                district.setDrank((byte) 0);
                district.setCreator(1);
                districtList.add(district);
                belongProv = district.getDid();
            }

        }
        String url = "jdbc:mysql://120.77.148.101:3306/general_form_system_db?useServerPrepStmts=true&rewriteBatchedStatements=true&useUnicode=true&characterEncoding=utf-8";
        String user = "haibao";
        String password = "Haibao5240.";
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection;
        PreparedStatement statement;
        connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into t_district (did, dname, drank, belong, creator) " +
                    " values (?,?,?,?,?) ";
        statement = connection.prepareStatement(sql);
        for (District d : districtList) {
            statement.setInt(1,d.getDid());
            statement.setString(2,d.getDname());
            statement.setByte(3,d.getDrank());
            statement.setInt(4,d.getBelong());
            statement.setInt(5,1);
            statement.addBatch();
        }
        statement.executeBatch();
    }
}
