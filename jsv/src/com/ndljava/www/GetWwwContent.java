/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndljava.www;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class GetWwwContent {
    
    public static void getContent(String url){
        try {
            InputStream is=new URL(url).openConnection().getInputStream();
            System.out.println(new URL(url).getContent().toString());
            
            int i=0;
            byte b[]=new byte[1024];
            while((i=is.read(b))==-1){
                System.out.println(new String(b));
                
            }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(GetWwwContent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GetWwwContent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
