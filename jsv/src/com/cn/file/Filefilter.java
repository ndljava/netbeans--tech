/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class Filefilter {

    private String strDir = "E:\\uitable\\dragon";
    private String xmlStr;
    private String cssStr;
    private StringBuffer sbc;

    public Filefilter() {
    }

    public void readFiles(String path) {
        sbc = new StringBuffer();
        this.forFiles(path);

    }

    private void forFiles(String path) {

        File f = new File(path);
        File[] fs = f.listFiles();

        for (int i = 0; i < fs.length; i++) {

            if (fs[i].isFile() && fs[i].getName().endsWith(".xml") && !fs[i].getName().endsWith("preRes.xml")) {
                //System.out.println(fs[i].getAbsolutePath());
                this.readFile(fs[i]);

            } else if (fs[i].isDirectory() && fs[i].getName().indexOf("Table") == -1) {
                forFiles(fs[i].getAbsolutePath());
            }

        }

    }

    public void readlocalFiles(String path) {
        sbc = new StringBuffer();
        this.forlocalFiles(path);

    }

    private void forlocalFiles(String path) {

        File f = new File(path);
        File[] fs = f.listFiles();

        for (int i = 0; i < fs.length; i++) {

            if (fs[i].isFile() && fs[i].getName().endsWith(".mxml") && !fs[i].getName().endsWith("preRes.xml")) {
                System.out.println(fs[i].getAbsolutePath());
                this.readFile(fs[i]);
            } else if (fs[i].isDirectory()) {
                forlocalFiles(fs[i].getAbsolutePath());
            }

        }

    }

    /**
     *
     *
     *
     *
     *
     */
    private void readFile(File f) {
        try {

            RandomAccessFile raf = new RandomAccessFile(f, "r");
            String fff;
            String fpatten;
            fff = raf.readLine();

            while (fff != null) {
                if (!fff.trim().startsWith("<mx:Image") && !fff.trim().startsWith("<mx:Style") && !fff.trim().startsWith("<!--") && (fff.indexOf("icon") > -1 || fff.indexOf("source") > -1)) {
                   // System.out.println(fff);

                    Pattern pt = Pattern.compile("(source|icon)=\"(@Embed\\(source=\')?(.*?)\'?\\)\"");
                    Matcher mc = pt.matcher(fff);
                    while (mc.find()) {
                        fpatten = mc.group(3);
                        //System.out.println(fpatten+"=="+mc.groupCount());
                        if (fpatten.endsWith(".css")) {
                            break; 
                        }

                        fpatten = fpatten.replaceAll("\\.\\.\\/", "").replace("assets/", "");

                        if (this.xmlStr.indexOf(fpatten) == -1) {

                            if (sbc.indexOf("<res cacheType=\"2\" url=\"" + fpatten + "\"/>") == -1) {

                                sbc.append("<res cacheType=\"2\" url=\"" + fpatten + "\"/>");
                                System.out.println("<res cacheType=\"2\" url=\"" + fpatten + "\"/>");

                            }
                        }
                    }

                }

                fff = raf.readLine();
            }

            raf.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Filefilter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Filefilter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void readCssFile(String path) {

        this.readFile(new File(path));


    }

    public void readTempFile(String path) {

        System.out.println(path);
        try {

            RandomAccessFile raf = new RandomAccessFile(new File(path), "r");
            String fff;
            fff = raf.readLine();

            StringBuffer sb = new StringBuffer();

            while (fff != null) {
                sb.append(fff);
                fff = raf.readLine();
            }

            this.xmlStr = sb.toString();

            raf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Filefilter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Filefilter.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public static void main(String[] args) {

//        String strDir = "E:\\uitable\\dragon";
        String strDir = "E:\\IGG\\gameUI\\DragonGameUI\\src";
        Filefilter ff = new Filefilter();

        ff.readTempFile("F:\\table\\config\\preRes.xml");
//        ff.readFiles(strDir);
        ff.readlocalFiles(strDir);
        //ff.readCssFile("F:\\table\\skin\\flex_skins.css");


    }
}
