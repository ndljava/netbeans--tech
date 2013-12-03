/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndl.cn;

/**
 *
 * @author Administrator
 */
public class ShapImpWindow implements ShapImp {

    @Override
    public void drawLine(Point startP, Point endP) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        System.out.println("startPoint:" + startP.toString() + "endPoint:" + endP.toString());

    }
}
