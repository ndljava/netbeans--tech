/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.ndl.ftp;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPSClient;
import org.apache.commons.net.ftp.FTPSSocketFactory;

/**
 *
 * @author Administrator
 */
public class ftptest {

    public static void main(String[] args) {

        FTPSClient fsc = new FTPSClient();
        FtpClient fc = new FtpClient(fsc);
        
        fc.connect("192.168.10.16");
        fc.login("config", "leyou999");
        
        Vector<String> vs=new Vector<String>();
        vs.add(".");
        vs.add("..");
        
        fc.setFilterVec(vs);
        
//        fc.readFile("//dragon//GameUI//AutionWnd.xml");
        fc.readFile("//dragon//GameUI//BackpackWnd.xml");
//        fc.forFiles("/");
        
//        try {
//            FTPFile[] ff=fsc.listDirectories();
//            for(FTPFile ftpf:ff){
//                System.out.println(ftpf.getName());
//                
//            }
//            
//            
//        } catch (IOException ex) {
//            Logger.getLogger(ftptest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        
        try {
            fsc.disconnect();
            fsc.logout();
        } catch (IOException ex) {
            Logger.getLogger(ftptest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
