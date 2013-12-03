/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.build;

import com.cn.vo.BuildReadFileVo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.StringUtil;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * @author Administrator
 */
public class BuilderFileFuncFactory {

    private static BuilderFileFuncFactory instance;

    /**
     * 读取xml 并生成相关数据
     *
     * key,是字段名字 value,是字段对象
     *
     */
    public static Map<String, BuildReadFileVo> readXmlFile(File f) {
        System.out.println("解析xml" + f.getAbsolutePath());
        try {
            SAXReader sr = new SAXReader();
            Document doc = sr.read(f);
            Element ele = doc.getRootElement();

            // System.out.println(ele.getName() + "===" + ele.getPath());

            Iterator<Attribute> itN;

            Element e = (Element) ele.elements().get(0);

            //System.out.println(e.getName() + "|" + e.attributeValue("id")); //+"|"+e.asXML());

            StringBuilder fieldName = new StringBuilder();
            StringBuilder fieldContent = new StringBuilder();

            itN = e.attributeIterator();
            while (itN.hasNext()) {
                Attribute a = itN.next();
//                    System.out.println(a.getName() + "|" + a.getText() + "|" + a.getValue());
                if (a.getValue().matches("^[0-9]+$")) {
                    fieldName.append("\t\tpublic var " + a.getName() + ":int;\n");
                } else {
                    fieldName.append("\t\tpublic var " + a.getName() + ":String;\n");
                }

                fieldContent.append("\t\t\tthis." + a.getName() + "=data.@" + a.getName() + ";\n");
            }

            Map<String, BuildReadFileVo> vec = new HashMap<String, BuildReadFileVo>();
            vec.put(f.getName().replace(".xml", ""), new BuildReadFileVo(fieldName, fieldContent));

            return vec;

        } catch (DocumentException ex) {
            Logger.getLogger(BuilderFileFuncFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /*
     * 
     * 通过excel生成所需的数据
     * 
     * key 为文件名 
     */
    public static Map<String, BuildReadFileVo> readExcelFile(File f) {

        /**
         * 特殊情况
         */
        Map<String, Integer> filterMap = new HashMap<String, Integer>();
        filterMap.put("missionDate", 3);
        filterMap.put("Hallows", 2);
        filterMap.put("dropPacket", -1);

        Workbook wb = null;

        try {
            wb = WorkbookFactory.create(new FileInputStream(f));
        } catch (IOException ex) {
            Logger.getLogger(BuilderFileFuncFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException ex) {
            Logger.getLogger(BuilderFileFuncFactory.class.getName()).log(Level.SEVERE, null, ex);
        }


        int sheetCount = wb.getNumberOfSheets();

        System.out.println("读取excel文件:" + f.getAbsolutePath());
        System.out.println("总共:" + sheetCount + "个sheet");

        Sheet sheet;
        Row row;
        Cell cell;

        boolean isCommentRow = false;
        boolean isFieldRow = false;

        int rowNum = 0;
        int multiline = 1;

        StringBuilder fieldName;
        StringBuilder fieldContent;
        Map<String, BuildReadFileVo> vec = new HashMap<String, BuildReadFileVo>();

        String cellStr;
        String[] commentStr;

        for (int i = 0; i < sheetCount; i++) {

            sheet = wb.getSheetAt(i);
            System.out.println("当前读取的是:" + sheet.getSheetName());

            if (sheet.getSheetName().indexOf("Sheet") > -1 || StringUtil.hasMultibyte(sheet.getSheetName())) {
                System.out.println(sheet.getSheetName() + ": 没有读取!!!");
                continue;
            }

            if (filterMap.containsKey(sheet.getSheetName())) {

                //不读
                if (filterMap.get(sheet.getSheetName()) == -1) {
                    break;
                }

                multiline = rowNum = filterMap.get(sheet.getSheetName());
            }

            fieldName = new StringBuilder();
            fieldContent = new StringBuilder();

            for (Iterator<Row> irow = sheet.rowIterator(); irow.hasNext();) {

                row = irow.next();

                if (isCommentRow && isFieldRow && rowNum > 1) {
                    rowNum--;
                    System.out.println(sheet.getSheetName() + "是多行!!!");
                    continue;
                }

                for (Iterator<Cell> icell = row.cellIterator(); icell.hasNext();) {

                    cell = icell.next();

                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_BLANK:

                            break;
                        case Cell.CELL_TYPE_BOOLEAN:

                            break;
                        case Cell.CELL_TYPE_ERROR:

                            break;
                        case Cell.CELL_TYPE_FORMULA:

                            break;
                        case Cell.CELL_TYPE_NUMERIC:

                            break;
                        case Cell.CELL_TYPE_STRING:

                            cellStr = cell.getRichStringCellValue().getString();

                            if (isCommentRow && isFieldRow && cellStr != null) {

//                                    System.out.println(cellStr+"|"+cell.getColumnIndex()+"|"+row.getRowNum() );
//                                    System.out.println(sheet.getRow(row.getRowNum() - 1));
//                                    System.out.println(sheet.getRow(row.getRowNum() - 1).getCell(cell.getColumnIndex()));
//                                    System.out.println(sheet.getRow(row.getRowNum() - 1).getCell(cell.getColumnIndex()).getRichStringCellValue());

                                fieldName.append("\t\t/**\n");
                                for (int l = multiline; l >= 1; l--) {
                                    if (sheet.getRow(row.getRowNum() - l).getCell(cell.getColumnIndex()) != null && sheet.getRow(row.getRowNum() - l).getCell(cell.getColumnIndex()).getRichStringCellValue() != null) {

                                        String preCell = sheet.getRow(row.getRowNum() - l).getCell(cell.getColumnIndex()).getRichStringCellValue().getString();

                                        if (preCell.indexOf("\n") > -1) {
                                            commentStr = preCell.split("\n");
                                            for (int c = 0; c < commentStr.length; c++) {
                                                fieldName.append("\t\t*\t" + commentStr[c] + "\n");
                                            }
                                        } else {
                                            fieldName.append("\t\t*\t" + preCell + "\n");
                                        }

                                    }
                                }

                                fieldName.append("\t\t*/\n");
                                fieldName.append("\t\tpublic var " + cellStr + ":String;\n\n");
                                fieldContent.append("\t\t\tthis." + cellStr + "=data.@" + cellStr + ";\n");
                            }

                            if ((cellStr.toLowerCase().indexOf("index") > -1 || cellStr.toLowerCase().indexOf("id") > -1) && !isCommentRow) {
                                //if (cell.getColumnIndex()==0 &&(cellStr.toLowerCase().indexOf("index") > -1 || cellStr.toLowerCase().indexOf("id") > -1) && !isCommentRow) {
                                isCommentRow = true;
                            }
                            break;
                    }
                }

                //解析完成,压入
                if (isCommentRow && isFieldRow) {
                    vec.put(sheet.getSheetName(), new BuildReadFileVo(fieldName, fieldContent));
                    System.out.println(sheet.getSheetName() + "解析完成");
                    isCommentRow = isFieldRow = false;
                    multiline = 1;
                    break;
                }

                /**
                 * 一般注释下面一行就是字段值
                 */
                if (isCommentRow) {
                    isFieldRow = true;
                }
            }

            //一个sheet就是一个文件
        }

        return vec;

//        } catch (IOException | InvalidFormatException ex) {
//            Logger.getLogger(BuilderFileFuncFactory.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //return null;
    }
}