/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.cnjava;

import java.io.File;

/**
 *
 * @author Administrator
 */
public class kbs {

    public static void main(String[] args) {

        P2 ps = new P2();
        ps.setI(4);
        ps.setS("gggggggggg");

        System.out.println(ps.toString());

        Pas p =  ps;
        p.setI(6);
        System.out.println(p.getS()+"/"+p.getD()+"/"+p.getI());
        System.out.println(ps.toString());
        
        
        
        File f=new File("c:");
        
       // System.out.println(f.);
        
        String[] s=new String[20];
        
        s[3]="fff";
        
        System.out.println(s[0]);
        

    }
}
