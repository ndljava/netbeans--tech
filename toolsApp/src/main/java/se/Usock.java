/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Usock {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(9932);
            Socket s = null;
            DataInputStream dis = null;
            BufferedReader br = null;
            DataOutputStream dos = null;
            byte b[] = new byte[1024];

            System.out.println("====");
            s = ss.accept();

            dos = new DataOutputStream(s.getOutputStream());
       
            dos.writeBytes(new BufferedReader(new InputStreamReader(System.in)).readLine());
            System.out.println("----");

//                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//
//                String sr = br.readLine();
//                System.out.println(sr.length() + "===" + sr);

            dis = new DataInputStream(new BufferedInputStream(s.getInputStream()));
            System.out.println(dis.available());
            dis.read(b, 0, dis.available());
            System.out.println(new String(b));

            //Usock.rec(b);

//                while (dis.available() > 0) {
//                    System.out.println(dis.readByte());
//                }


            //   }

        } catch (IOException ex) {
            Logger.getLogger(Usock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
