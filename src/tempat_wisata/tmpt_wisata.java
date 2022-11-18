/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tempat_wisata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class tmpt_wisata {
    String driver   = "com.mysql.cj.jdbc.Driver";
    String db       = "jdbc:mysql://localhost/wisata";
    String user     = "root";
    String password = "";
    
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    
    public tmpt_wisata(){
        try {
            Class.forName(driver);
            System.out.println("Driver Load..");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver tidak ditemukan");
            Logger.getLogger(tmpt_wisata.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(db, user, password);
            System.out.println("Berhasil Terkoneksi :) ");
        } catch (SQLException ex) {
            System.out.println("Gagal Terkoneksi");
            Logger.getLogger(tmpt_wisata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
