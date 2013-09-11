/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.build;

import com.cn.buildTemp.BuildXmlToAs;
import com.cn.ndl.enums.BuilderFileEnum;
import com.cn.vo.BuildReadFileVo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Administrator
 */
public class BuilderImp {

    /**
     * 原始文件
     */
    private String pathStr;
    /**
     * 模版文件
     */
    private String tmpStr;
    /**
     * 内容
     */
    private String content = "";
    private String tmpContent;
    private String filename;
    /**
     * 输出目录
     */
    private String outputDir;
    private String elementName;
    private JTextArea textArea;
    public boolean isChildDir = false;
    /*
     * 文件类型
     */
    private int fileType;

    public BuilderImp() {
    }

    /*
     
     读取as模版文件
     */
    private void readTmpFile() {

        File f;
        if (tmpStr.startsWith("/")) {
            f = new File(ClassLoader.getSystemClassLoader().getResource("//").getFile() + "com/cn/buildTemp/" + tmpStr);
        } else {
            f = new File(tmpStr);
        }

        if (!f.exists() || !f.getName().endsWith(".as")) {
            System.out.println("temp file not exists" + f.getAbsolutePath());
            return;
        }

        try {

            tmpContent = "";
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                tmpContent += br.readLine() + "\n";
            }

            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BuildXmlToAs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BuilderImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void replaceTmp(String fn, BuildReadFileVo vo) {

        content = tmpContent;

        filename = "T" + fn.substring(0, 1).toUpperCase() + fn.substring(1);
        content = content.replaceAll("#classname#", filename);

        content = content.replace("#fieldvalue#", vo.getFieldContent().toString()).replace("#fieldname#", vo.getFieldName().toString());
    }

    /*
     写入as文件
     */
    private void writeFile(String fpath) {

        if ("".equals(content.toString())) {
            System.out.println("content not found");
            return;
        }

        String outpath = fpath;

        if (outputDir != null) {
            outpath = outputDir + "\\" + filename + ".as";
        } else {
            outpath = outpath + "\\" + filename + ".as";
        }

        File f = new File(outputDir);
        if (!f.exists()) {
            f.mkdirs();
        }

        System.out.println(outpath);

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(outpath, false));
            bw.write(content);
            bw.flush();

            textArea.append(outpath + "\n");

        } catch (IOException ex) {
            Logger.getLogger(BuildXmlToAs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void buildFiles(int fileType) {
        File f = new File(pathStr);

        if (!f.exists()) {
            System.out.println("file not exists");
            return;
        }

        this.fileType = fileType;
        //读模版
        readTmpFile();
        buildFileList(f);
    }

    private void buildFileList(File f) {
        System.out.println(f.getAbsolutePath());
        File fi;
        for (int i = 0; i < f.listFiles().length; i++) {
            fi = f.listFiles()[i];
            if (fi.exists() && !fi.isHidden()) {
                if (fi.isFile()) {
                    buildModel(fi, this.fileType);
                } else {
                    if (this.isChildDir) {
                        buildFileList(fi);
                    }
                }
            }
        }

    }

    private void buildModel(File f, int filetype) {

        Map<String, BuildReadFileVo> rs;
        switch (filetype) {
            case BuilderFileEnum.BUILD_FILE_TYPE_XML:
                if (f.getPath().endsWith("xml")) {
                    rs = BuilderFileFuncFactory.readXmlFile(f);
                } else {
                    return;
                }
                break;
            case BuilderFileEnum.BUILD_FILE_TYPE_EXCEL:
                if (f.getPath().endsWith("xls") || f.getPath().endsWith("xlsx")) {
                    rs = BuilderFileFuncFactory.readExcelFile(f);
                } else {
                    return;
                }
                break;
            default:
                return;
        }

        if (rs == null) {
            System.out.println("文件" + f.getAbsolutePath() + "解析失败!!!");
            return;
        }

        String key;
        Iterator<String> keys = rs.keySet().iterator();

        while (keys.hasNext()) {
            key = keys.next();
            System.out.println(key);
            //System.out.println(rs.get(key).getFieldName());

            replaceTmp(key, rs.get(key));


            writeFile(key);
        }


    }

    public String getPathStr() {
        return pathStr;
    }

    public void setPathStr(String pathStr) {
        this.pathStr = pathStr;
    }

    public String getTmpStr() {
        return tmpStr;
    }

    public void setTmpStr(String tmpStr) {
        this.tmpStr = tmpStr;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }
}
