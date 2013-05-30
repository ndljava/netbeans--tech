/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndl.cn;

/**
 *
 * @author Administrator
 */
public class Point {

    private int dx = 0;
    private int dy = 0;

    public Point() {
    }

    public Point(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    @Override
    public String toString() {
        return "Point{" + "dx=" + dx + ", dy=" + dy + '}';
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }
}
