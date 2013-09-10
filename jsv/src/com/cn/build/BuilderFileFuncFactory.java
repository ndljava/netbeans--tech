/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.build;

import com.cn.buildTemp.BuildXmlToAs;
import com.cn.vo.BuildReadFileVo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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

            Element e = ele.elements().get(0);

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
            Logger.getLogger(BuildXmlToAs.class.getName()).log(Level.SEVERE, null, ex);
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
        System.out.println("解析excel" + f.getAbsolutePath());

        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(f));

            int sheetCount = wb.getNumberOfSheets();

            System.out.println("读取excel文件" + f.getName());
            System.out.println("总共" + sheetCount + "个sheet");


            Sheet sheet;
            Row row;
            Cell cell;

            boolean isCommentRow = false;
            boolean isFieldRow = false;

            StringBuilder fieldName = new StringBuilder();
            StringBuilder fieldContent = new StringBuilder();
            Map<String, BuildReadFileVo> vec = new HashMap<String, BuildReadFileVo>();

            String cellStr;
            String[] commentStr;

            for (int i = 0; i < sheetCount; i++) {

                sheet = wb.getSheetAt(i);

                fieldContent.setLength(0);
                fieldName.setLength(0);

                for (Iterator<Row> irow = sheet.rowIterator(); irow.hasNext();) {

                    row = irow.next();


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

                                if (isCommentRow && isFieldRow) {

                                    fieldName.append("\t\t/**\n");

                                    commentStr = sheet.getRow(row.getRowNum() - 1).getCell(cell.getColumnIndex()).getRichStringCellValue().getString().split("\n");

                                    for (int c = 0; c < commentStr.length; c++) {
                                        fieldName.append("\t\t*\t" + commentStr[c] + "\n");
                                    }

                                    fieldName.append("\t\t*/\n");


                                    fieldName.append("\t\tprivate var " + cellStr + ":String;\n\n");

                                    fieldContent.append("\t\t\tthis." + cellStr + "=data.@" + cellStr + ";\n");

                                }


                                if ((cellStr.trim().startsWith("Index") || cellStr.trim().startsWith("Id")) && !isCommentRow) {
                                    isCommentRow = true;
                                }

                                break;
                        }
                    }

                    if (isCommentRow && isFieldRow) {
                        vec.put(sheet.getSheetName(), new BuildReadFileVo(fieldName, fieldContent));

                        isCommentRow = isFieldRow = false;
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

        } catch (IOException | InvalidFormatException ex) {
            Logger.getLogger(BuilderFileFuncFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
