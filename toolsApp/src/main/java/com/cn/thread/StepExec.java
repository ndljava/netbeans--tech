/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.thread;

import java.util.Vector;

/**
 *
 * @author Administrator
 */
public class StepExec {

    private Vector vec;
    
    public StepExec() {
        this.vec=new Vector();
    }
    
    public void exec(){
        System.out.println("exec");
    }
    
    public void addVec(String str){
        if(this.vec==null)
            return ;
        
        System.out.println("add"+str);
        this.vec.add(str);
    }
    
    public void popVec(){
        if(this.vec.size()==0)
            return ;
        
        System.out.println("pop"+this.vec.lastElement());
        this.vec.remove(this.vec.size()-1);
    }
    

    public Vector getVec() {
        return vec;
    }

    public void setVec(Vector vec) {
        this.vec = vec;
    }
    
    
    
    
    
}
