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
    private int count = 0;
    private int index = 0;

    public Event() {
        index = count++;
    }

    public Date getDate() {
        return date;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Event{" + "date=" + date + ", count=" + count + ", index=" + index + '}';
    }
}
