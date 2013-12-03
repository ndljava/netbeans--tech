/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndl.cn;

/**
 *
 * @author Administrator
 */
public class ShapImpFactory {

    public static ShapImp getShapImp() {
        return new ShapImpWindow();
    }
}
