/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.file;

import java.io.File;
import java.io.FileFilter;
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
public class MatchFilePrint {

    public MatchFilePrint() {
    }

    public MatchFilePrint(String s) {
        this.init(s);
    }

    private void init(String s) {

        File f = new File(s);

        File[] fs = f.listFiles();

        this.readFiles(fs);
    }

    private void readFiles(File[] s) {

        File ff;

        for (int i = 0; i < s.length; i++) {
            ff = s[i];

            if (ff.isDirectory()) {

                this.readFiles(ff.listFiles());

            } else if (ff.isFile() && ff.getName().endsWith(".as")) {

//                System.out.println(ff.getAbsolutePath());
//                System.out.println(ff.getName());
                this.matchFile1(ff);
            }

        }

    }

    private void matchFile1(File f) {

        if (f.exists()) {

            try {

                RandomAccessFile raf = new RandomAccessFile(f.getAbsolutePath(), "r");

                String fff;
                String fpatten;

                fff = raf.readLine();

                while (fff != null) {

//                  System.out.println(fff);
//                  Pattern patt = Pattern.compile("^(\s|\t|\r)*?[^(\/\/|trace)].*?\"([\u0391-\uFFE5]+?)");
//                  Pattern patt = Pattern.compile("[\\u0391-\\uFFE5]+?");
//                  Pattern patt = Pattern.compile("[\\u4E00-\\u9FA5]+");
                    Pattern patt = Pattern.compile("[\u4E00-\u9FA5]");

                    Matcher ma = patt.matcher(new String(fff.getBytes(), "utf-8"));
//                    Matcher ma = patt.matcher(fff);

//                  System.out.println(ma.find());
                    while (ma.find()) {
                        System.out.println(ma.group(0));
                    }

                    fff = raf.readLine();

                }

                raf.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(MatchFilePrint.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MatchFilePrint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("ndljava");

        new MatchFilePrint("E:\\flash\\pro6\\DragonOnline\\src\\com");
        System.out.println("========================");
        new MatchFilePrint("E:\\flash\\pro6\\DragonOnlineData\\src\\com");
        System.out.println("========================");
        new MatchFilePrint("E:\\flash\\pro6\\TableLib\\src\\com");

        Pattern patt = Pattern.compile("[\u4E00-\u9FA5]");

        Matcher ma = patt.matcher("店提供的认同感和");
        System.out.println(ma.find());
    }

}
