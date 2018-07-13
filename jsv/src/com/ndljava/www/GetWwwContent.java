/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndljava.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
public class GetWwwContent {

    private List<String> lineStr = new ArrayList<>();
    private Map<String, String> lreg = new HashMap<>();

    public String getContent(String url) {

        StringBuffer sb = new StringBuffer();

        try {
            URL u = new URL(url);
            URLConnection uc = u.openConnection();

            Map<String, List<String>> head = uc.getHeaderFields();
            String stype = head.get("Content-Type").get(0);
            System.out.println(stype);
            String charset = "utf-8";
            if (stype.contains("=")) {
                charset = stype.split("=")[1];
                //System.out.println(charset);
            }

            InputStream is = uc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, charset);
            BufferedReader br = new BufferedReader(isr);

            String sc = br.readLine();

            int i = 0;
            while (sc != null) {
//                if (sc.indexOf("href=") > -1 || sc.indexOf("src=") > -1) {
//                     System.out.println("ctx:"+sc);

//                    Pattern pat = Pattern.compile(reg);
//                    Matcher mt = pat.matcher(sc);
//                    while (mt.find()) {
//                        System.out.println(mt.group(1));
//                    }
//                    i++;
//                }
                i++;
                this.pattenTarget(sc, i);

                sb.append(sc);
                sc = br.readLine();
//                System.out.print(i+":");
//                if(i>50)
//                    break;
            }
            is.close();

//            System.out.println(sb);
//            System.out.println(sb.length());
            return sb.toString();
        } catch (MalformedURLException ex) {
            Logger.getLogger(GetWwwContent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GetWwwContent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }

    public void pattenTarget(String ctx, int lineNum) {

        String scontent = ctx;
       // System.out.println(ctx);
        Pattern pat = null;
        Matcher mt = null;
        int i = 0;
        for (String keys : lreg.keySet()) {
            pat = Pattern.compile(lreg.get(keys));
            mt = pat.matcher(scontent);
            //System.out.println("==============================================================================================================================");
            i = 0;
            while (mt.find()) {
                //System.out.println(mt.group());
                System.out.println(mt.group(1));
                i++;
            }
            if (i > 0) {
                System.out.println(keys + " patten:" + i + ";   line:" + lineNum);
            }
        }
    }

    private void init() {

        String reg = "href=\"(.*?)\"";
        //lreg.put("href", reg);

        reg = "src=\"(.*?)\"";
        //lreg.put("src", reg);

        reg = "src=\"(.+?\\.js)\"";
        //lreg.put("js", reg);

        reg = "href=\"([^\"]+?)\\.css\"";
        //lreg.put("css", reg);

        reg = "src=\"([^\"]+?\\.png)\"";
        lreg.put("png", reg);

        reg = "src=\"([^\"]+?\\.jpg)\"";
        lreg.put("jpg", reg);

        reg = "src=\"([^\"]+?\\.gif)\"";
        lreg.put("gif", reg);

        reg = "src=\"([^\"]+?\\.(jpg|png|jpeg|gif))\"";
        lreg.put("pic", reg);
    }

    public GetWwwContent() {
        this.init();
    }

    public void startFind(String url) {

        this.getContent(url);
    }

    public static void main(String[] args) {
        GetWwwContent gw = new GetWwwContent();
        long l=new Date().getTime();
        System.out.println(l);
        gw.startFind("http://localhost:8080/");
        System.out.println(new Date().getTime()-l);
    }

}
