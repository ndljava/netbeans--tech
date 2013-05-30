/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.cn.db;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Administrator
 */
public class sockettest {

    private Socket sk;

    public sockettest() throws UnknownHostException, IOException {
        this.sk = new Socket("localhost", 3306);
        this.init();
    }

    private void init() throws IOException {
        
        InputStream is = this.sk.getInputStream();
        byte[] b = new byte[32];
        int i = -1;
        
        while ((i = is.read(b)) != -1) {
            System.out.println(new String(b,"utf8") + "====");
        }

    }
    
    public static void main(String[] args) throws IOException {
        new sockettest();
    }
}
