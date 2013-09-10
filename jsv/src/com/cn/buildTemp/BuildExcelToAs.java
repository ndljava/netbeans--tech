/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.buildTemp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author Administrator
 */
public class BuildExcelToAs {

    private String filePath;
    private String templetePath;
    private String outputPath;
    /**
     * 输出ui
     */
    private JTextArea tarea;

    public BuildExcelToAs() {
    }

    public void buildFiles() {

        if (filePath == null) {
            JOptionPane.showMessageDialog(null, "文件路径错误!!!");
        }

        File f = new File(filePath);
        File[] flist = f.listFiles();

        File tmpfile;
        for (int i = 0; i < flist.length; i++) {
            tmpfile = flist[i];
            if (tmpfile.exists()) {
                readExcelFile(tmpfile);
            }
        }

    }

    private void readFiles() {
    }

    private void readExcelFile(File f) {

        if (!f.getName().endsWith(".xls") && !f.getName().endsWith(".xlsx")) {

            System.out.println(f.getAbsolutePath() + " 不是excel文件");
            return;
        } else {
            System.out.println(f.getAbsolutePath());
        }

        Workbook wb = null;

        try {

            wb = WorkbookFactory.create(new FileInputStream(f));
            int sheetCount = wb.getNumberOfSheets();

            System.out.println(f.getName() + "有" + sheetCount + "sheet");

            Sheet sheet;
            Row row;
            Cell cell;



            for (int i = 0; i < sheetCount; i++) {

                sheet = wb.getSheetAt(i);
                System.out.println(sheet.getSheetName() + "总行数" + (sheet.getLastRowNum() + 1));

                for (Iterator<Row> irow = sheet.rowIterator(); irow.hasNext();) {

                    row = irow.next();
                    for (Iterator<Cell> icell = row.cellIterator(); icell.hasNext();) {

                        cell = icell.next();
                        System.out.println(cell.getColumnIndex() + "|" + cell.getRowIndex());

                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_BLANK:
                              //  System.out.println(cell.getHyperlink());
                                break;
                            case Cell.CELL_TYPE_BOOLEAN:
                                System.out.println(cell.getBooleanCellValue());
                                break;
                            case Cell.CELL_TYPE_ERROR:
                                break;
                            case Cell.CELL_TYPE_FORMULA:
                                System.out.println(cell.getCellFormula());
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                                if(DateUtil.isCellDateFormatted(cell)){
                                    System.out.println(cell.getDateCellValue());
                                }else{
                                    System.out.println(cell.getNumericCellValue());
                                }
                                
                                break;
                            case Cell.CELL_TYPE_STRING:
                                System.out.println(cell.getRichStringCellValue().getString());
                                break;
                        }

                    }

                    System.out.println();
                }


            }



        } catch (IOException | InvalidFormatException ex) {
            Logger.getLogger(BuildExcelToAs.class.getName()).log(Level.SEVERE, null, ex);
        }




    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getTempletePath() {
        return templetePath;
    }

    public void setTempletePath(String templetePath) {
        this.templetePath = templetePath;
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }
}
