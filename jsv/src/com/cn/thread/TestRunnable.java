/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.thread;

/**
 *
 * @author Administrator
 */
public class TestRunnable implements Runnable {

    @Override
    public void run() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i + "ok");
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 10) {
                TestRunnable t = new TestRunnable();
                
                new Thread(t, "子线程0").start();
                new Thread(t, "子线程1").start();
            }

        }

    }
}
