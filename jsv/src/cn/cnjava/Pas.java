/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.cnjava;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Pas {
    
    private String s;
    private int i;
    private Date d;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Date getD() {
        return d;
    }

    @Override
    public String toString() {
        return "Pas{" + "s=" + s + ", i=" + i + ", d=" + d + '}';
    }
    
    
    
}
