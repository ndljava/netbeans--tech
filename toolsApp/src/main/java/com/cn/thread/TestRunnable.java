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

    private int k = 0;
    public boolean bo = false;

    @Override
    public void run() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        while (true) {
            if (bo) {
                System.out.println(Thread.currentThread().getName() + " " + k + "ok");
                k--;
            } else {
                System.out.println(Thread.currentThread().getName() + " " + k + "ok");
                k++;
            }
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
