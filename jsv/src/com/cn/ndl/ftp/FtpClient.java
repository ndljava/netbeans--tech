/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.ndl.ftp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPSClient;
import org.apache.commons.net.util.TrustManagerUtils;

/**
 *
 * @author Administrator
 */
public class FtpClient {

    private FTPSClient fclient;
    private Vector<String> filterVec;

    public FtpClient() {
        this.init();
    }

    public FtpClient(FTPSClient fclient) {
        this.fclient = fclient;
    }

    private void init() {
        fclient = new FTPSClient();

    }

    public void connect(String host, int port) {
        try {
            fclient.connect(host, port);
        } catch (SocketException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void connect(String host) {
        try {
            fclient.connect(host);
        } catch (SocketException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void login(String user, String pwd) {

        try {
            fclient.login(user, pwd);
            fclient.setListHiddenFiles(false);

            fclient.setConnectTimeout(99999);

            fclient.changeWorkingDirectory("/");
        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void forFiles(String path) {
        this.itoreFiles(path);
    }

    public void itoreFiles(String path) {

        System.out.println(path);

        try {
            fclient.changeWorkingDirectory(path);
            fclient.enterLocalPassiveMode();
            fclient.setListHiddenFiles(false);

        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }



        try {

            FTPFile[] ffs = fclient.mlistDir();

            for (FTPFile ff : ffs) {

                if (this.isFilter(ff.getName())) {
                    continue;
                }

                if (ff.isFile()) {
                    System.out.println("文件" + ff.getName() + "|" + ff.getRawListing());
                    System.out.println("content:" + this.readFile(path + "/" + ff.getName()));

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }


            }

            ffs = fclient.listDirectories();

            for (FTPFile ff : ffs) {

                if (this.isFilter(ff.getName())) {
                    continue;
                }

                if (ff.isDirectory()) {
                    System.out.println("目录" + ff.getName() + "|" + ff.getRawListing());
                    this.itoreFiles(path + "/" + ff.getName() + "/");
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String readFile(String path) {

        FTPSClient fsc = new FTPSClient();
        try {
            fsc.connect("192.168.10.16");
            fsc.login("config", "leyou999");
            fsc.changeWorkingDirectory(path.substring(0, path.lastIndexOf("//")));
            fsc.setDefaultTimeout(999);
            fsc.setDataTimeout(999);

            fsc.setBufferSize(1024);

        } catch (SocketException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            //FTPFile ff=fsc.list(path)
            System.out.println("==" + fsc.listDirectories(path).length + "exist" + path);
        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }


        String s = "";
//        int i = 3;

        try {

            System.out.println(path + "----");
            InputStream is = fsc.retrieveFileStream(path);

            System.out.println(is.available());

            byte[] b = new byte[is.available()];
            is.read(b, 0, is.available());
            //is.close();

            s = new String(b);

            fsc.logout();
            fsc.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        return s;
    }

    public void close() {
        try {
            fclient.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(FtpClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Boolean isFilter(String fname) {

        for (int i = 0; i < this.filterVec.size(); i++) {

            if (fname.equals(this.filterVec.get(i))) {
                return true;
            }
        }

        return false;
    }

    public void setFilterVec(Vector<String> filterVec) {
        this.filterVec = filterVec;
    }

    public FTPSClient getFclient() {
        return fclient;
    }
}
