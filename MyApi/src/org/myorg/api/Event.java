/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.api;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Event {
    private Date date;
    private int index;
    private static int count;
    
    
    public Event() {
        date=new Date();
        index=count++;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Event{" + "date=" + date + ", index=" + index + '}';
    }
    
    
}
