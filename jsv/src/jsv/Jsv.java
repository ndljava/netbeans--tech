/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsv;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Jsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        InputStream is = null;
        try {
            // TODO code application logic here
            System.out.println("ndljava");
            is = new URL("http://www.163.com").openConnection().getInputStream();

            int i = 0;
            byte b[] = new byte[1024];

            while ((i = is.read(b)) != -1) {
                System.out.println(new String(b, "gb2312"));
            }

        } catch (IOException ex) {
            Logger.getLogger(Jsv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(Jsv.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
