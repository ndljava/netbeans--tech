/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndl.cn;

/**
 *
 * @author Administrator
 */
public abstract class Shap {

    protected ShapImp shap;

    protected void initShapImp() {
        shap = ShapImpFactory.getShapImp();
    }

    protected abstract void drawShap();
    
    /**
     * 
     * 
     MyEditorTopComponent.jTextField1.text=jTextField1
MyEditorTopComponent.jTextField2.text=jTextField2
MyEditorTopComponent.jButton1.text=jButton1
     */
}
