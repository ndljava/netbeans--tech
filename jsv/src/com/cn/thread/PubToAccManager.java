/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class PubToAccManager {

    private final StepExec st;

    public PubToAccManager(StepExec st) {
        this.st = st;
    }

    public synchronized void pub() {


        while (this.st.getVec().size() > 0) {
            try {
                System.out.println("111111");
                this.wait();
                System.out.println("22222");
            } catch (InterruptedException ex) {
                Logger.getLogger(PubToAccManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        for (int i = 0; i < 20; i++) {
            this.st.addVec("心动过缓" + i);
        }
        
        
        this.notify();


    }

    public synchronized void acc() {

        while (this.st.getVec().size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(PubToAccManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.st.popVec();
        this.notify();


    }

    public static void main(String[] args) {

        StepExec se = new StepExec();
        final PubToAccManager pa = new PubToAccManager(se);

       while(true){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    pa.pub();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    pa.acc();
                }
            }).start();
            
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(PubToAccManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }
}
