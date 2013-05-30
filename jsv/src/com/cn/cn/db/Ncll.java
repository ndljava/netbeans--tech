/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.cn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Ncll {
    
    public Ncll() {
    }
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ncll.class.getName()).log(Level.SEVERE, null, ex);
        }
        //?characterEncoding=GBK
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
            
            
            Statement stat = con.createStatement();
            
            ResultSet rs = stat.executeQuery("select * from DB");
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
            }
            
            rs.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Ncll.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
}
