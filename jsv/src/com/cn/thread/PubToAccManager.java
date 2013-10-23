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

    public PubToAccManager() {
        this.st = new StepExec();

        for (int i = 0; i < 10; i++) {
            st.addVec(i+"");
        }
    }

    public void pub() {
        int i = 0;
        while (true) {
            synchronized (st) {
//                try {
//                   // st.wait();
//
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(PubToAccManager.class.getName()).log(Level.SEVERE, null, ex);
//                }

                st.addVec(i+"");

                i++;

                if (st.getVec().size() > 10) {
                    st.notify();
                }

            }
        }

    }

    public void acc() {
        while (true) {
            synchronized (st) {
                
                st.popVec();

                if (st.getVec().size() < 1) {
                    st.notify();
                }
            }
        }


    }

    public static void main(String[] args) {

        PubToAccManager pam2 = new PubToAccManager();
        pam2.acc();

        PubToAccManager pam = new PubToAccManager();
        pam.pub();
        
        System.out.println("ffff");
    }
}
