/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import com.ndl.cn.Point;

/**
 *
 * @author Administrator
 */
public class Uobj {

    public int i = 10;

    public static void main(String[] args) {

        System.out.println("sss");

        Point p = new Point();
        System.out.println(p);
        Point p2 = p;
        p2.setDx(2);
        System.out.println(p2);
        p = null;
        // p.setDx(3);
        System.out.println(p2);
        System.out.println(p);
        
        
        System.out.println("ndljava");
        
        

//        Vector<Point> vu = new Vector<Point>();
//
//        vu.add(p);
//
//        for (Point o : vu) {
//            System.out.println(o.toString());
//        }
//
//        Vector<Point> vu2 = new Vector<Point>();
//
//        vu2.add(vu.get(0));
//
//        vu.add(0, null);
//        vu.removeAllElements();
//        p=null;
//        
//        System.gc();
//        
//        System.out.println("fff" + vu.size());
//
//        for (Point o : vu2) {
//            System.out.println(o.toString());
//        }
//
//        System.out.println("fff" + vu2.size());
//        for (Point o : vu) {
//            System.out.println(o.toString());
//        }


    }
}
