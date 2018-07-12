/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndljava.www;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class getWriteLocal {

    public static void getContent(String url) {

        try {
            URL u = new URL(url);
            URLConnection uc = u.openConnection();

            Map<String, List<String>> head = uc.getHeaderFields();
            String stype = head.get("Content-Type").get(0);
            //System.out.println(stype);
            String charset = stype.split("=")[1];
            //System.out.println(charset);

            InputStream is = uc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, charset);
            BufferedReader br = new BufferedReader(isr);

            StringBuffer sb = new StringBuffer();
            String sc = br.readLine();
            String reg = "src=\"(.?+)\"";
            int i = 0;
            while (sc != null) {
                if (sc.indexOf("href=") > -1 || sc.indexOf("src=") > -1) {
                   // System.out.println("ctx:"+sc);
                    
                    Pattern pat = Pattern.compile(reg);
                    Matcher mt = pat.matcher(sc);
                    while (mt.find()) {
                        System.out.println(mt.group());
                    }
                    i++;
                }

                sb.append(sc);
                sc = br.readLine();
            }
            is.close();

            System.out.println("patten:" + i);
            System.out.println(sb);
            System.out.println(sb.length());

        } catch (MalformedURLException ex) {
            Logger.getLogger(GetWwwContent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GetWwwContent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {

        getContent("http://www.qq.com");
        //getContent("http://www.163.com");
        //getContent("http://www.xinjiangnet.com.cn/bxsy/");

    }

}
