/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.buildTemp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * xdgnhdc最多时发现根本房产过户费等与人谈话
 *
 * @author Administrator
 */
public class BuildXmlToAs {

    private String pathStr;
    private String tmpStr;
    private String content = "";
    private String filename;
    private String outputDir;
    private JTextArea textArea;

    public BuildXmlToAs() {
    }

    public void buildFiles() {
        File f = new File(pathStr);

        if (!f.exists()) {
            System.out.println("file not exists");
            return;
        }

        File fi;
        for (int i = 0; i < f.listFiles().length; i++) {
            fi = f.listFiles()[i];
            if (fi.exists() && fi.getPath().endsWith("xml")) {
                readTmpFile(fi.getName());
                readXmlFile(fi);
                writeFile(fi.getParent());
            }
        }
    }

    private void readTmpFile(String fn) {

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

            content = "";
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                content += br.readLine() + "\n";
            }
            br.close();

            fn = fn.replace(".xml", "");
            filename = "T" + fn.substring(0, 1).toUpperCase() + fn.substring(1);
            content = content.replaceAll("#classname#", filename);

            //System.out.println(content);


        } catch (FileNotFoundException ex) {
            Logger.getLogger(BuildXmlToAs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BuildXmlToAs.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void readXmlFile(File f) {
        try {
            SAXReader sr = new SAXReader();
            Document doc = sr.read(f);
            Element ele = doc.getRootElement();

            // System.out.println(ele.getName() + "===" + ele.getPath());

            Iterator<Attribute> itN;

            Element e = ele.element("item");

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
            
            //注册机制
            content = content.replace("#fieldvalue#", fieldContent.toString()).replace("#fieldname#", fieldName.toString());

        } catch (DocumentException ex) {
            Logger.getLogger(BuildXmlToAs.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeFile(String fpath) {

        if ("".equals(content.toString())) {
            System.out.println("content not found");
            return;
        }

        String outpath = fpath;

        if (outputDir != null) {
            outpath = outputDir + "\\" + filename + ".as";
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
            bw.close();

            textArea.append(outpath + "\n");

        } catch (IOException ex) {
            Logger.getLogger(BuildXmlToAs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void WriteXMLFile(String fi, String fpath) {
        try {
            XMLWriter xw = new XMLWriter(new FileWriter(fi));
            xw.write(fi);
            xw.close();
        } catch (IOException ex) {
            Logger.getLogger(BuildXmlToAs.class.getName()).log(Level.SEVERE, null, ex);
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
}
